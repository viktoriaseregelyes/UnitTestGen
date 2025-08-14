package antlr;

import java.io.*;

public class TestFileWriter {
    private final String filePath;

    public TestFileWriter(String filePath) {
        this.filePath = filePath;
    }

    public void writeLine(String line) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print(line);
    }

    public void clear() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, false))) {
            writer.write("");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String lowercaseFirstLetter(String input) {
        return input.substring(0, 1).toLowerCase() + input.substring(1);
    }
}
