package dao;

import org.neo4j.graphdb.*;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.neo4j.graphdb.factory.GraphDatabaseSettings;
import org.neo4j.graphdb.schema.IndexDefinition;
import org.neo4j.graphdb.schema.Schema;
import org.neo4j.io.fs.FileUtils;
import util.Element;
import util.Entity;
import util.Attribute;
import util.IfcFile;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.neo4j.helpers.collection.Iterators.loop;


public class IfcData {
    private static File databaseDirectory = new File( "D:\\Program Files\\neo4j-community-3.4.10\\data\\databases\\ifc23t.db" );
    GraphDatabaseService graphDb;

    private IfcFile ifcFile = null;

    private enum RelTypes implements RelationshipType
    {
        HAS_ATTR,
        SUBTYPE_OF,
        REF_TO
    }

    public IfcData(String filePath) throws IOException{
        ifcFile = IfcFileLoader.loadIFC(filePath);
    }

    public void createDb() throws IOException
    {
        FileUtils.deleteRecursively( databaseDirectory );

        // START SNIPPET: startDb
        graphDb = new GraphDatabaseFactory().newEmbeddedDatabase( databaseDirectory );

        registerShutdownHook( graphDb );
        long startTime=System.currentTimeMillis();
        createIndexForLineId();
        insertAll(ifcFile.getElementList(), ifcFile.getEntityMap());
        long midTime=System.currentTimeMillis();
        CreateRelation();
        long endTime=System.currentTimeMillis();
        System.out.println("插入节点"+(midTime-startTime));
        System.out.println("建立关系"+(endTime-midTime));
    }

    /**
     * insert element to database
     * @param ele element(object) to be inserted
     * @param ent entity(class) that the element belongs to
     */
    private void insert(Element ele, Entity ent) {
        if (ele == null || ent == null || ele.getAttrs().size() != ent.getAttributes().size())
            throw new IllegalArgumentException();

        try ( Transaction tx = graphDb.beginTx() )
        {

            Node dataNode = graphDb.createNode();
            String labelName = ent.getName();
            Label enlabel = Label.label(labelName);
            dataNode.addLabel(enlabel);
            dataNode.addLabel(Label.label("Element"));

            int lineId = ele.getLineID();
            dataNode.setProperty("lineId", lineId);

            List<String> attrsElement = ele.getAttrs();
            List<Attribute> attrsEntity = ent.getAttributes();

            for (int i = 0; i < attrsElement.size(); i++) {
                String attr_name = attrsEntity.get(i).getName();
                String attr_value = attrsElement.get(i);
                dataNode.setProperty(attr_name, attr_value);
            }
            tx.success();
        }
    }

    private void insertAll(List<Element> elementList, Map<String, Entity> map) {
        if (elementList == null || map == null)
            throw new IllegalArgumentException();

        try ( Transaction tx = graphDb.beginTx() )
        {
            for (Element ele: elementList) {
                Entity ent = map.get(ele.getIfcType());

                if (ent == null) continue;

                Node dataNode = graphDb.createNode();

                String labelName = ent.getName();
                Label enlabel = Label.label(labelName);
                dataNode.addLabel(enlabel);
                dataNode.addLabel(Label.label("Element"));

                int lineId = ele.getLineID();
                dataNode.setProperty("lineId", lineId);

                List<String> attrsElement = ele.getAttrs();
                List<Attribute> attrsEntity = ent.getAttributes();

                for (int i = 0; i < attrsElement.size(); i++) {
                    String attr_name = attrsEntity.get(i).getName();
                    String attr_value = attrsElement.get(i);
                    dataNode.setProperty(attr_name, attr_value);
                }

                dataNode.setProperty("IfcType", labelName);
            }

            tx.success();
        }
    }

    private boolean isMatch(String value) {
        if (value == null) throw new IllegalArgumentException();

        value = value.replaceAll(" ", "");
        //Pattern pattern = Pattern.compile("#[0-9]+|\\((#[0-9]+,)*#[0-9]+\\)");
        Pattern pattern = Pattern.compile("#[0-9]+");
        Matcher matcher = pattern.matcher(value);

        if (matcher.matches()) return true;

        if (value.startsWith("(") &&  value.endsWith(")")) {
            value = value.replaceAll("\\(|\\)", "");
            String[] parts = value.split(",");
            for (String part: parts) {
                matcher = pattern.matcher(part);
                if (!matcher.matches()) return false;
            }
            return true;
        }

        return false;
    }

