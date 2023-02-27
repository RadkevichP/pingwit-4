package pl.pingwit.lec_10;

import pl.pingwit.lec_10.point_2.Bankomat;
import pl.pingwit.lec_10.point_2.EuroBankomat;

/**
 * @author Pavel Radkevich
 * @since 27.02.23
 */
public class Application {

    public static void main(String[] args) {

        Bankomat bankomat = new EuroBankomat();

        String message = bankomat.getCash(10);
        System.out.println(message);
    }
}
