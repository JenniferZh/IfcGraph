package util;

import org.neo4j.graphdb.Node;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IfcDirection {
    public double x;
    public double y;
    public double z;
    public static final double eps = 0.0001;
    public IfcDirection(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void translate(double[][] trans) {
        double nx = x*trans[0][0] + y*trans[1][0] + z*trans[2][0];
        double ny = x*trans[0][1] + y*trans[1][1] + z*trans[2][1];
        double nz = x*trans[0][2] + y*trans[1][2] + z*trans[2][2];
        x = nx;
        y = ny;
        z = nz;
    }

    public static IfcDirection parseFromString(String s) {
        String pattern = "\\(([0-9|.|e|E|\\-]*),([0-9|.|e|E|\\-]*),([0-9|.|e|E|\\-]*)\\)";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(s);
        if (m.find()) {
            double x = Double.parseDouble(m.group(1));
            //if (x < eps) x = 0.0;
            double y = Double.parseDouble(m.group(2));
            //if (y < eps) y = 0.0;
            double z = Double.parseDouble(m.group(3));
            //if (z < eps) z = 0.0;
            return new IfcDirection(x, y, z);
        }
        return null;
    }

    public static IfcDirection crossProduct(IfcDirection dir1, IfcDirection dir2) {
        if (dir1 == null || dir2 == null ) return null;
        double x = dir1.y*dir2.z-dir2.y*dir1.z;
        double y = dir2.x*dir1.z-dir1.x*dir2.z;
        double z = dir1.x*dir2.y-dir2.x*dir1.y;
        double len = x*x + y*y + z*z;
        return new IfcDirection(x/Math.sqrt(len), y/Math.sqrt(len), z/Math.sqrt(len));
    }

    public static double innerProduct(IfcDirection dir1, IfcDirection dir2) {
        double inner =  dir1.x*dir2.x+dir1.y*dir2.y+dir1.z*dir2.z;
        return inner/(length(dir1)*length(dir2));
    }

    public static double length(IfcDirection dir) {
        double square = dir.x*dir.x+dir.y*dir.y+dir.z*dir.z;
        return Math.sqrt(square);
    }

    public String toString() {
        return x+" "+y+" "+z;
    }

    public static void main(String[] args) {
        IfcDirection.parseFromString("(-8.68965671290933E-6,-1.,0.)");

    }

}
