package pl.pingwit.lec_14.point_1;

import java.util.Arrays;

/**
 * @author Pavel Radkevich
 * @since 13.03.23
 */
public class Application {

    public static void main(String[] args) {
        String address = "https://google-photo.com/145";

        PhotoService photoService = new PhotoService();

        byte[] bytes = new byte[0];
        // пример для checked exception
        try {
            bytes = photoService.loadPhoto(address);
        } catch (PingwitCheckedException e) {
            System.out.println(e.getMessage());
        }
        // --- конец примера для чекед экспешен

        // пример unchecked exception
        byte[] editedPhoto = photoService.editPhoto(bytes);

        System.out.println(Arrays.toString(editedPhoto));
    }
}
