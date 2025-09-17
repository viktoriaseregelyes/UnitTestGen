package antlr;

import org.antlr.v4.runtime.Token;

public class RuntimeErrorHandler {
    public void throwError(Token token, String message) {
        if (token == null)
            throw new RuntimeException("Error: " + message + " (no token info)");

        int line = token.getLine();
        int charPos = token.getCharPositionInLine();

        throw new RuntimeException("Error at line " + line + ", char " + charPos + ": " + message);
    }
}
