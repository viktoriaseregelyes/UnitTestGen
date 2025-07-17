package main.controller;

import antlr.*;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Files;
import java.nio.file.Paths;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class GeneratorController {

    @GetMapping("/generate-tests")
    public String generateTests() throws Exception {

        JavaParserProcessor jpp = new JavaParserProcessor("Example.txt");
        jpp.parser();

        String input = new String(Files.readAllBytes(Paths.get("C:\\Users\\User\\Documents\\GitHub\\UnitTestGenerator\\UnitTest\\src\\main\\java\\input\\generate\\JavaGen.cfg")));
        JUnitGenLexer lexer = new JUnitGenLexer(CharStreams.fromString(input));
        JUnitGenParser parser = new JUnitGenParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.testFile();

        MyJUnitTestVisitor visitor = new MyJUnitTestVisitor();
        visitor.visit(tree);

        return "Done";
    }
}
