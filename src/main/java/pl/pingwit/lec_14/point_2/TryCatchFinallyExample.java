package pl.pingwit.lec_14.point_2;

import pl.pingwit.lec_14.point_1.PhotoService;
import pl.pingwit.lec_14.point_1.PingwitCheckedException;

import java.util.Arrays;

/**
 * @author Pavel Radkevich
 * @since 13.03.23
 */
public class TryCatchFinallyExample {

    // final - для классов, методов и полей
    // finally - для блоков try

    public static void main(String[] args) {
        PhotoService photoService = new PhotoService();
        String address = "https://google-photo.com/145";
        byte[] photo = new byte[0];

        try {
            photo = photoService.loadPhoto(address);
        } catch (PingwitCheckedException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Подчищаем хвосты");
        }
        System.out.println(Arrays.toString(photo));
    }
}
