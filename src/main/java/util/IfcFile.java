package util;

import java.util.List;
import java.util.Map;


public class IfcFile {
    private final String modelName;
    private final IfcVersion version;
    //ifc instances
    private final List<Element> elementList;
    //ifc classes
    private final Map<String, Entity> entityMap;
    public IfcFile(String modelName, IfcVersion version, List<Element> elements, Map<String, Entity> entityMap) {
        this.modelName = modelName;
        this.version = version;
        this.elementList = elements;
        this.entityMap = entityMap;
    }

    public List<Element> getElementList() {
        return elementList;
    }

    public Map<String, Entity> getEntityMap() {
        return entityMap;
    }
}
