package estafet.java9.try_with_resources_2_3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class FileContent {
    /**
     * Copy content of file into another file
     *
     * @param files  File
     * @param target File
     * @throws IOException
     */
    public void copyFileContent(List<File> files, File target) throws IOException {
        // Statement with one or more resources
        // which should be closed once it is no more required
        for (File file : files) {
            try (FileInputStream fis = new FileInputStream(file);
                 FileOutputStream out = new FileOutputStream(target, true)) {
                int n;
                while ((n = fis.read()) != -1) {
                    out.write(n);
                }
                // Here decimal value 10 represents newline in ASCII
                out.write(10);
            }
        }
    }
}
