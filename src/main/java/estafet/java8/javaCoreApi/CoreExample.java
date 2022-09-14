package org.estafet.java8.javaCoreApi;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.zip.ZipFile;

public class CoreExample {
    public static void main(String[] args) throws IOException {
        String MY_DIRECTORY = "C:\\Users\\Martin\\Downloads\\TestZip.zip";
        String ZIP_FILE = "TestZip.zip";
        Core core = new Core();
        double firstDouble = 5.25;
        double secondDouble = 3.14;

        List<Integer> naturalOrderedList = core.creatListOfIntegers(10, 10, 100);
        // Natural Ordered list
        naturalOrderedList.sort(Comparator.naturalOrder());
        naturalOrderedList.forEach(System.out::println);
        System.out.println("\nPrint the list in reverse order");
        // Revers order
        naturalOrderedList.sort(Comparator.reverseOrder());
        naturalOrderedList.forEach(System.out::println);
        System.out.println("----------------------------------");

        System.out.println("Print min of 2 doubles");
        System.out.println("First double: " + firstDouble);
        System.out.println("Second double: " + secondDouble);
        System.out.println("Min = " + core.getMinOsTwoDoubles(firstDouble, secondDouble));
        System.out.println("----------------------------------");

        System.out.println("Print max of 2 doubles");
        System.out.println("First double: " + firstDouble);
        System.out.println("Second double: " + secondDouble);
        System.out.println("Max = " + core.getMaxOsTwoDoubles(firstDouble, secondDouble));
        System.out.println("----------------------------------");

        System.out.println("Print the sum of 2 doubles");
        double sum = core.sumTwoDoubles(firstDouble, secondDouble);
        System.out.println(firstDouble + " + " + secondDouble + " = " + sum);
        System.out.println("----------------------------------");

        ZipFile  zipFile = core.getTheContentOfZip(MY_DIRECTORY);
        // Using Math.toIntExact
        int countOfZippedFiles = Math.toIntExact(zipFile.stream().count());
        System.out.println("Count of zipped files: " + countOfZippedFiles);
        System.out.println("----------------------------------");

        System.out.println("All files in the zip:");
        zipFile.stream().forEachOrdered(System.out::println);
        System.out.println("----------------------------------");

        //addExact(), subtractExact(), multiplyExact(), toIntExact(), incrementExact(), decrementExact() in Math
        long firstLong =  3L;
        long secondLong = 5L;
        long thirdLong = 8L;
        System.out.println("Example of addExact: " + Math.addExact(firstLong, secondLong));
        System.out.println("Example of subtractExact: " + Math.subtractExact(firstLong, secondLong));
        System.out.println("Example of multiplyExact: " + Math.multiplyExact(firstLong, secondLong));
        System.out.println("Example of toIntExact: " + Math.toIntExact(thirdLong));
        System.out.println("Example of incrementExact: " + Math.incrementExact(thirdLong));
        System.out.println("Example of decrementExact: " + Math.decrementExact(secondLong));


    }
}
