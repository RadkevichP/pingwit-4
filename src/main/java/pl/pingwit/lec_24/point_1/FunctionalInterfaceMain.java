package pl.pingwit.lec_24.point_1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author Pavel Radkevich
 * @since 20.04.23
 */
public class FunctionalInterfaceMain {

    public static void main(String[] args) {

        MyFunctionalInterface myFunctionalInterface1 = new MyFunctionalInterface() {
            @Override
            public String test(String name) {
                return "Hello, " + name + "!";
            }
        };

        Supplier<Integer> mySupplier = () -> Integer.MAX_VALUE;
        Supplier<Integer> myPrivateSupplier = FunctionalInterfaceMain::myInt;

        System.out.println(mySupplier.get());
        System.out.println(myPrivateSupplier.get());

        MyFunctionalInterface myFunctionalInterface = name -> "Hello, " + name + "!";

        String pavel = myFunctionalInterface.test("Pavel");
        System.out.println(pavel);

        calculate(myPrivateSupplier);

        Predicate<Integer> integerPredicate = myMethod();
        Predicate<Integer> isEven = b -> b % 2 == 0;
        Predicate<String> isEmpty = s -> s.length() == 0;

        List<Predicate<Integer>> predicates = new ArrayList<>();
        predicates.add(myMethod());
        predicates.add(integerPredicate);
        predicates.add(isEven);

        boolean test = predicates.get(1).test(11);
        System.out.println(test);

        // first-class citizen

    }

    private static Integer myInt() {
        return Integer.MIN_VALUE;
    }

    private static void calculate(Supplier<Integer> integerSupplier) {
        System.out.println(integerSupplier.get() / 2);
    }

    private static Predicate<Integer> myMethod() {
        return b -> b > 10;
    }
}
