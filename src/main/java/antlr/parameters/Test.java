package antlr.parameters;

import java.util.ArrayList;

public class Test {
    String testName;
    String methodName;
    int repeatTime;
    ArrayList<Assert> assertions = new ArrayList<>();
    ArrayList<WhenRule> whens = new ArrayList<>();

    public Test(String testName, String methodName, int repeatTime) {
        this.testName = testName;
        this.methodName = methodName;
        this.repeatTime = repeatTime;
    }

    public String getTestName() { return testName; }
    public String getMethodName() { return methodName; }
    public void setMethodName(String methodName) { this.methodName = methodName; }
    public void addAssert(Assert assertion) { assertions.add(assertion); }
    public ArrayList<Assert> getAssertions() { return assertions; }
    public ArrayList<WhenRule> getWhens() { return whens; }
    public void addWhens(WhenRule when) { this.whens.add(when); }
    public int getRepeatTime() { return repeatTime; }
}
