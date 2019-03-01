package model;

/**
 * RelationObject will connect objects
 */
public class InverseInfo {
    public String ifcRelType;
    public String attrName;
    public String invName;
    public String attrNameOther;
    public String invNameOther;

    public InverseInfo(String ifcRelType, String attrName, String invName, String attrNameOther, String invNameOther) {
        this.ifcRelType = ifcRelType;
        this.attrName = attrName;
        this.invName = invName;
        this.attrNameOther = attrNameOther;
        this.invNameOther = invNameOther;
    }

    public boolean equals(Object inv) {
        if (inv == null) return false;
        if (this == inv) return true;
        if (!(inv instanceof InverseInfo))
            return false;

        return ((this.ifcRelType).equals(((InverseInfo)inv).ifcRelType)
                && (this.attrName).equals(((InverseInfo)inv).attrName)
                && (this.invName).equals(((InverseInfo)inv).invName));
    }

    public int hashCode() {
        return ifcRelType.hashCode()*17+attrName.hashCode()*13+invName.hashCode();
    }


}
