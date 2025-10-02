package antlr;

public class RuntimeErrorHandler {
    public void throwError(String message) {
        throw new RuntimeException("Error: " + message);
    }
}
