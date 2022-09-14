package org.estafet.java8.javaBase64.javaNIO;

import java.io.IOException;

public class NioExample {

    public static void main(String[] args) throws IOException {
        String MY_DIRECTORY = "C:\\Users\\Martin\\Downloads";
        String WORD = "postgresql";
        JavaNewIO javaNewIO = new JavaNewIO();

        System.out.println("\nList of all files in " + MY_DIRECTORY);
        javaNewIO.fileList(MY_DIRECTORY).forEach(System.out::println);
        System.out.println("----------------------------------");

        System.out.println("\nList of all directories in " + MY_DIRECTORY);
        javaNewIO.dirList(MY_DIRECTORY).forEach(System.out::println);
        System.out.println("----------------------------------");

        System.out.println("\nFind files containing some specific word in a certain folder");
        javaNewIO.findFilesByWord(WORD, MY_DIRECTORY).forEach(System.out::println);
        System.out.println("----------------------------------");

        System.out.println("\nPrint only a certain line of a file by reading it line by line by using Files.lines()");
        System.out.println(javaNewIO.getLineOfAFile(4, MY_DIRECTORY, "text.txt"));
        System.out.println("----------------------------------");

        System.out.println(" Print the content of the file without empty lines by reading it line by line by using BufferedReader.lines()");
        javaNewIO.getAllLinesOfFile(MY_DIRECTORY, "Text2.txt").forEach(System.out::println);
    }
}
