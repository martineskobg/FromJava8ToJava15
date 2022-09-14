package estafet.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MyFileCreator {

    /**
     * Write a CharSequence to a file.
     * @param path Path
     * @param text String
     * @throws IOException
     */
    public static void createTextFile(Path path, String text) throws IOException {
        Files.writeString(path, text);
    }

    /**
     * Reads all content from a file
     * @param path Path
     * @throws IOException
     */
    public static void printFileContent(Path path) throws IOException {
        System.out.println(Files.readString(path));
    }
}
