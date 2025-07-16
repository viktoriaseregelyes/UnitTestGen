package main;

import antlr.*;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws Exception {
        JavaParserProcessor jpp = new JavaParserProcessor("Example.txt");
        jpp.parser();

        String input = new String(Files.readAllBytes(Paths.get("C:\\Users\\User\\Documents\\GitHub\\UnitTest\\src\\main\\java\\input\\generate\\JavaGen.cfg")));
        JUnitGenLexer lexer = new JUnitGenLexer(CharStreams.fromString(input));
        JUnitGenParser parser = new JUnitGenParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.testFile();

        MyJUnitTestVisitor visitor = new MyJUnitTestVisitor();
        visitor.visit(tree);
    }
}