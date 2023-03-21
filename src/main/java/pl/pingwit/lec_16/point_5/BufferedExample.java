package pl.pingwit.lec_16.point_5;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Pavel Radkevich
 * @since 21.03.23
 */
public class BufferedExample {

    public static void main(String[] args) {

        String inputPath = "src/main/java/pl/pingwit/lec_16/bad-romance.txt";

        try (InputStream inputStream = new FileInputStream(inputPath);
             BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream)) {

            byte[] bytes = new byte[3000];
            while ((bufferedInputStream.read(bytes)) != -1) {
                for (byte aByte : bytes) {
                    System.out.print((char) aByte);
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
