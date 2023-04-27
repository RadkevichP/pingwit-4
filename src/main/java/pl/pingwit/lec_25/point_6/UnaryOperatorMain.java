package pl.pingwit.lec_25.point_6;

import java.util.Locale;
import java.util.function.UnaryOperator;

/**
 * @author Pavel Radkevich
 * @since 27.04.23
 */
public class UnaryOperatorMain {

    public static void main(String[] args) {
        UnaryOperator<String> myOperator = s -> s.toLowerCase(Locale.ROOT);

        String str = myOperator.apply("TOAOIAOIJAOIAJO");
        System.out.println(str);

    }
}
