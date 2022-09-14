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

        System.out.println("\nTask 1 Strings methods");
        System.out.println("strip(): "  + text.strip());
        System.out.println("\nstripLeading(): " + text.stripLeading());
        System.out.println("\nstripTrailing(): " + text.stripTrailing());
        System.out.println("\nisBlank(): " + " ".isBlank());
        System.out.println("\nrepeat(3): " + "Hello".repeat(3));
        System.out.println("\nlines(): ");
        Stream<String> stream =  text.lines();
        stream.forEach(System.out::println);
        System.out.println();

        // *************** Task 2 Java 11 **************************//
        // Return the count of numbers greater than a given number
        System.out.println("\nTask 2");
        var intArray = new int[]{11, 44, 3, 4, 59, 16, 87, 81, 2, 100};
        var number = 80;
        var count = LocalVariable.getCount(intArray, number);
        System.out.println("Count is: " + count);

        // *************** Task 3 Java 11 **************************//
        //read/write string to and from files:
        //- readString()
        //- writeString()
        System.out.println("\nTask 3");
        MyFileCreator.createTextFile(path, text);
        MyFileCreator.printFileContent(path);
    }
}
