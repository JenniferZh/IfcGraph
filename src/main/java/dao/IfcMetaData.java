package dao;

import org.neo4j.graphdb.*;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.neo4j.io.fs.FileUtils;
import model.Entity;
import model.Attribute;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * used for insert ifc class graph into neo4j
 */
public class IfcMetaData {

    private List<Entity> entityList = null;
    Map<String, String[]> selectType = null;

    private static final File databaseDirectory = new File( "D:\\Program Files\\neo4j-community-3.4.10\\data\\databases\\ifc23t.db" );

    // START SNIPPET: vars
    GraphDatabaseService graphDb;

    private enum RelTypes implements RelationshipType
    {
        HAS_ATTR,
        SUBTYPE_OF,
        LINK_TO
    }


    public IfcMetaData(String filePath) {
        try {
            SchemaFileLoader fileLoader = SchemaFileLoader.getSchemaLoader(filePath);
            entityList = fileLoader.getEntityList();
            selectType = fileLoader.getSelectType();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public IfcMetaData(List<Entity> entityList, Map<String, String[]> selectType) {
        this.entityList = entityList;
        this.selectType = selectType;
    }

    void createDb() throws IOException
    {
        FileUtils.deleteRecursively( databaseDirectory );

        // START SNIPPET: startDb
        graphDb = new GraphDatabaseFactory().newEmbeddedDatabase( databaseDirectory );
        registerShutdownHook( graphDb );

        Map<String, Long> nodeIndex = new HashMap<String, Long>();

        // START SNIPPET: transaction
        try ( Transaction tx = graphDb.beginTx() )
        {
            for (Entity entity: entityList) {
                Node entityNode = graphDb.createNode();
                //create index
                nodeIndex.put(entity.getName(), entityNode.getId());
                //set label
                Label enlabel = Label.label("Node");
                entityNode.addLabel(enlabel);
                //set properties
                List<Attribute> attrs = entity.getAttributes();
                entityNode.setProperty("name", entity.getName());
                //entityNode.setProperty("version", entity.getVersion());


                for (Attribute attr: attrs) {
                    Node attrNode = graphDb.createNode();
                    Label attrlabel = Label.label("Attribute");
                    attrNode.addLabel(attrlabel);
                    attrNode.setProperty("name", attr.getName());
                    attrNode.setProperty("index", attr.getIndex());
                    entityNode.createRelationshipTo(attrNode, RelTypes.HAS_ATTR);
                }
            }

            for (Entity entity: entityList) {
                if (entity.getParent() == null) continue;
                Long nodeId = nodeIndex.get(entity.getName());
                Long nodeParentId = nodeIndex.get(entity.getParentName());
                Node node = graphDb.getNodeById(nodeId);
                Node nodeParent = graphDb.getNodeById(nodeParentId);
                node.createRelationshipTo(nodeParent, RelTypes.SUBTYPE_OF);

                Iterable<Relationship> rels = node.getRelationships(Direction.OUTGOING, RelTypes.HAS_ATTR);

                for (Relationship rel: rels) {
                    Node attr = rel.getEndNode();
                    String attrName = (String) attr.getProperty("name");
                    String type = entity.findAttr(attrName).getType();
                    //如果这个属性引用了一个entity,建立这个关系
                    Long typeNodeId = nodeIndex.get(type);
                    if (typeNodeId != null) {
                        Node connected = graphDb.getNodeById(typeNodeId);
                        attr.createRelationshipTo(connected, RelTypes.LINK_TO);
                    }
                    //如果这个属性应用了一个**select TYPE，建立属于TYPE的关系
                    if (type.endsWith("Select")) {
                        String[] types = selectType.get(type);
                        for (String atype: types) {
                            Long typeId = nodeIndex.get(atype);
                            if (typeId != null) {
                                Node connected = graphDb.getNodeById(typeId);
                                attr.createRelationshipTo(connected, RelTypes.LINK_TO);
                            }
                        }
                    }

                }
            }
            // START SNIPPET: transaction
            tx.success();
        }
    }


    void shutDown()
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
        String path = "src\\main\\resources\\ifc4.exp";
        IfcMetaData meta = new IfcMetaData(path);

        meta.createDb();
        meta.shutDown();
    }
}