    private List<String> getMatchList(String value) {
        if (value == null) throw new IllegalArgumentException();

        List<String> result = new ArrayList<>();

        Pattern pattern = Pattern.compile("#[0-9]+");
        Matcher matcher = pattern.matcher(value);
        while (matcher.find()) {
            String str = matcher.group();
            result.add(str);
        }
        return result;
    }

    private void CreateRelation() {
        try ( Transaction tx = graphDb.beginTx() ) {
            Label label = Label.label("Element");
            for (Node node : loop(graphDb.findNodes(label))) {
                Iterator<String> propsIter = node.getPropertyKeys().iterator();


                while (propsIter.hasNext()) {
                    String key = propsIter.next();
                    Object value = node.getProperty(key);

                    if (value instanceof String && isMatch((String) value)) {
                        //System.out.println(value);
                        List<String> matched = getMatchList((String) value);

                        for (String matchedId: matched) {
                            Node nodeToConnect = findNodeByLineId(matchedId);
                            //System.out.println(key);
                            // some ifc instances is excluded i.e. IfcCurve
                            if (nodeToConnect != null) {
                                node.createRelationshipTo(nodeToConnect, RelationshipType.withName(key));
                                //RelationshipType.withName(key);
                            }
                        }
                    }
                }
            }
            tx.success();
        }

    }

    private Node findNodeByLineId(String matched) {
        matched = matched.replaceAll("#", "");
        int lineID = Integer.parseInt(matched);
        Label label = Label.label("Element");

        try (Transaction tx = graphDb.beginTx(); ResourceIterator<Node> ele = graphDb.findNodes( label, "lineId", lineID )) {
            Node first = null;
            if ( ele.hasNext() )
            {
                first = ele.next();
            }
            ele.close();
            tx.success();
            return first;
        }
    }

    private void createIndexForLineId() {
        IndexDefinition indexDefinition;
        Label element = Label.label("Element");
        try ( Transaction tx = graphDb.beginTx() )
        {
            Schema schema = graphDb.schema();
            indexDefinition = schema.indexFor( element )
                    .on( "lineId" )
                    .create();
            tx.success();
            System.out.println("index success");
        }
    }



    public void shutDown()
    {
        System.out.println();
        System.out.println( "Shutting down database ..." );
        // START SNIPPET: shutdownServer
        graphDb.shutdown();
        // END SNIPPET: shutdownServer
    }

    // START SNIPPET: shutdownHook
    private static void registerShutdownHook( final GraphDatabaseService graphDb )
    {
        // Registers a shutdown hook for the Neo4j instance so that it
        // shuts down nicely when the VM exits (even if you "Ctrl-C" the
        // running application).
        Runtime.getRuntime().addShutdownHook( new Thread()
        {
            @Override
            public void run()
            {
                graphDb.shutdown();
            }
        } );
    }

    public static void main(String[] args) throws IOException {
        //String path = "src\\main\\resources\\ifc4.exp";
        long startTime=System.currentTimeMillis();
        IfcData meta = new IfcData("E:\\1万达\\模型\\WDGC-Q-AC-B01_ifc4rv.ifc");
        //IfcData meta = new IfcData("E:\\1万达\\模型\\WDGC-Q-AR-B01.ifc");
        //IfcData meta = new IfcData("E:\\\\1labdata\\\\IFC文件\\\\qhzf.ifc");
        long midTime=System.currentTimeMillis();
        System.out.println("加载文件"+(midTime-startTime));
        //IfcData meta = new IfcData("E:\\\\1labdata\\\\IFC文件\\\\qhzf.ifc"); 99176ms
        meta.createDb();
        long endTime=System.currentTimeMillis(); //获取结束时间
        System.out.println("程序运行时间： "+(endTime-startTime)+"ms");
        meta.shutDown();

    }
}
