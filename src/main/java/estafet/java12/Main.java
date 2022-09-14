package estafet.java12;

import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.NumberFormat;
import java.util.*;
import java.util.stream.Collectors;

import static estafet.java12.CompactFormatting.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // *************** Task 1 Java 12 **************************//
        Path path1 = Paths.get("src/main/resources/file1.txt");
        Path path2 = Paths.get("src/main/resources/file2.txt");
        Path path3 = Paths.get("src/main/resources/file3.txt");

        String textForFile1AndFile2 = "Lorem Ipsum is simply dummy text";
        String textForFile3 = "Lorem Ipsum is *simply dummy text";

        MyFile.createTextFile(path1, textForFile1AndFile2);
        MyFile.createTextFile(path2, textForFile1AndFile2);
        MyFile.createTextFile(path3, textForFile3);

        long mismatchFile1andFile2 = Files.mismatch(path1, path2);
        long mismatchFile2andFile3 = Files.mismatch(path2, path3);

        System.out.println("Result after compering file1 and fil1: " + mismatchFile1andFile2);
        System.out.println("Result after compering file2 and fil3: " + mismatchFile2andFile3);

        // *************** Task 2 Java 12 **************************//
        NumberFormat nfShort = setShortFormat();
        NumberFormat nfLong = setLongFormat();

        // Print compact short format
        System.out.println("\nPrint compact short format");
        printFormattedNumber(nfShort, 1500);
        printFormattedNumber(nfShort, 1500000);
        printFormattedNumber(nfShort, 1200000000);

        // Print compact long format
        System.out.println("\nPrint compact long format");
        printFormattedNumber(nfLong, 1500);
        printFormattedNumber(nfLong, 1500000);
        printFormattedNumber(nfLong, 1200000000);

        // Print compact rounded down short format
        System.out.println("\nPrint compact rounded down short format");
        printCompactRoundedDownShort(nfShort, 1500);
        printCompactRoundedDownShort(nfShort, 1500000);
        printCompactRoundedDownShort(nfShort, 1200000000);


        // Print compact rounded up long format
        System.out.println("\nPrint compact rounded up long format");
        printCompactRoundedUpLong(nfLong, 1500);
        printCompactRoundedUpLong(nfLong, 1500000);
        printCompactRoundedUpLong(nfLong, 1200000000);

        // *************** Task 3 Java 12 **************************//
        List<Student> students = new ArrayList<>();
        students.add(new Student("Martin", 5.50));
        students.add(new Student("Ivo", 3.40));
        students.add(new Student("Ani", 6.00));
        students.add(new Student("Desi", 4.00));
        students.add(new Student("Rado", 6.00));
        students.add(new Student("Maria", 6.00));
        students.add(new Student("Ivan", 3.40));


        HashMap<String, Student> result = students.stream().collect(
                Collectors.teeing(
                        // Get max and min grade
                        Collectors.maxBy(Comparator.comparing(Student::getGrade)),
                        Collectors.minBy(Comparator.comparing(Student::getGrade)),
                        (s1, s2) -> {
                            HashMap<String, Student> map = new HashMap<>();
                            map.put("Student with MAX grade", s1.get());
                            map.put("Student with MIN grade", s2.get());
                            return map;
                        }
                ));
        System.out.println("\nStudents with max and min grade");
        System.out.println(result);


        Map<Double, List<Student>> byGrade = students.stream().collect(Collectors.groupingBy(Student::getGrade));
        double maxGrade = Collections.max(byGrade.keySet());
        // Print all students with max grade
        System.out.println("\nStudents with excellent grade");
        for (Map.Entry<Double, List<Student>> entry : byGrade.entrySet()) {
            if (entry.getKey() == maxGrade) {
                entry.getValue().forEach(student ->
                        System.out.println("Student Name: " + student.getName() + " grade: " + student.getGrade()));
            }
        }
        System.out.println();

        // *************** Task 4 Java 12 **************************//
        String str = "Lorem Ipsum is simply dummy text of the printing and typesetting industry." +
                "\nLorem Ipsum has been the industry's standard dummy";

        System.out.println("Print a given string indented");
        System.out.println(str.indent(5));
        System.out.println("Print the string using describeConstable()");
        Optional<String> optionalStr = str.describeConstable();
        System.out.println(optionalStr);
        System.out.println(optionalStr.get());

        System.out.println("\nPrint the string using resolveConstantDesc()");
        System.out.println(str.resolveConstantDesc(MethodHandles.lookup()));
    }
}
