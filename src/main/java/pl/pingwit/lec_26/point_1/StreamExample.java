package pl.pingwit.lec_26.point_1;

import pl.pingwit.lec_26.Phone;
import pl.pingwit.lec_26.PhoneShort;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Pavel Radkevich
 * @since 1.05.23
 */
public class StreamExample {

    public static void main(String[] args) {

        List<Phone> phones = List.of(
                new Phone("Apple", "IPhone 11", 2018, "12ee12"),
                new Phone("Apple", "IPhone 11", 2018, "12ee13"),
                new Phone("Apple", "IPhone 11", 2018, "12ee14"),
                new Phone("Apple", "IPhone 12", 2020, "12ee100"),
                new Phone("Apple", "IPhone 13", 2021, "12ee120"),
                new Phone("Samsung", "S21", 2018, "ss123"),
                new Phone("Samsung", "S21", 2018, "ss124"),
                new Phone("Samsung", "S21", 2018, "ss125"),
                new Phone("Samsung", "S22", 2020, "ss12333"),
                new Phone("Samsung", "S22", 2020, "ss12334"),
                new Phone("Samsung", "S22", 2020, "ss12334"),
                new Phone("Xiaomi", "Redmi 10", 2020, "xi333111"),
                new Phone("Xiaomi", "Redmi 11", 2021, "xi444111"),
                new Phone("Xiaomi", "Redmi 12", 2020, "xi777888"));

        // промежуточный intermediate - вызываются от 0 до n раз
        // терминальный terminal - вызывается 1 раз

        // stream pipeline
        List<Phone> apple = phones.stream()
                .filter(phone -> phone.getBrand().equals("Apple"))
                .filter(phone -> phone.getYear() > 2018)
                .collect(Collectors.toList());

        System.out.println(apple);
        System.out.println(phones);


        Set<String> brands = phones.stream()
                .map(Phone::getBrand)
                .collect(Collectors.toSet());

        System.out.println(brands);

        List<PhoneShort> phoneShorts = phones.stream()
                .map(phone -> new PhoneShort(phone.getBrand(), phone.getModel()))
                .distinct()
                .toList();

        System.out.println(phoneShorts);

        phones.stream()
                .filter(phone -> phone.getBrand().equals("Samsung"))
                .forEach(phone -> System.out.println(phone.getSerialNumber()));


        for (Phone phone : phones) {
            if (phone.getBrand().equals("Samsung")) {
                System.out.println(phone.getSerialNumber());
            }
        }

        Stream<PhoneShort> distinctShortsStream = phones.stream()
                .map(phone -> new PhoneShort(phone.getBrand(), phone.getModel()))
                .distinct();

        distinctShortsStream.forEach(System.out::println);

    }
}
