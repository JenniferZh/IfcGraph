package rule;

import org.neo4j.graphdb.*;
import org.neo4j.graphdb.traversal.*;

import java.util.ArrayList;
import java.util.List;

import static org.neo4j.graphdb.RelationshipType.withName;

public class BaseRule {


//    public static TraversalDescription findPaths(List<String> path, GraphDatabaseService db)
//    {
//        final ArrayList<RelationshipType> orderedPathContext = new ArrayList<>();
//        for (String linkName: path) {
//            orderedPathContext.add(withName(linkName));
//        }
//        TraversalDescription td = db.traversalDescription()
//                .breadthFirst()
//                .evaluator( new Evaluator()
//                {
//                    @Override
//                    public Evaluation evaluate(final Path path )
//                    {
//                        if ( path.length() == 0 )
//                        {
//                            return Evaluation.EXCLUDE_AND_CONTINUE;
//                        }
//                        RelationshipType expectedType = orderedPathContext.get( path.length() - 1 );
//                        boolean isExpectedType = path.lastRelationship()
//                                .isType( expectedType );
//                        boolean included = path.length() == orderedPathContext.size() && isExpectedType;
//                        boolean continued = path.length() < orderedPathContext.size() && isExpectedType;
//                        return Evaluation.of( included, continued );
//                    }
//                } )
//                .uniqueness( Uniqueness.NODE_PATH );
//        return td;
//    }

    public static TraversalDescription findPathsDFS(List<String> path, GraphDatabaseService db)
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
        return td;
    }

    public static List<Node> getEndNodes(TraversalDescription td, Node a, GraphDatabaseService db) {
        List<Node> endNodes = new ArrayList<Node>();
        try ( Transaction transaction = db.beginTx() )
        {

            Traverser traverser = td.traverse( a );
            for ( Path path : traverser )
            {
                Node endNode = path.endNode();
                endNodes.add(endNode);
            }
            return endNodes;
        }
    }
}
