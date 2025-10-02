package main.error;

public class ValidationError {
    private int line;
    private int column;
    private String message;
    private int length;

    public ValidationError(int line, int column, String message, int length) {
        this.line = line;
        this.column = column;
        this.message = message;
        this.length = length;
    }

    public int getLine() { return line; }
    public int getColumn() { return column; }
    public String getMessage() { return message; }
    public int getLength() { return length; }

    public void setLine(int line) { this.line = line; }
    public void setColumn(int column) { this.column = column; }
    public void setMessage(String message) { this.message = message; }
    public void setLength(int length) { this.length = length; }
}

