package pl.pingwit.lec_25.point_4;

import pl.pingwit.lec_17.point_1.Car;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Pavel Radkevich
 * @since 27.04.23
 */
public class FunctionMain {

    public static void main(String[] args) {
        Function<String, Integer> lengthMapper = s -> s.length() / 2;

        Function<String, String> lll = s -> s + " " + "khjbekrjvbk";

        Function<List<Car>, Set<String>> carToBrandMapper = cars -> {
            Set<String> brands = new HashSet<>();
            for (Car car : cars) {
                brands.add(car.getBrand());
            }
            return brands;
        };

        Function<Car, String> brandMappper2 = car -> car.getBrand();
        List<Car> cars = new ArrayList<>();

        List<String> collect = cars.stream()
                .map(brandMappper2)
                .toList();

        String opopop = lll.apply("opopop");
        System.out.println(opopop);

        Integer apple = lengthMapper.apply("Apple");
        System.out.println(apple);
    }
}
