package estafet.java8.javaBase64.javaNIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaNewIO {

    /**
     * Get list of all files
     * @param dirName String - certain folder dir
     * @return List of Strings
     */
    public List<String> fileList(String dirName) {
        File workingDir = new File(dirName);
        File[] files = workingDir.listFiles();
        List<File> fileList = new ArrayList<>(Arrays.asList(files));
        return fileList.stream().map(File::getName).collect(Collectors.toList());
    }

    /**
     * Get list of all directories
     *
     * @param dirName String - certain folder dir
     * @return List of Strings
     */
    public List<String> dirList(String dirName) {
        List<String> dirList = new ArrayList<>();
        File workingDir = new File(dirName);
        File[] dirs = workingDir.listFiles();
        for (File f : dirs) {
            if (f.isDirectory()) {
                dirList.add(f.getName());
            }
        }
        return dirList;
    }

    /**
     * Find files containing some specific word in its name in a certain folder
     *
     * @param word String
     * @param dir  String
     * @return List of Path
     * @throws IOException
     */
    public List<Path> findFilesByWord(String word, String dir) throws IOException {
        Path path = Paths.get(dir);
        List<Path> result;
        try (Stream<Path> pathStream = Files.find(path,
                1,
                (p, basicFileAttributes) ->

                        p.getFileName().toString().contains(word)
        )) {
            result = pathStream.collect(Collectors.toList());
        }
        return result;
    }

    /**
     * Print only a certain line of a file by reading it line by line using Files.lines()
     *
     * @param line     int
     * @param dir      String
     * @param fileName String
     * @return String
     * @throws IOException
     */
    public String getLineOfAFile(int line, String dir, String fileName) throws IOException {
        Path path = Paths.get(dir + "\\" + fileName);
        String result;
        try (Stream<String> lines = Files.lines(path)) {
            result = lines.skip(line - 1).findFirst().orElse(null);
        }
        return result;
    }

    /**
     * Print the content of the file without empty lines by reading it line by line using BufferedReader.lines()
     *
     * @param dir      String
     * @param fileName String
     * @return List of Strings
     * @throws IOException
     */
    public List<String> getAllLinesOfFile(String dir, String fileName) throws IOException {
        try (FileReader fileReader = new FileReader(dir + "\\" + fileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            return bufferedReader.lines().filter(l -> l.length() > 0).collect(Collectors.toList());
        }
    }


}
