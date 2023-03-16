package pl.pingwit.lec_15.point_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Pavel Radkevich
 * @since 16.03.23
 */
public class FileExample {

    // Java IO Input Output
    public static void main(String[] args) throws IOException {

        // не используем String absolutePath = "/Users/pavelhomeair/Pingwit Course/pingwit-4/src/main/java/pl/pingwit/lec_15/point_2/bad-romance.txt"

        String path = "src/main/java/pl/pingwit/lec_15/point_2/img.png";
        File file = new File(path);

        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException exception) {
            if (scanner != null) {
                scanner.close();
            }
            System.out.println(exception.getMessage());
        }
    }

}
