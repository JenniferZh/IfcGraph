package check;


import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import rule.ColorRule;
import rule.ColorSystem;
import util.ConfigReader;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Check {
    static final File databaseDirectory = new File( "D:\\Program Files\\neo4j-community-3.4.10\\data\\databases\\ifc23t.db" );
    GraphDatabaseService db;

    public Check() {
        db = new GraphDatabaseFactory().newEmbeddedDatabase(databaseDirectory);
    }

    public void checkColor(String systemName, int red, int green, int blue) {
        String ruleContent = systemName+ " 的表面颜色为（"+red+","+green+","+blue+")";
        ColorRule color = new ColorRule(db, ruleContent, red, green, blue);
        //color.test();
        color.checkColorForSystem(systemName);
    }

    public static void main(String[] args) throws IOException {
        long timestamp1 = System.currentTimeMillis();

        Check checker = new Check();
        //checker.
        List<ColorSystem> colors = ConfigReader.readColorConfig();
        for (ColorSystem color : colors) {
            checker.checkColor(color.systemName,color.red,color.green,color.blue);
        }

        long timestamp2 = System.currentTimeMillis();
        System.out.println("时间："+(timestamp2-timestamp1));
        System.out.println("规则："+colors.size());

        //checker.checkColor("SAS_送风系统",0,153,255);
    }

}
