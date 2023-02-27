package pl.pingwit.lec_10.point_2;

/**
 * @author Pavel Radkevich
 * @since 27.02.23
 */
public class EuroBankomat extends Bankomat{

    @Override
    protected String getCurrencyName() {
        return "EUR";
    }
}
