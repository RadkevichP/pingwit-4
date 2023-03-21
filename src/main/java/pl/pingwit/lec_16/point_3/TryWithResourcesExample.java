package pl.pingwit.lec_16.point_3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/**
 * @author Pavel Radkevich
 * @since 21.03.23
 */
public class TryWithResourcesExample {

    public static void main(String[] args) {

        String path = "src/main/java/pl/pingwit/lec_16/bad-romance.txt";
        File file = new File(path);

        try (InputStream inputStream = new FileInputStream(file)) {
            int data;
            while ((data = inputStream.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*try (InputStream inputStream = new FileInputStream(file)) {
            int data;
            byte[] bytes = new byte[16];
            while ((data = inputStream.read(bytes, 10, 10)) != -1) {
                System.out.println(Arrays.toString(bytes));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/

    }
}
