package estafet.java11;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MyFileCreator {

    public static void createTextFile(Path path, String text) throws IOException {
        Files.write(path, text.getBytes(StandardCharsets.UTF_8));
    }

    public static void printFileContent(Path path) throws IOException {
        System.out.println(Files.readString(path));
    }


}
