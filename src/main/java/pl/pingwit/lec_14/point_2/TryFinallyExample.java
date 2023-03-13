package pl.pingwit.lec_14.point_2;

import org.apache.commons.lang3.RandomUtils;
import pl.pingwit.lec_14.point_1.PhotoService;

import java.util.Arrays;

/**
 * @author Pavel Radkevich
 * @since 13.03.23
 */
public class TryFinallyExample {

    public static void main(String[] args) {
        PhotoService photoService = new PhotoService();
        byte[] photo = RandomUtils.nextBytes(50);
        byte[] editedPhoto;
        try {
            editedPhoto = photoService.editPhoto(photo);
        } finally {
            System.out.println("Подчищаем хвосты, закрываем ресурсы");
        }
        System.out.println(Arrays.toString(editedPhoto));
    }
}
