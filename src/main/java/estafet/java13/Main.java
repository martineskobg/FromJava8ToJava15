package estafet.java13;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        listModules("src/main/resources");

    }
    public static void listModules(String javaHome) throws IOException {
        FileSystem fs = FileSystems.newFileSystem(
                URI.create("jrt:/"),
                Collections.singletonMap("java.home", javaHome));
        try (Stream<Path> stream = Files.list(fs.getPath("/modules"))) {
            stream.forEach(System.out::println);
        }
    }
}

