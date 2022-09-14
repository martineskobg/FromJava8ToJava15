package estafet.java11;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/main/resources/test.txt");
        String text = "   Lorem Ipsum is\n SasaT dsdw asq\n wdwqd dqwdq   ";

        // *************** Task 1 Java 11 **************************//
        System.out.println("Task 1 Strings");
        System.out.println("strip(): "  + text.strip());
        System.out.println("stripLeading(): " + text.stripLeading());
        System.out.println("stripTrailing(): " + text.stripTrailing());
        System.out.println("isBlank(): " + " ".isBlank());
        System.out.println("repeat(3): " + "Hello".repeat(3));
        System.out.println("lines(): ");
        Stream<String> stream =  text.lines();
        stream.forEach(System.out::println);
        System.out.println();

        // *************** Task 2 Java 11 **************************//
        var intArray = new int[]{11, 44, 3, 4, 59, 16, 87, 81, 2, 100};
        var number = 99;
        var count = LocalVariable.getCount(intArray, number);
        System.out.println(count);

        // *************** Task 3 Java 11 **************************//
        MyFileCreator.createTextFile(path, text);
        MyFileCreator.printFileContent(path);
    }
}
