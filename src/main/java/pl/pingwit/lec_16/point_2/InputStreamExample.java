package pl.pingwit.lec_16.point_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Pavel Radkevich
 * @since 21.03.23
 */
public class InputStreamExample {

    public static void main(String[] args) {

        String path = "src/main/java/pl/pingwit/lec_16/bad-romance.txt";
        File file = new File(path);

        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);

            int data;
            while ((data = inputStream.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // NullPointerException
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
