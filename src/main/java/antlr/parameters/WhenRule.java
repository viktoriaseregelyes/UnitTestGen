package antlr.parameters;

public class WhenRule {
    String condition;
    String returnValue;
    String throwValue;

    public WhenRule(String condition, String returnValue, String throwValue) {
        this.condition = condition;
        this.returnValue = returnValue;
        this.throwValue = throwValue;
    }

    public String getCondition() {
        return condition;
    }

    public String getReturnValue() {
        return returnValue;
    }

    public String getThrowValue() {
        return throwValue;
    }
}
