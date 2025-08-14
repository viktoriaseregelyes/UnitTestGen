package main.controller;

import antlr.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class GeneratorController {
    String inputFileName;
    String testCasesFileName;

    @PostMapping(value = "/generate-tests", consumes = "application/json")
    public ResponseEntity<String> generateTests(@RequestBody TestRequest request) throws Exception {
        clearWriter();
        String inputClass = request.inputClass;
        String testCases = request.testCases;

        inputFileName = "src\\main\\java\\input\\uploads\\input_" + System.currentTimeMillis() + ".txt";
        testCasesFileName = "src\\main\\java\\input\\uploads\\params_" + System.currentTimeMillis() + ".txt";

        try {
            Files.write(Paths.get(inputFileName), inputClass.getBytes());
            Files.write(Paths.get(testCasesFileName), testCases.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.ofNullable("Failed to load input.");
        }

        generate(inputClass);
        String output = new String(Files.readAllBytes(Paths.get("TestClass.java")));

        return ResponseEntity.ok(output);
    }

    public void generate(String inputClass) throws Exception {
        JavaParserProcessor jpp = new JavaParserProcessor(inputClass);
        jpp.parser();

        String input = new String(Files.readAllBytes(Paths.get("src\\main\\java\\input\\generate\\JavaGen.cfg")));
        JUnitGenLexer lexer = new JUnitGenLexer(CharStreams.fromString(input));
        JUnitGenParser parser = new JUnitGenParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.testFile();

        //TestDataCollectorVisitor testDataCollectorVisitor = new TestDataCollectorVisitor();
        //testDataCollectorVisitor.visit(tree);

        MyJUnitTestVisitor visitor = new MyJUnitTestVisitor(testCasesFileName);
        visitor.visit(tree);
    }

    private void clearWriter() {
        try (BufferedWriter clearWriter = new BufferedWriter(new FileWriter("TestClass.java", false))) {
            clearWriter.write("");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
