package estafet.java9.try_with_resources_2_3;

import helpers.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static helpers.FileUtils.createFiles;

public class CopyFileContentExample {
    public static void main(String[] args) throws IOException {
        // *** TASK 1 Copy content of 2 files into another one *** //
        final String FILE_ONE_TEXT = "Text in File 1";
        final String FILE_TWO_TEXT = "FILE 2 Text";

        // Create files
        System.out.println("Create Files");
        List<String> fileStringPaths = createFiles(3);


        FileContent fc = new FileContent();
        // Get paths
        System.out.println("Get paths");
        String firstContentPath = fileStringPaths.get(0);
        String secondContentPath = fileStringPaths.get(1);
        String targetPath = fileStringPaths.get(2);

        // Insert text
        System.out.println("Insert text");
        FileUtils.insertTextToFile(firstContentPath, FILE_ONE_TEXT);
        FileUtils.insertTextToFile(secondContentPath, FILE_TWO_TEXT);


        File firstContentFile = new File(firstContentPath);
        File secondContentFile = new File(secondContentPath);
        File targetFile = new File(targetPath);

        // Copy the content from one file to another
        System.out.println("Copy the content from one file to another");
        // Add content files in a List
        List<File> myFiles = new ArrayList<>(List.of(firstContentFile,secondContentFile));
        // Copy the content of all files in myFiles list into the target file
        fc.copyFileContent(myFiles, targetFile);
        System.out.println("Finished!");
    }
}
