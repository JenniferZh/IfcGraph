package util;

import java.util.Map;
import java.util.Set;

enum ErrorType {
    WRONG_VALUE,
    WRONG_PATH
}

public class ResultItem {
    private String rule;
    private boolean pass;
    private Map<String, ErrorType> wrongSet;
    private Set<String> fullSet;



}
