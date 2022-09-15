package helpers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FileUtils {
    private static final String PATH = "src/main/resources/";

    /**
     * Creates single file whit name SimpleDataFormat
     *
     * @return String name of the file
     * @throws IOException
     */
    public static String createTextFile() throws IOException {
        // Set file name with timestamp
        String fileName = new SimpleDateFormat("yyyyMMddHHmmssSS'.txt'").format(new Date());
        String pathString = PATH + fileName;
        File file = new File(pathString);
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (file.createNewFile()) {
            return fileName;
        } else {
            return null;
        }
    }

    /**
     * Inserts text to file
     *
     * @param fileName String the name of the file
     * @param text     String for inserting
     */
    public static void insertTextToFile(String fileName, String text) {
        try (FileWriter fileWriter = new FileWriter(fileName);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {

            printWriter.print(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Creates multiple files
     *
     * @param countOfFiles int count of files
     * @return List of String paths
     * @throws IOException
     */
    public static List<String> createFiles(int countOfFiles) throws IOException {
        List<String> fileStringPaths = new ArrayList<>();
        for (var i = 0; i < countOfFiles; i++) {
            fileStringPaths.add(PATH + FileUtils.createTextFile());
        }
        return fileStringPaths;
    }

    /**
     * Reads all content from a file
     * @param  fileName String file name
     * @throws IOException
     */
    public static void printFileContent(String fileName) throws IOException {
        Path path = Path.of(fileName);
        System.out.println(Files.readString(path));
    }

}
