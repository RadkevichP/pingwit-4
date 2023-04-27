package pl.pingwit.lec_25.point_1;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author Pavel Radkevich
 * @since 27.04.23
 */
public class MethodReferencesMain {

    public static void main(String[] args) {

        Predicate<Integer> evenChecker = MathHelper::isEven;

        MathHelper mathHelper = new MathHelper();

        Predicate<Integer> positiveChecker = mathHelper::isPositive;
        Predicate<Integer> posChecker = mathHelper::isPositive;

        int hundred = 100;
        Predicate<Integer> isBiggerThan = number -> number > hundred;

    }
}
