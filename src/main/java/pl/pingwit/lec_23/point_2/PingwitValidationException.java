package pl.pingwit.lec_23.point_2;

/**
 * @author Pavel Radkevich
 * @since 17.04.23
 */
public class PingwitValidationException extends RuntimeException {
    public PingwitValidationException(String message) {
        super(message);
    }
}
