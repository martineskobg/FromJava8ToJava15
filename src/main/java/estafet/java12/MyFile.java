package estafet.java12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MyFile {
    public static void createTextFile(Path path, String text) throws IOException {
        Files.writeString(path, text);
    }
}
