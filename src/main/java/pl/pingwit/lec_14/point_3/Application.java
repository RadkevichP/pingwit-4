package pl.pingwit.lec_14.point_3;

import pl.pingwit.lec_14.point_1.PingwitCheckedException;

/**
 * @author Pavel Radkevich
 * @since 13.03.23
 */
public class Application {

    public static void main(String[] args) {
        PhotoServiceInterface serviceInterface = new PingwitPhotoService();

        try {
            serviceInterface.loadPhoto("address");
        } catch (PingwitCheckedException e) {
            e.printStackTrace();
        }

        PingwitPhotoService photoService = new PingwitPhotoService();
        photoService.loadPhoto("adress");
    }
}
