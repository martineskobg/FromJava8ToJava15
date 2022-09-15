package estafet.java12;

import estafet.java12.task3.Student;
import helpers.FileUtils;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import static estafet.java12.task2.CompactFormatting.*;
import static estafet.java12.task3.StudentUtils.*;
import static helpers.FileUtils.createFiles;

public class Main {
    public static void main(String[] args) throws IOException {
        // *************** Task 1 Java 12 **************************//
        System.out.println("\nTask 1");
        String textForFile1AndFile2 = "Lorem Ipsum is simply dummy text";
        String textForFile3 = "Lorem Ipsum is *simply dummy text";

        // Create 3 new txt files and add theirs paths to list
        List<String> fileStringPaths = createFiles(3);

        String fileName1 = fileStringPaths.get(0);
        String fileName2 = fileStringPaths.get(1);
        String fileName3 = fileStringPaths.get(2);

        // Insert text n file1
        FileUtils.insertTextToFile(fileName1, textForFile1AndFile2);
        // Insert text n file2
        FileUtils.insertTextToFile(fileName2, textForFile1AndFile2);
        // Insert text n file3
        FileUtils.insertTextToFile(fileName3, textForFile3);
        // Set new paths for each file
        Path pathToFile1 = Path.of(fileName1);
        Path pathToFile2 = Path.of(fileName2);
        Path pathToFile3 = Path.of(fileName3);

        // Check if two files are equal by suing mismatch()
        long mismatchFile1andFile2 = Files.mismatch(pathToFile1, pathToFile2);
        long mismatchFile2andFile3 = Files.mismatch(pathToFile2, pathToFile3);

        System.out.println("Result after compering file1 and file2: " + mismatchFile1andFile2);
        System.out.println("Result after compering file2 and file3: " + mismatchFile2andFile3);

        // *************** Task 2 Java 12 **************************//
        System.out.println("\nTask 2");
        NumberFormat nfShort = setShortFormat();
        NumberFormat nfLong = setLongFormat();
        List<Long> longNumbers = Arrays.asList(1500L, 1500000L, 1200000000L);


        // Print compact short format
        System.out.println("\nPrint compact short format");
        printFormattedNumber(nfShort, longNumbers);

        // Print compact long format
        System.out.println("\nPrint compact long format");
        printFormattedNumber(nfLong, longNumbers);


        // Print compact rounded down short format
        System.out.println("\nPrint compact rounded down short format");
        printCompactRoundedDownShort(nfShort, longNumbers);

        // Print compact rounded up long format
        System.out.println("\nPrint compact rounded up long format");
        printCompactRoundedUpLong(nfLong, longNumbers);

        // *************** Task 3 Java 12 **************************//
        System.out.println("\nTask 3");

        List<Student> students = Arrays.asList(
                new Student("Martin", 5.50),
                new Student("Martin2", 5.50),
                new Student("Ivo", 3.40),
                new Student("Ani", 6.00),
                new Student("Desi", 4.00),
                new Student("Rado", 6.00),
                new Student("Maria", 6.00),
                new Student("Ivan", 3.40),
                new Student("Ivan1", 5.40),
                new Student("Ivan2", 5.59),
                new Student("Ivan3", 5.80));

        System.out.println("Students with max and min grade");
        HashMap<String, Student> result = getMaxAndMinStudentGrades(students);
        System.out.println(result);

        // Print all students with max grade

        System.out.println(collectStudentsWithExcellentGrade(students));

        // Print all students with excellent grade
        System.out.println("\nStudents count with excellent grade: " + getCountOfExcellentGrades(students));
        System.out.println();

        // *************** Task 4 Java 12 **************************//
        System.out.println("Task 4");
        String str = "Lorem Ipsum is simply dummy text of the printing and typesetting industry." +
                "\nLorem Ipsum has been the industry's standard dummy";

        System.out.println("Print a given string indented");
        System.out.println(str.indent(5));
        System.out.println("Print the string using describeConstable()");
        // Returns an {@link Optional} containing the nominal descriptor for this instance, which is the instance itself.
        Optional<String> optionalStr = str.describeConstable();
        System.out.println(optionalStr);
        System.out.println(optionalStr.get());

        System.out.println("\nPrint the string using resolveConstantDesc()");
        // Resolves this instance as a ConstantDesc, the result of which is the instance itself
        System.out.println(str.resolveConstantDesc(MethodHandles.lookup()));
    }
}
