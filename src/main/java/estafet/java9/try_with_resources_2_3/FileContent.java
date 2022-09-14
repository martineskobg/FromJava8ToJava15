package estafet.java9.try_with_resources_2_3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileContent {

    public void copyFileContent(File content, File target) throws IOException {
        try (FileInputStream in = new FileInputStream(content);
             FileOutputStream out = new FileOutputStream(target, true)) {
            int n;
            while ((n = in.read()) != -1) {
                out.write(n);
            }
            // Here decimal value 10 represents newline in ASCII
            out.write(10);
        }
    }
}
