package estafet.java11;

import helpers.FileUtils;

import java.io.IOException;
import java.util.stream.Stream;

import static estafet.java11.LocalVariable.getCountGreaterThan;
import static estafet.java11.LocalVariable.getCountLesThan;

public class Main {

    public static void main(String[] args) throws IOException {
        String text = "   Lorem Ipsum is\n SasaT dsdw asq\n wdwqd dqwdq   ";

        // *************** Task 1 Java 11 **************************//
        System.out.println("\nTask 1 Strings methods");
        System.out.println("strip(): " + text.strip());
        System.out.println("\nstripLeading(): " + text.stripLeading());
        System.out.println("\nstripTrailing(): " + text.stripTrailing());
        System.out.println("\nWhite space Blank()  : " + " ".isBlank());
        System.out.println("\nNew line isBlank(): " + "\n".isBlank());
        System.out.println("\nEmpty string isBlank(): " + "".isBlank());

        System.out.println("\nrepeat(3): " + "Hello".repeat(3));
        System.out.println("\nlines(): ");
        Stream<String> stream = text.lines();
        stream.forEach(System.out::println);
        System.out.println();

        // *************** Task 2 Java 11 **************************//
        // Return the count of numbers greater than a given number
        System.out.println("\nTask 2");
        var intArray = new int[]{11, 44, 3, 4, 59, 16, 87, 81, 2, 100};
        var number = 81;
        var countGreaterThan = getCountGreaterThan(intArray, number);
        var countLessThan = getCountLesThan(intArray, number);
        System.out.println("The count off all numbers Greater than "+ number + " is: " + countGreaterThan);
        System.out.println("The count off all numbers Less than "+ number + " is: " + countLessThan);

        // *************** Task 3 Java 11 **************************//
        //read/write string to and from files:
        //- readString()
        //- writeString()
        System.out.println("\nTask 3");
        String filename = FileUtils.createFiles(1).get(0);
        FileUtils.insertTextToFile(filename, text);
        FileUtils.printFileContent(filename);
    }
}
