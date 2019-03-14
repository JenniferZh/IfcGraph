package rule;

import dao.ResultItem;
import org.neo4j.graphdb.*;
import org.neo4j.graphdb.traversal.TraversalDescription;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExistRule {

    private GraphDatabaseService db;
    private String code;

    public String ruleContent;

    public ExistRule(GraphDatabaseService db, String ruleContent, String code) {
        this.db = db;
        this.ruleContent = ruleContent;
        this.code = code;
    }

    public ResultItem checkExistForCode() {
        List<Node> properties = new ArrayList<>();
        ResultItem item = new ResultItem(ruleContent, 0, "", false);
        try (Transaction tx = db.beginTx()) {
            ResourceIterator<Node> iter = db.findNodes(Label.label("IfcPropertySingleValue"), "Name", "构件分类编码");
            while (iter.hasNext()) {
                Node singleProperty = iter.next();
                String trueCode = (String) singleProperty.getProperty("NominalValue");
                if (trueCode.startsWith(code)) {
                    properties.add(singleProperty);
                    System.out.println(trueCode);
                }
            }
            tx.success();
        }
        if (properties.size() == 0) return item;

        System.out.println(properties.size());

        List<String> existPath = Arrays.asList("HasProperties","HasPropertySets","HasAssignments");
        List<String> existPath2 = Arrays.asList("HasProperties","IsDefinedBy");
        TraversalDescription traverseExist = BaseRule.findPathsDFS(existPath, db);
        TraversalDescription traverseExist2 = BaseRule.findPathsDFS(existPath2, db);
        for (Node node: properties) {
            List<Node> endNodes = BaseRule.getEndNodes(traverseExist, node, db);
            if (endNodes.size() > 0) {
                item = new ResultItem(ruleContent, 0, "", true);
                return item;
            }
        }
        for (Node node: properties) {
            List<Node> endNodes = BaseRule.getEndNodes(traverseExist2, node, db);
            if (endNodes.size() > 0) {
                item = new ResultItem(ruleContent, 0, "", true);
                return item;
            }
        }

        return item;
    }

    public ResultItem checkExistForName() {
        List<Node> properties = new ArrayList<>();
        ResultItem item = new ResultItem(ruleContent, 0, "", false);
        try (Transaction tx = db.beginTx()) {
            ResourceIterator<Node> iter = db.findNodes(Label.label("IfcPropertySingleValue"), "Name", "类型");
            while (iter.hasNext()) {
                Node singleProperty = iter.next();
                String trueCode = (String) singleProperty.getProperty("NominalValue");
                if (trueCode.startsWith(code)) {
                    properties.add(singleProperty);
                    System.out.println(trueCode);
                }
            }
            tx.success();
        }
        if (properties.size() == 0) return item;
        return new ResultItem(ruleContent, 0, "", true);
    }
}
