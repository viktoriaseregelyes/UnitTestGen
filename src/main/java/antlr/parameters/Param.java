package antlr.parameters;

import java.util.ArrayList;

public class Param {
    String type;
    String paramName;
    ArrayList<String> value;

    public Param(String type, String paramName) {
        this.type = type;
        this.paramName = paramName;
    }

    public String getParamName() {
        return paramName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<String> getValue() {
        return value;
    }

    public void setValue(ArrayList<String> value) {
        this.value = value;
    }
}
