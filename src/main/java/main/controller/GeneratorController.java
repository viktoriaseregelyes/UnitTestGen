package main.controller;

import antlr.*;
import antlr.parameters.*;

import main.error.ValidationError;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

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

            generate(inputClass);
            String output = new String(Files.readAllBytes(Paths.get("TestClass.java")));

            return ResponseEntity.ok(output);
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.ofNullable("Failed to load input.");
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Unexpected error " + e.getMessage());
        }
    }

    @PostMapping("/validate")
    public ResponseEntity<List<ValidationError>> validate(@RequestBody TestRequest request) {
        String testCases = request.testCases;

        CharStream input = CharStreams.fromString(testCases);
        ParamGenLexer lexer = new ParamGenLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ParamGenParser parser = new ParamGenParser(tokens);

        List<ValidationError> errors = new ArrayList<>();

        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer,
                                    Object offendingSymbol,
                                    int line, int charPositionInLine,
                                    String msg,
                                    RecognitionException e) {

                int length = 1;
                if (offendingSymbol instanceof Token) {
                    Token t = (Token) offendingSymbol;
                    int start = t.getStartIndex();
                    int stop = t.getStopIndex();
                    if (start >= 0 && stop >= start) {
                        length = stop - start + 1;
                    }
                }

                errors.add(new ValidationError(line, charPositionInLine, msg, length));
            }
        });

        parser.templateFile();
        return ResponseEntity.ok(errors);
    }

    public void generate(String inputClass) throws Exception {
        JavaParserProcessor jpp = new JavaParserProcessor(inputClass);
        jpp.parser();

        String input = new String(Files.readAllBytes(Paths.get("src\\main\\java\\input\\generate\\JavaGen.cfg")));
        JUnitGenLexer lexer = new JUnitGenLexer(CharStreams.fromString(input));
        JUnitGenParser parser = new JUnitGenParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.testFile();

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
