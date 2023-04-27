package pl.pingwit.lec_25.point_2;

import java.util.function.Predicate;

/**
 * @author Pavel Radkevich
 * @since 27.04.23
 */
public class PredicateMain {

    public static void main(String[] args) {

        Predicate<String> isLongerThanTen = s -> s.length() > 10;

        boolean truyuyuy = isLongerThanTen.test("truyuyuy");
        boolean truyuyuy2 = isLongerThanTen.test("truyuyuykjherfkjefhkerjhfkrej");

    }
}
