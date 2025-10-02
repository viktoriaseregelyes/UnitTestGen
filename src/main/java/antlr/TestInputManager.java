package antlr;

import antlr.parameters.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class TestInputManager {
    private final String testCasesFileName;
    private final TestDataCollectorVisitor dataCollectorVisitor;
    private final MyParamVisitor paramVisitor = new MyParamVisitor();
    private List<Test> inputTests = new ArrayList<>();
    private List<WhenRule> globalWhens = new ArrayList<>();
    private Constructor inputConstructor = new Constructor();
    private Map<String, String> inputMockClasses = new HashMap<>();

    public TestInputManager(String fileName, TestDataCollectorVisitor dataCollectorVisitor) {
        this.testCasesFileName = fileName;
        this.dataCollectorVisitor = dataCollectorVisitor;
    }

    public void loadParamAndInput() {
        loadInputClass();
        loadParamConfig();
    }

    private void loadInputClass() {
        try {
            String input = new String(Files.readAllBytes(Paths.get("src\\main\\java\\input\\generate\\JavaGen.cfg")));
            JUnitGenLexer lexer = new JUnitGenLexer(CharStreams.fromString(input));
            JUnitGenParser parser = new JUnitGenParser(new CommonTokenStream(lexer));
            ParseTree tree = parser.testFile();

            this.dataCollectorVisitor.visit(tree);
        } catch (IOException e) {
            throw new RuntimeException("Could not read parameter file", e);
        }
    }

    private void loadParamConfig() {
        try {
            String input = Files.readString(Paths.get(testCasesFileName));
            ParamGenLexer lexer = new ParamGenLexer(CharStreams.fromString(input));
            ParamGenParser parser = new ParamGenParser(new CommonTokenStream(lexer));
            ParseTree tree = parser.templateFile();
            paramVisitor.visit(tree);

            this.inputTests = paramVisitor.getAllTest();
            this.inputMockClasses = paramVisitor.getMockClasses();
            this.inputConstructor = paramVisitor.getConstructor();
            this.globalWhens = paramVisitor.getGlobalWhens();
        } catch (IOException e) {
            throw new RuntimeException("Could not read parameter file", e);
        }
    }

    public boolean localWhenAppears() {
        for(Test test : this.inputTests)
            if(!test.getWhens().isEmpty())
                return true;
        return false;
    }

    public List<Test> getInputTests() { return this.inputTests; }
    public Constructor getInputConstructor() { return this.inputConstructor; }
    public Map<String, String> getInputMockClasses() { return this.inputMockClasses; }
    public List<WhenRule> getGlobalWhens() { return globalWhens; }
}
