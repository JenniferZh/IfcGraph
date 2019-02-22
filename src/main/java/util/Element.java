package util;

import util.Entity;

import java.util.ArrayList;
import java.util.List;

public class Element {

    private String ifcType;
    private int lineID;
    private List<String> attrs;

    public Element(String type, int lineID) {
        this.ifcType = type;
        this.lineID = lineID;
        this.attrs = new ArrayList<>();
    }

    public String getIfcType() {
        return ifcType;
    }

    public void addAttribute(String attr) {
        attrs.add(attr);
    }

    public int getLineID() {
        return lineID;
    }

    public List<String> getAttrs() {
        return attrs;
    }

    public boolean isValid(Entity entity) {
        if (entity.getAttributes().size() != attrs.size()) return false;
        return true;
    }

    public String toString() {
        String res = "";
        res += "type: "+ifcType+' ';
        res += "line: "+lineID+" [";
        for (String attr: attrs) {
            res += attr+",";
        }
        res += "]";
        return res;
    }

}
