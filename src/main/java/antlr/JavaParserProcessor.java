package antlr;

import com.github.javaparser.*;
import com.github.javaparser.ast.*;
import com.github.javaparser.ast.body.*;
import com.github.javaparser.ast.comments.Comment;
import com.github.javaparser.ast.stmt.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JavaParserProcessor {
    String fileName;

    public JavaParserProcessor(String file) {
        this.fileName = file;
    }

    public void parser() throws Exception {
        clearWriter();

        File file = new File("src/main/java/input/" + fileName);
        CompilationUnit cu = StaticJavaParser.parse(file);

        cu.getAllContainedComments().forEach(Comment::remove);

        cu.getPackageDeclaration().ifPresent(pkg -> writeLineToFile("PACKAGE " + pkg.getName() + "\n\n"));

        cu.getImports().forEach(importDecl -> writeLineToFile("IMPORT " + importDecl.getName() + "\n"));

        writeLineToFile("\n");

        cu.findAll(ClassOrInterfaceDeclaration.class).forEach(clazz -> {
            writeLineToFile("CLASS " + clazz.getName() + "\n\n");

            clazz.findAll(FieldDeclaration.class).forEach(field -> {
                field.getVariables().forEach(variable -> {
                    writeLineToFile("FIELD " + field.getElementType() + " " + variable.getName() + "\n");
                });
            });

            clazz.findAll(ConstructorDeclaration.class).forEach(constructor -> {
                writeLineToFile("\nCONSTRUCTOR " + constructor.getName() + "\n");

                constructor.getParameters().forEach(param ->
                        writeLineToFile("PARAM " + param.getType() + " " + param.getName() + "\n")
                );
            });

            clazz.findAll(MethodDeclaration.class).forEach(method -> {
                writeLineToFile("\n" + "METHOD " + method.getName() + "\n");
                writeLineToFile("RETURN_TYPE " + method.getType() + "\n");

                method.getParameters().forEach(param ->
                        writeLineToFile("PARAM " + param.getType() + " " + param.getName() + "\n")
                );

                if (method.getBody().isPresent()) {
                    processStatements(method.getBody().get().getStatements());
                }
            });
        });
    }

    private static void processStatements(NodeList<Statement> statements) {
        for (Statement stmt : statements) {
            switch (stmt) {
                case ReturnStmt returnStmt -> writeLineToFile("RETURN " + returnStmt.getExpression().orElse(null) + "\n");
                case ThrowStmt throwStmt -> writeLineToFile("EXCEPTION " + stmt + "\n");
                case IfStmt ifStmt -> {
                    writeLineToFile("IF_CONDITION " + ifStmt.getCondition() + "\n");
                    processStatements(ifStmt.getThenStmt().asBlockStmt().getStatements());
                    ifStmt.getElseStmt().ifPresent(elseStmt -> {
                        writeLineToFile("ELSE_BLOCK_FOUND\n");
                        processStatements(((BlockStmt) elseStmt).getStatements());
                    });
                }
                case ForStmt forStmt -> writeLineToFile("FOR_LOOP " + stmt + "\n");
                case WhileStmt whileStmt -> writeLineToFile("WHILE_LOOP " + stmt + "\n");
                case TryStmt tryStmt -> {
                    writeLineToFile("TRY_BLOCK_FOUND\n");
                    processStatements(tryStmt.getTryBlock().getStatements());
                    for (CatchClause catchClause : tryStmt.getCatchClauses()) {
                        writeLineToFile("CATCH_BLOCK " + catchClause.getParameter() + "\n");
                        processStatements(catchClause.getBody().getStatements());
                    }
                    tryStmt.getFinallyBlock().ifPresent(finallyBlock -> {
                        writeLineToFile("FINALLY_BLOCK_FOUND\n");
                        processStatements(finallyBlock.getStatements());
                    });
                }
                case ExpressionStmt expressionStmt -> writeLineToFile("EXPRESSION " + stmt + "\n");
                case null, default -> writeLineToFile("STATEMENT " + stmt + "\n");
            }
        }
    }

    private static void writeLineToFile(String line) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\User\\Documents\\GitHub\\UnitTestGenerator\\UnitTest\\src\\main\\java\\input\\generate\\JavaGen.cfg", true))) {
            writer.write(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void clearWriter() {
        try (BufferedWriter clearWriter = new BufferedWriter(new FileWriter("C:\\Users\\User\\Documents\\GitHub\\UnitTestGenerator\\UnitTest\\src\\main\\java\\input\\generate\\JavaGen.cfg", false))) {
            clearWriter.write("");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
