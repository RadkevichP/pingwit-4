package pl.pingwit.lec_10.point_2;

/**
 * @author Pavel Radkevich
 * @since 27.02.23
 */
public abstract class Bankomat {

    public String getCash(int amount) {
        String currencyName = getCurrencyName();
        String message = "Возьмите ваши " + amount + currencyName;

        return message;
    }

    protected abstract String getCurrencyName();

}
