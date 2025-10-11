package antlr.parameters;

import java.util.ArrayList;

public class Assert {
    ArrayList<Param> params;
    ArrayList<Param> variations;
    ArrayList<String> expect;
    String expection;
    String expectMessage;

    public ArrayList<Param> getParams() { return params; }
    public void setParams(ArrayList<Param> params) { this.params = params; }
    public ArrayList<String> getExpect() { return expect; }
    public void setExpect(ArrayList<String> expect) { this.expect = expect; }
    public String getExpectMessage() { return expectMessage; }
    public void setExpectMessage(String expectMessage) { this.expectMessage = expectMessage; }
    public String getExpection() { return expection; }
    public void setExpection(String expection) { this.expection = expection; }
    public ArrayList<Param> getVariations() { return variations; }
    public void setVariations(ArrayList<Param> variations) { this.variations = variations; }
}
