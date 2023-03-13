package pl.pingwit.lec_14.point_1;

import org.apache.commons.lang3.RandomUtils;

/**
 * @author Pavel Radkevich
 * @since 13.03.23
 */
public class PhotoService {

    public byte[] loadPhoto(String address) throws PingwitCheckedException { // сигнатура метода
        if (RandomUtils.nextBoolean()) {
            throw new PingwitCheckedException("Error connecting to server...");
        }
        return RandomUtils.nextBytes(50);
    }

    public byte[] editPhoto(byte[] photo) {
        if (RandomUtils.nextBoolean()) {
            throw new PingwitUncheckedException("Error during photo processing...");
        }
        System.out.println("Photo is ready!");
        return RandomUtils.nextBytes(photo.length);
    }

}
