package rule;

import org.neo4j.codegen.bytecode.If;
import org.neo4j.graphdb.*;
import org.neo4j.graphdb.traversal.TraversalDescription;
import util.IfcDirection;
import util.Inverse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DirectionRule {

    private GraphDatabaseService db;
    private double angle;


    public String ruleContent;

    public DirectionRule(GraphDatabaseService db, String ruleContent, double angle) {
        this.db = db;
        this.ruleContent = ruleContent;
        this.angle = angle;
    }

    public void checkDirection() {

        List<Node> fittings = new ArrayList<>();
        try (Transaction tx = db.beginTx()) {
            ResourceIterator<Node> iter = db.findNodes(Label.label("IfcFlowFitting"));

            while (iter.hasNext()) {
                Node fitting = iter.next();
                fittings.add(fitting);
            }
           tx.success();
        }
        for (Node fitting: fittings) checkFlowFitting(fitting);
    }

    private void checkFlowFitting(Node fitting) {
        List<Node> segments = getRelatedSegment(fitting);
        System.out.println("check");

        if (segments.size() != 2) return;

        IfcDirection segment1 = getDirection(getExtrudedSolid(segments.get(0)));
        IfcDirection segment2 = getDirection(getExtrudedSolid(segments.get(1)));

        //System.out.println(segment1);
        //System.out.println(segment2);

        double acos = IfcDirection.innerProduct(segment1, segment2);
        //System.out.println(360-Math.acos(angle)*180);
        double angle = Math.acos(acos)*180/Math.PI;

        if (Math.round(angle) == 0) {
            return;
        }

        if (Math.round(angle) != this.angle && Math.round(angle) != this.angle-1) {
            //System.out.println(angle);
            System.out.println(Math.round(angle));
        }

    }

    private IfcDirection getDirection(Node extruded) {
        //try (Transaction tx = db.beginTx()) {
            IfcDirection trueDir = getDirectionOfExtruded(extruded);
            //System.out.println(trueDir);

            IfcDirection zDir = getZaxis(extruded);
            //System.out.println(zDir);

            IfcDirection xDir = getXaxis(extruded);
            //System.out.println(xDir);

            IfcDirection yDir = IfcDirection.crossProduct(xDir, zDir);

            double[][] inv = Inverse.invert(xDir, yDir, zDir);

            trueDir.translate(inv);


            return trueDir;



        //Node zAxis = extruded.getSingleRelationship(RelationshipType.withName("Position"), Direction.OUTGOING).getEndNode();
            //.getSingleRelationship(RelationshipType.withName("Axis"), Direction.OUTGOING).getEndNode();
            //Node xAxis = extruded.getSingleRelationship(RelationshipType.withName("Position"), Direction.OUTGOING).getEndNode();
            //.getSingleRelationship(RelationshipType.withName("RefDirection"), Direction.OUTGOING).getEndNode();
        //    tx.success();
        //}

    }

    private IfcDirection getZaxis(Node extruded) {
        IfcDirection defaultDir = new IfcDirection(0.0,0.0,1.0);
        try (Transaction tx = db.beginTx()){
            Relationship zAxis = extruded.getSingleRelationship(RelationshipType.withName("Position"), Direction.OUTGOING);
            if (zAxis == null) return defaultDir;
            Relationship zz = zAxis.getEndNode().getSingleRelationship(RelationshipType.withName("Axis"), Direction.OUTGOING);
            if (zz == null) return defaultDir;
            Node direction = zz.getEndNode();
            IfcDirection direct = getDirectionFromNode(direction);
            tx.success();;
            return direct;
        }
        //Node zAxis = extruded.getSingleRelationship(RelationshipType.withName("Position"), Direction.OUTGOING).getEndNode(
    }

    private IfcDirection getXaxis(Node extruded) {
        IfcDirection defaultDir = new IfcDirection(1.0,0.0,0.0);
        try (Transaction tx = db.beginTx()){
            Relationship zAxis = extruded.getSingleRelationship(RelationshipType.withName("Position"), Direction.OUTGOING);
            if (zAxis == null) return defaultDir;
            Relationship zz = zAxis.getEndNode().getSingleRelationship(RelationshipType.withName("RefDirection"), Direction.OUTGOING);
            if (zz == null) return defaultDir;
            Node direction = zz.getEndNode();
            IfcDirection direct = getDirectionFromNode(direction);
            tx.success();;
            return direct;
        }
    }


    private IfcDirection getDirectionOfExtruded(Node extruded) {
        IfcDirection dir = new IfcDirection(0.0, 0.0, 1.0);
        try (Transaction tx = db.beginTx()) {
            Relationship dirRel = extruded.getSingleRelationship(RelationshipType.withName("ExtrudedDirection"), Direction.OUTGOING);
            if (dirRel == null) return dir;
            Node direction = dirRel.getEndNode();
            IfcDirection direct = getDirectionFromNode(direction);
            tx.success();
            return direct;
        }
    }

    private IfcDirection getDirectionFromNode(Node ifcdirection) {
        try (Transaction tx = db.beginTx()) {
            String dir = (String) ifcdirection.getProperty("DirectionRatios");
            tx.success();
            return IfcDirection.parseFromString(dir);
        }
    }

    private List<Node> getRelatedSegment(Node fitting) {
        List<String> dirPath = Arrays.asList("HasPorts","ConnectedTo","ContainedIn");
        TraversalDescription traverseDir = BaseRule.findPathsDFS(dirPath, db);
        return BaseRule.getEndNodes(traverseDir, fitting, db);
    }

    private Node getExtrudedSolid(Node segment) {
        List<String> geoPath = Arrays.asList("Representation", "Representations","Items");
        TraversalDescription traverseGeo = BaseRule.findPathsDFS(geoPath, db);
        List<Node> nodes = BaseRule.getEndNodes(traverseGeo, segment, db);
        if (nodes.size() != 1) return null;
        return nodes.get(0);
    }
}
