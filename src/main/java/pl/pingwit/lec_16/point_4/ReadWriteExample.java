package pl.pingwit.lec_16.point_4;

import java.io.*;

/**
 * @author Pavel Radkevich
 * @since 21.03.23
 */
public class ReadWriteExample {

    public static void main(String[] args) {
        //String outputPath = "src/main/java/pl/pingwit/lec_16/output.txt";
        //String inputPath = "src/main/java/pl/pingwit/lec_16/bad-romance.txt";

        String inputPath = "src/main/java/pl/pingwit/lec_16/java.png";
        String outputPath = "src/main/java/pl/pingwit/lec_16/java-copy-stream.png";

        try (InputStream inputStream = new FileInputStream(inputPath);
             OutputStream outputStream = new FileOutputStream(outputPath)) {

            int data;
            while ((data = inputStream.read()) != -1) {
                outputStream.write(data);
                System.out.print((char) data);
                //outputStream.write("_".getBytes());
            }
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
