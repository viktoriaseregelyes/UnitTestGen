package main.controller;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class CloverRunner {
    private static final String CLOVER_JAR = "C:\\Program Files\\clover-4.5.2\\lib\\clover-4.5.2.jar";
    private static final String JUNIT_JAR = "C:\\Program Files\\junit5\\junit-platform-console-standalone-1.10.2.jar";

    public static double runCloverPipeline(String className) throws Exception {
        File baseDir = new File("C:\\Users\\User\\Documents\\GitHub\\UnitTestGenerator\\UnitTest\\");
        File dbFile = new File("tmp\\clover.db");
        File srcDir = new File( "src\\main\\java\\input\\uploads\\input");
        File instrDir = new File( "src\\instrumented");
        File outDir = new File( "out");
        File reportDir = new File( "report");
        reportDir.mkdirs();

        // Delete DB
        if (!run(new String[]{
                "cmd", "/c",
                "if exist " + dbFile.getAbsolutePath() + " del " + dbFile.getAbsolutePath()
        }, baseDir)) return 0.0;

        // Instrument
        if (!run(new String[]{
                "java", "-cp", CLOVER_JAR,
                "com.atlassian.clover.CloverInstr",
                "-i", dbFile.getAbsolutePath(),
                "-d", instrDir.getAbsolutePath(),
                new File(srcDir, className + ".java").getAbsolutePath(),
                new File(baseDir, "TestClass.java").getAbsolutePath()
        }, baseDir)) return 0.0;

        // Compile
        if (!run(new String[]{
                "javac",
                "-cp", CLOVER_JAR + ";" + JUNIT_JAR,
                "-d", outDir.getAbsolutePath(),
                instrDir.getAbsolutePath() + "\\*.java"
        }, baseDir)) return 0.0;

        // Run tests
        if (!run(new String[]{
                "java",
                "-cp", outDir.getAbsolutePath() + ";" + CLOVER_JAR + ";" + JUNIT_JAR,
                "-Dclover.initstring=" + dbFile.getAbsolutePath(),
                "org.junit.platform.console.ConsoleLauncher",
                "--select-class=" + className + "Test"
        }, baseDir)) return 0.0;

        // Generate report
        if (!run(new String[]{
                "java", "-cp", CLOVER_JAR,
                "com.atlassian.clover.reporters.xml.XMLReporter",
                "-i", dbFile.getAbsolutePath(),
                "-o", new File(reportDir, "clover.xml").getAbsolutePath()
        }, baseDir)) return 0.0;

        return parseCoverage();
    }

    private static boolean run(String[] cmd, File dir) throws Exception {
        try {
            ProcessBuilder pb = new ProcessBuilder(cmd);
            pb.directory(dir);
            pb.redirectErrorStream(true);
            Process p = pb.start();
            p.getInputStream().transferTo(System.out);
            int exit = p.waitFor();

            if (exit != 0) {
                System.err.println("Command failed: " + String.join(" ", cmd));
                p.destroyForcibly(); // Kill the process if still alive
                return false;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static double parseCoverage() {
        try {
            File baseDir = new File("C:\\Users\\User\\Documents\\GitHub\\UnitTestGenerator\\UnitTest\\");
            File xmlFile = new File(baseDir, "report\\clover.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(xmlFile);
            doc.getDocumentElement().normalize();

            NodeList projects = doc.getElementsByTagName("project");
            if (projects.getLength() == 0) return 0.0;

            Element project = (Element) projects.item(0);
            Element metrics = (Element) project.getElementsByTagName("metrics").item(0);

            int coveredElements = Integer.parseInt(metrics.getAttribute("coveredelements"));
            int totalElements = Integer.parseInt(metrics.getAttribute("elements"));

            if (totalElements == 0) return 0.0;
            return ((double) coveredElements / totalElements) * 100.0;
        } catch (Exception e) {
            e.printStackTrace();
            return 0.0;
        }
    }
}
