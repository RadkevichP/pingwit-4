package pl.pingwit.lec_20.point_2;

import pl.pingwit.lec_19.point_2.Auto;
import pl.pingwit.lec_20.point_1.Address;
import pl.pingwit.lec_9.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pavel Radkevich
 * @since 3.04.23
 */
public class InstanceOfExample {

    public static void main(String[] args) {

        Address address = new Address("Minsk", "Losika", 12, 34);
        Auto auto = new Auto("VW", "Polo");
        String random = "ehirghieughir";

        List<Object> objects = List.of(address, auto, random);

        // object instanceOf Class
        processObjectsDependingOnClass(objects);

        processObjectsDependingOnClassJava17(objects);

    }

    private static void processObjectsDependingOnClass(List<Object> objects) {

        for (Object object : objects) {
            if (object instanceof Address) {
                Address castedAddress = (Address) object;
                System.out.println(castedAddress.getCity());
            } else if (object instanceof Auto) {
                Auto castedAuto = (Auto) object;
                System.out.println(castedAuto.getBrand());
            }
        }

    }

    private static void processObjectsDependingOnClassJava17(List<Object> objects) {
        for (Object object : objects) {
            if (object instanceof Address castedAddress) {
                System.out.println(castedAddress.getCity());
            } else if (object instanceof Auto castedAuto) {
                System.out.println(castedAuto.getBrand());
            }
        }
    }

}
