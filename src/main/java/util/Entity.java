package util;

import java.util.ArrayList;
import java.util.List;

public class Entity {
    private String name;
    private String version;
    private String parentName;
    private Entity parent;
    private List<Attribute> attributes = new ArrayList<Attribute>();

    public Entity(String name) {
        this.version = "IFC4";
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setParent(Entity parent) {
        this.parent = parent;
    }

    public Entity getParent() {
        return parent;
    }

    public String getVersion() {
        return version;
    }


    public void addAttribute(String attr) {
        Attribute attribute = new Attribute(attr);
        attributes.add(attribute);
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setParentName(String parent) {
        this.parentName = parent;
    }

    public String getParentName() {
        return parentName;
    }

    public String toString() {
        String str = name+" "+version+" "+parentName+'\n';
        String attrs = "";
        for (Attribute attr: attributes) {
            attrs += attr + " ";
        }
        return str+attrs+'\n';
    }
}