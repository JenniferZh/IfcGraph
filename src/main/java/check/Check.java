package check;


import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import rule.ColorRule;

import java.io.File;

public class Check {
    static final File databaseDirectory = new File( "D:\\Program Files\\neo4j-community-3.4.10\\data\\databases\\ifc23t.db" );
    GraphDatabaseService db;

    public Check() {
        db = new GraphDatabaseFactory().newEmbeddedDatabase(databaseDirectory);
    }

    public void checkColor(String systemName, int red, int green, int blue) {
        ColorRule color = new ColorRule(db);
        color.getSystemNode(systemName);
        //color.colortest();
    }

    public static void main(String[] args) {
        Check checker = new Check();
        //checker.

        checker.checkColor("SAS_送风系统",2,3,3);
    }

}
