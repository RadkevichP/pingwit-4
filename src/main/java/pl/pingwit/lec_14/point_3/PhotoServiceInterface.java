package pl.pingwit.lec_14.point_3;

import pl.pingwit.lec_14.point_1.PingwitCheckedException;

/**
 * @author Pavel Radkevich
 * @since 13.03.23
 */
public interface PhotoServiceInterface {

    byte[] loadPhoto(String address) throws PingwitCheckedException;
}
