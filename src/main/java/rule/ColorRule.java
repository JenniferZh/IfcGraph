package rule;

import java.io.File;
import java.util.*;

import dao.ResultItem;
import org.neo4j.cypher.internal.frontend.v2_3.ast.functions.Str;
import org.neo4j.graphdb.*;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.neo4j.graphdb.traversal.*;

import javax.management.relation.Relation;
import javax.swing.plaf.synth.SynthTextAreaUI;

import static org.neo4j.graphdb.RelationshipType.withName;

public class ColorRule {
    private GraphDatabaseService db;
    private int red;
    private int blue;
    private int green;

    public String ruleContent;

    public ColorRule(GraphDatabaseService db, String ruleContent, int red, int green, int blue) {
        this.db = db;
        this.ruleContent = ruleContent;
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public void checkColorForSystem(String systemName) {

        //path to find color
        List<String> colorPath = Arrays.asList("Representation","Representations","Items","StyledByItem","Styles","Styles","SurfaceColour");
        TraversalDescription traverseColor = BaseRule.findPathsDFS(colorPath, db);

        List<String> colorPath2 = Arrays.asList("HasCoverings","Representation","Representations","Items","StyledByItem","Styles","Styles","SurfaceColour");
        //List<String> colorPath2 = Arrays.asList("RelatedObjects","RelatingMaterial","RepresentedMaterial","Representations","Items","Styles","Styles","Styles","SurfaceColour");
        TraversalDescription traverseColor2 = BaseRule.findPathsDFS(colorPath2, db);

        List<String> colorPath3 = Arrays.asList( "RelatedObjects","RelatingMaterial","RepresentedMaterial","Representations","Items","Styles","Styles","Styles","SurfaceColour");
        TraversalDescription traverseColor3 = BaseRule.findPathsDFS(colorPath3, db);

        Set<Node> distributionElements = new HashSet<>();

        //find distribution elements
        try (Transaction tx = db.beginTx()) {
            ResourceIterator<Node> nodeIter = db.findNodes( Label.label("IfcSystem"), "ObjectType", systemName );
            while (nodeIter.hasNext()) {
                Node system = nodeIter.next();
                Iterable<Relationship> rels = system.getRelationships(RelationshipType.withName("IsGroupedBy"));
                for (Relationship rel : rels) {
                    if (!rel.getEndNode().hasLabel(Label.label("IfcDistributionPort")))
                        distributionElements.add(rel.getEndNode());
                }
            }
            tx.success();
        }
        //System.out.println(distributionElements.size());
        for (Node node: distributionElements) {
            List<Node> colorNodes = BaseRule.getEndNodes(traverseColor, node, db);
            if (colorNodes.size() == 1) {
                checkSingle(node, colorNodes.get(0));
            } else {
                List<Node> colorNodesForCovering = BaseRule.getEndNodes(traverseColor2, node, db);
                if (colorNodesForCovering.size() == 1) {
                    checkSingle(node, colorNodesForCovering.get(0));
                } else {
                    List<Node> colorNodesForMaterial = BaseRule.getEndNodes(traverseColor3, node, db);
                    if (colorNodesForMaterial.size() == 1) {
                        checkSingle(node, colorNodesForMaterial.get(0));
                    } else {
                        System.out.println("not found");
                    }
                }

            }
        }
    }

    public void test() {
        try ( Transaction tx = db.beginTx() ){
            Node cui1Node = db.findNode(Label.label("Element"), "lineId", 407511);

            TraversalDescription td = db.traversalDescription()
                    .breadthFirst()
                    .evaluator(Evaluators.toDepth(10))
                    .evaluator(
                            new Evaluator()
                            {
                                @Override
                                public Evaluation evaluate(final Path path )
                                {
                                    if ( path.length() == 0 )
                                    {
                                        return Evaluation.EXCLUDE_AND_CONTINUE;
                                    }
                                    String type = ( String) path.endNode().getProperty("IfcType");

                                    Relationship relationship = path.lastRelationship();

                                    long id2 = relationship.getStartNodeId();
                                    long id3 = path.endNode().getId();

                                    System.out.println(type+" "+path.length());
                                    //System.out.println(id1+" "+id2+" "+id3);

                                    if (id2 == id3 || relationship.isType(RelationshipType.withName("ContainedInStructure")) || relationship.isType(RelationshipType.withName("IsGroupedBy")) || relationship.isType(RelationshipType.withName("ObjectTypeOf")))
                                        return Evaluation.EXCLUDE_AND_PRUNE;
                                    else if (type.equals("IfcFacetedBrep"))
                                        return Evaluation.INCLUDE_AND_PRUNE;
                                    else
                                        return Evaluation.EXCLUDE_AND_CONTINUE;
                                }
                            }
                    )
                    .uniqueness( Uniqueness.NODE_PATH );


            Traverser traverser = td.traverse( cui1Node );
            PathPrinter pathPrinter = new PathPrinter( "lineId" );
            String output = "";

            for ( Path path : traverser )
            {
                output += Paths.pathToString( path, pathPrinter ) + "\n";
            }
            System.out.println(output);


            tx.success();
        }
    }

    private ResultItem checkSingle(Node distribution, Node color) {
        ResultItem item = null;
        try (Transaction tx = db.beginTx()) {
            String colorRed = (String) color.getProperty("Red");
            double red = Double.parseDouble(colorRed);

            String colorGreen = (String) color.getProperty("Green");
            double green = Double.parseDouble(colorGreen);

            String colorBlue = (String) color.getProperty("Blue");
            double blue = Double.parseDouble(colorBlue);

            int ifcLineId = (int) distribution.getProperty("lineId");
            String ifcType = (String) distribution.getProperty("IfcType");

            boolean status = false;

            if (Math.round(red*255) == this.red && Math.round(green*255) == this.green && Math.round(blue*255) == this.blue)
                status = true;

            //System.out.println(status);

            item = new ResultItem(ruleContent, ifcLineId, ifcType, status);
            System.out.println(item + " " + red*255 + " " + green*255 + " " + blue*255);
            tx.success();
        }
        return item;
    }


    String printPaths( TraversalDescription td, Node A )
    {
        try ( Transaction transaction = db.beginTx() )
        {
            String output = "";
            // START SNIPPET: printPath
            Traverser traverser = td.traverse( A );
            PathPrinter pathPrinter = new PathPrinter( "lineId" );
            for ( Path path : traverser )
            {
                output += Paths.pathToString( path, pathPrinter )+"\n";
            }
            // END SNIPPET: printPath
            output += "\n";
            return output;
        }
    }

    // START SNIPPET: pathPrinter
    static class PathPrinter implements Paths.PathDescriptor<Path>
    {
        private final String nodePropertyKey;

        public PathPrinter( String nodePropertyKey )
        {
            this.nodePropertyKey = nodePropertyKey;
        }

        @Override
        public String nodeRepresentation( Path path, Node node )
        {
            return "(" + node.getProperty( nodePropertyKey, "" ) + ")";
        }

        @Override
        public String relationshipRepresentation( Path path, Node from, Relationship relationship )
        {
            String prefix = "--", suffix = "--";
            if ( from.equals( relationship.getEndNode() ) )
            {
                prefix = "<--";
            }
            else
            {
                suffix = "-->";
            }
            return prefix + "[" + relationship.getType().name() + "]" + suffix;
        }
    }

    public void shutdownGraph()
    {
        try
        {
            if ( db != null )
            {
                db.shutdown();
            }
        }
        finally
        {
            db = null;
        }
    }
}
