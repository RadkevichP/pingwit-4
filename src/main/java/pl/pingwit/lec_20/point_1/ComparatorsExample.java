package pl.pingwit.lec_20.point_1;

import java.util.*;

/**
 * @author Pavel Radkevich
 * @since 3.04.23
 */
public class ComparatorsExample {

    public static void main(String[] args) {

        Address address = new Address("Minsk", "Losika", 12, 34);
        Address address2 = new Address("Kiev", "Shevchnko", 23, 33);
        Address address3 = new Address("Minsk", "Losika", 12, 38);
        Address address4 = new Address("Grodno", "Kolasa", 10, 34);
        Address address5 = new Address("Grodno", "Kolasa", 10, 11);
        Address address6 = new Address("Grodno", "Kolasa", 10, 1);


        List<Address> addresses = new ArrayList<>(List.of(address, address2, address3, address4, address5, address6));

        Comparator<Address> addressComparator = Comparator.comparing(Address::getCity)
                .thenComparing(Address::getStreet)
                .thenComparingInt(Address::getHouse)
                .thenComparingInt(Address::getApartment)
                .reversed();

        Comparator<Address> lyambdaCityComparator = (ad1, ad2) -> ad1.getCity().compareTo(ad2.getCity());

        addresses.sort(lyambdaCityComparator);

        ///addresses.sort(addressComparator);

        System.out.println(addresses);

        Set<Address> addressSet = new TreeSet<>(addressComparator);
        addressSet.addAll(addresses);

        System.out.println(addressSet);

    }
}
