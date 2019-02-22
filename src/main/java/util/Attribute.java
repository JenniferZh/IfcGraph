package util;

public class Attribute {
    private String name;
    private boolean isDerived = false;
    private int index = -1;

    //default attribute is direct and has no index
    public Attribute(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void SetDerived(boolean isDerived) {
        this.isDerived = isDerived;
    }

    public void SetIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public String toString() {
        String str = "";
        str += "{name:"+name+",";
        str += "isderived:"+isDerived+",";
        str += "index:"+index+"}";
        return str;
    }
}
