package model;


import util.IfcVersion;

import java.util.List;
import java.util.Map;
import java.util.Set;


public class IfcFile {
    private final String modelName;
    private final IfcVersion version;
    //ifc instances
    private final List<Element> elementList;
    //ifc classes
    private final Map<String, Entity> entityMap;
    //ifc inverseInfo
    private final Set<InverseInfo> inverseInfoSet;
    public IfcFile(String modelName, IfcVersion version, List<Element> elements, Map<String, Entity> entityMap, Set<InverseInfo> inverseInfoSet) {
        this.modelName = modelName;
        this.version = version;
        this.elementList = elements;
        this.entityMap = entityMap;
        this.inverseInfoSet = inverseInfoSet;
    }

    public List<Element> getElementList() {
        return elementList;
    }

    public Map<String, Entity> getEntityMap() {
        return entityMap;
    }

    public Set<InverseInfo> getInverseInfoSet() { return inverseInfoSet; }
}
