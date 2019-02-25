package model;

public class Attribute {
    private String name;
    private int index = -1;
    private String type;

    //default attribute is direct and has no index
    public Attribute(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }

    public String getType() { return type; }


    public void SetIndex(int index) {
        this.index = index;
    }

    public void SetType(String type) {
        this.type = type;
    }


    public String toString() {
        String str = "";
        str += "{name:"+name+",";
        str += "index:"+index+"}";
        return str;
    }
}
