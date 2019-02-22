package rule;

import java.io.File;
import java.util.*;

import org.neo4j.cypher.internal.frontend.v2_3.ast.functions.Str;
import org.neo4j.graphdb.*;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.neo4j.graphdb.traversal.Evaluation;
import org.neo4j.graphdb.traversal.Evaluator;
import org.neo4j.graphdb.traversal.Paths;
import org.neo4j.graphdb.traversal.TraversalDescription;
import org.neo4j.graphdb.traversal.Traverser;
import org.neo4j.graphdb.traversal.Uniqueness;

import static org.neo4j.graphdb.RelationshipType.withName;

public class ColorRule {
    GraphDatabaseService db;
    Map<Node, Node> startEnd = new HashMap<>();

    public ColorRule(GraphDatabaseService db) {
        this.db = db;
    }

    public void getSystemNode(String systemName) {
        //path to find system
        List<String> systemPath = Arrays.asList("RelatingGroup","RelatedObjects");
        TraversalDescription traverse = findPaths(systemPath);

        //path to find color
        List<String> colorPath = Arrays.asList("Representation","Representations","Items","Item","Styles","Styles","Styles","SurfaceColour");
        TraversalDescription traverseColor = findPathsDFS(colorPath);

        List<String> colorPath2 = Arrays.asList("RelatedObjects","RelatingMaterial","RepresentedMaterial","Representations","Items","Styles","Styles","Styles","SurfaceColour");
        TraversalDescription traverseColor2 = findPathsDFS(colorPath2);

        List<Node> nodeList = new ArrayList<>();
        Set<Node> systemNodes = new HashSet<>();

        try (Transaction tx = db.beginTx()) {
            ResourceIterator<Node> nodeIter = db.findNodes( Label.label("IfcSystem"));
            //ResourceIterator<Node> nodeIter = db.findNodes( Label.label("IfcSystem"), "ObjectType", systemName );
            while (nodeIter.hasNext()) {
                Node system = nodeIter.next();
                nodeList.add(system);
            }
            tx.success();
        }
        for (Node node: nodeList) {
            List<Node> endNodes = getEndNodes(traverse, node);
            systemNodes.addAll(endNodes);
        }
        System.out.println(systemNodes.size());
        for (Node node: systemNodes) {
            List<Node> endNodes = getEndNodes(traverseColor, node);
            getEndNodes(traverseColor2, node);
        }

        System.out.println(startEnd.size());
    }

    public void colortest() {

        //path to find color
        List<String> colorPath = Arrays.asList("RelatedObjects","RelatingMaterial","RepresentedMaterial","Representations","Items","Styles","Styles","Styles","SurfaceColour");
        TraversalDescription traverseColor = findPathsDFS(colorPath);
        List<String> colorPath2 = Arrays.asList("Representation","Representations","Items","Item","Styles","Styles","Styles","SurfaceColour");
        //List<String> colorPath2 = Arrays.asList("Representation","Representations","Items","Item","Styles","Styles","Styles","SurfaceColour");
        TraversalDescription traverseColor2 = findPathsDFS(colorPath2);
        List<Node> nodeList = new ArrayList<>();
        List<Node> colorNodes = new ArrayList<>();

        try (Transaction tx = db.beginTx()) {

            ResourceIterator<Node> nodeIter = db.findNodes( Label.label("Element") );
            while (nodeIter.hasNext()) {
                Node system = nodeIter.next();
                nodeList.add(system);
            }
            tx.success();
        }
        System.out.println(nodeList.size());
        for (Node node: nodeList) {
            List<Node> endNodes = getEndNodes(traverseColor, node);
            colorNodes.addAll(endNodes);
        }
        try (Transaction tx = db.beginTx()) {
            for (Node node: colorNodes) {
                System.out.println(node.getProperty("Red"));
            }
            tx.success();
        }
        System.out.println(colorNodes.size());
    }



    public TraversalDescription findPaths(List<String> path)
    {
        final ArrayList<RelationshipType> orderedPathContext = new ArrayList<>();
        for (String linkName: path) {
            orderedPathContext.add(withName(linkName));
        }
        TraversalDescription td = db.traversalDescription()
                .breadthFirst()
                .evaluator( new Evaluator()
                {
                    @Override
                    public Evaluation evaluate( final Path path )
                    {
                        if ( path.length() == 0 )
                        {
                            return Evaluation.EXCLUDE_AND_CONTINUE;
                        }
                        RelationshipType expectedType = orderedPathContext.get( path.length() - 1 );
                        boolean isExpectedType = path.lastRelationship()
                                .isType( expectedType );
                        boolean included = path.length() == orderedPathContext.size() && isExpectedType;
                        boolean continued = path.length() < orderedPathContext.size() && isExpectedType;
                        return Evaluation.of( included, continued );
                    }
                } )
                .uniqueness( Uniqueness.NODE_PATH );
        // END SNIPPET: walkOrderedPath
        return td;
    }

    public TraversalDescription findPathsDFS(List<String> path)
    {
        final ArrayList<RelationshipType> orderedPathContext = new ArrayList<>();
        for (String linkName: path) {
            orderedPathContext.add(withName(linkName));
        }
        TraversalDescription td = db.traversalDescription()
                .depthFirst()
                .evaluator( new Evaluator()
                {
                    @Override
                    public Evaluation evaluate( final Path path )
                    {
                        if ( path.length() == 0 )
                        {
                            return Evaluation.EXCLUDE_AND_CONTINUE;
                        }
                        RelationshipType expectedType = orderedPathContext.get( path.length() - 1 );
                        boolean isExpectedType = path.lastRelationship()
                                .isType( expectedType );
                        boolean included = path.length() == orderedPathContext.size() && isExpectedType;
                        boolean continued = path.length() < orderedPathContext.size() && isExpectedType;
                        return Evaluation.of( included, continued );
                    }
                } )
                .uniqueness( Uniqueness.NODE_PATH );
        // END SNIPPET: walkOrderedPath
        return td;
    }

    List<Node> getEndNodes( TraversalDescription td, Node a) {
        List<Node> endNodes = new ArrayList<Node>();
        //Map<Node, Node> startEnd = new HashMap<>();
        try ( Transaction transaction = db.beginTx() )
        {

            Traverser traverser = td.traverse( a );
            for ( Path path : traverser )
            {
                Node endNode = path.endNode();
                endNodes.add(endNode);
                if (startEnd.containsKey(path.startNode())) {
                    System.out.println("find");
                }
                startEnd.put(path.startNode(), path.endNode());
            }
            //System.out.println(startEnd.size());
            return endNodes;
        }
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
