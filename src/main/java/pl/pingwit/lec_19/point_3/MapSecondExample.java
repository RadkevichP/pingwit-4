package pl.pingwit.lec_19.point_3;

import pl.pingwit.lec_19.point_2.Auto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Pavel Radkevich
 * @since 30.03.23
 */
public class MapSecondExample {

    public static void main(String[] args) {

        Auto auto = new Auto("Audi", "A1");
        Auto auto1 = new Auto("Audi", "A2");
        Auto auto2 = new Auto("Audi", "A3");
        Auto auto3 = new Auto("Audi", "A4");

        Auto auto4 = new Auto("BMW", "3-series");
        Auto auto5 = new Auto("BMW", "5-series");

        Auto auto6 = new Auto("Mercedes", "Vito");

        List<Auto> autoList = new ArrayList<>(List.of(auto, auto1, auto2, auto3, auto4, auto5, auto6));

        Map<String, List<Auto>> autosByBrand = new HashMap<>();


        for (Auto car : autoList) {
            String brand = car.getBrand();
            if (autosByBrand.containsKey(brand)) {
                List<Auto> autoList1 = autosByBrand.get(brand);
                autoList1.add(car);
            } else {
                autosByBrand.put(brand, new ArrayList<>(List.of(car)));
            }
        }

        for (Map.Entry<String, List<Auto>> stringListEntry : autosByBrand.entrySet()) {
            System.out.println(stringListEntry.getKey() + " : " + stringListEntry.getValue());
        }


    }
}
