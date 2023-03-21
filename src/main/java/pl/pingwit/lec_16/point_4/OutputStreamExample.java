package pl.pingwit.lec_16.point_4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author Pavel Radkevich
 * @since 21.03.23
 */
public class OutputStreamExample {

    public static void main(String[] args) {
        String path = "src/main/java/pl/pingwit/lec_16/output.txt";
        File file = new File(path);

        try (OutputStream outputStream = new FileOutputStream(file)) {
            outputStream.write("Hello from Pingwit".getBytes());

            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
