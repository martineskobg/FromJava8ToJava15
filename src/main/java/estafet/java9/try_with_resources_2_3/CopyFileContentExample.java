package org.estafet.java9.try_with_resources_2_3;

import java.io.File;
import java.io.IOException;

public class CopyFileContentExample {
    public static void main(String[] args) throws IOException {
        final String MY_DIRECTORY = "C:\\Users\\Martin\\Downloads";
        final String FIRST_CONTENT_FILE_NAME = "file1.txt";
        final String SECOND_CONTENT_FILE_NAME = "file2.txt";
        final String TARGET_FILE_NAME = "target.txt";

        FileContent fc = new FileContent();

        String firstContentPath = MY_DIRECTORY + "\\" + FIRST_CONTENT_FILE_NAME;
        File firstContentFile = new File(firstContentPath);

        String secondContentPath = MY_DIRECTORY + "\\" + SECOND_CONTENT_FILE_NAME;
        File secondContentFile = new File(secondContentPath);

        String targetPath = MY_DIRECTORY + "\\" + TARGET_FILE_NAME;
        File targetFile = new File(targetPath);

        fc.copyFileContent(firstContentFile, targetFile);
        fc.copyFileContent(secondContentFile, targetFile);
    }
}
