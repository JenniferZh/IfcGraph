package check;


import org.neo4j.graphdb.Direction;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import rule.ColorRule;
import rule.ColorSystem;
import rule.DirectionRule;
import rule.ExistRule;
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
        String ruleContent = systemName+ " 的表面颜色为 ("+red+","+green+","+blue+")";
        ColorRule color = new ColorRule(db, ruleContent, red, green, blue);
        //color.test();
        color.checkColorForSystem(systemName);
    }

    public void checkExist(String code) {
        String ruleContent = "构件分类编码："+code+"是否建模";
        ExistRule exist = new ExistRule(db, ruleContent, code);
        System.out.println(exist.checkExistForCode().status);

    }

    public void checkExistForName(String name) {
        String ruleContent = "构件名称："+name+"是否建模";
        ExistRule exist = new ExistRule(db, ruleContent, name);
        System.out.println(exist.checkExistForName().status);


    }

    public void checkFlowDirection() {
        String ruleContent = "angle";
        DirectionRule rule = new DirectionRule(db, ruleContent, 90);
        rule.checkDirection();
    }

    public static void main(String[] args) throws IOException {
        long timestamp1 = System.currentTimeMillis();

        Check checker = new Check();
        checker.checkFlowDirection();

        long timestamp2 = System.currentTimeMillis();

        System.out.println("时间："+(timestamp2-timestamp1));
        //checker.
//        List<ColorSystem> colors = ConfigReader.readColorConfig();
//        for (ColorSystem color : colors) {
//            checker.checkColor(color.systemName,color.red,color.green,color.blue);
//        }
//
//        long timestamp2 = System.currentTimeMillis();
//        System.out.println("时间："+(timestamp2-timestamp1));
//        System.out.println("规则："+colors.size());

        //checker.checkExist("10.10.20.09.20.20.30");

//        checker.checkExist("30.30.10.72.10");
//        checker.checkExist("10.10.20.69.05");
//        checker.checkExist("10.10.70.20");
//        checker.checkExist("10.10.30.03.09.12.05");
//        checker.checkExist("10.10.40.10.10.30");
//        checker.checkExist("10.10.40.30.12");
//        checker.checkExist("10.10.10.90.15.54");
//        checker.checkExist("30.40.55");
//        checker.checkExist("30.40.20");
//        checker.checkExist("30.30.05.89");
//        checker.checkExist("10.10.20.03.09.20");
//        checker.checkExist("10.10.60.15.15");
//        checker.checkExist("10.10.50.01");

        //checker.checkExistForName("粗装踢脚");
        //checker.checkColor("SAS_送风系统",0,153,255);
    }

}
