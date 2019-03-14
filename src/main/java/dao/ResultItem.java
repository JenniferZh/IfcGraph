package dao;

public class ResultItem {
    public String ruleContent;
    public int ifcLineId;
    public String ifcType;
    public boolean status;

    public ResultItem(String ruleContent, int ifcLineId, String ifcType, boolean status) {
        this.ruleContent = ruleContent;
        this.ifcLineId = ifcLineId;
        this.ifcType = ifcType;
        this.status = status;
    }

    public String toString() {
        String[] rules = ruleContent.split(" ");
        return ifcLineId+" "+ifcType+" "+rules[0]+" "+rules[2];
        //return ruleContent+" "+ifcType+" "+ifcLineId+" "+status;
    }
}
