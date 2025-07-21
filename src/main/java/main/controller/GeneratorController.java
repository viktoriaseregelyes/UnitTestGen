package main.controller;

import antlr.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.nio.file.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class GeneratorController {
    String fileName;

    @PostMapping(value = "/generate-tests", consumes = "text/plain")
    public ResponseEntity<String> generateTests(@RequestBody String inputClass) throws Exception {
        fileName = "C:\\Users\\User\\Documents\\GitHub\\UnitTestGenerator\\UnitTest\\src\\main\\java\\input\\uploads\\input_" + System.currentTimeMillis() + ".txt";

        System.out.println("input:" + inputClass);

        try {
            Files.write(Paths.get(fileName), inputClass.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.ofNullable("Failed to load input.");
        }

        generate(inputClass);

        return ResponseEntity.ok("Done");
    }

    public void generate(String inputClass) throws Exception {
        JavaParserProcessor jpp = new JavaParserProcessor(inputClass);
        jpp.parser();

        String input = new String(Files.readAllBytes(Paths.get("C:\\Users\\User\\Documents\\GitHub\\UnitTestGenerator\\UnitTest\\src\\main\\java\\input\\generate\\JavaGen.cfg")));
        JUnitGenLexer lexer = new JUnitGenLexer(CharStreams.fromString(input));
        JUnitGenParser parser = new JUnitGenParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.testFile();

        MyJUnitTestVisitor visitor = new MyJUnitTestVisitor();
        visitor.visit(tree);
    }
}
