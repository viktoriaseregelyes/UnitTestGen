package antlr;

import antlr.parameters.Param;

import java.util.ArrayList;

public class Constructor {
    ArrayList<Param> params = new ArrayList<>();

    public ArrayList<Param> getParams() {
        return params;
    }

    public void setParam(Param param) {
        this.params.add(param);
    }

    public void setParams(ArrayList<Param> params) {
        this.params = params;
    }
}
