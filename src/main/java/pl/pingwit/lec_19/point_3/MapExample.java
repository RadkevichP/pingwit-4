package pl.pingwit.lec_19.point_3;

import pl.pingwit.lec_19.point_2.Auto;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Pavel Radkevich
 * @since 30.03.23
 */
public class MapExample {

    public static void main(String[] args) {

        Auto auto = new Auto("Audi", "A1");
        Auto auto1 = new Auto("Audi", "A2");
        Auto auto2 = new Auto("Audi", "A3");
        Auto auto3 = new Auto("Audi", "A4");
        Auto auto4 = new Auto("Audi", "A4");
        Auto auto5 = new Auto("Audi", "A8");

        Map<Auto, Integer> autoMap = new HashMap<>();

        autoMap.put(auto, 5);
        autoMap.put(auto2, 20);
        autoMap.put(auto4, 10);
        autoMap.putIfAbsent(auto4, 155);

        //auto.setModel("AAA");
        System.out.println(autoMap.get(auto));

        System.out.println(autoMap);

        if (autoMap.containsKey(auto5)) {
            Integer integer = autoMap.get(auto5);
            System.out.println(integer.intValue());
        }

        Set<Map.Entry<Auto, Integer>> entries = autoMap.entrySet();
        for (Map.Entry<Auto, Integer> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        Collection<Integer> values = autoMap.values();
        boolean b = autoMap.containsKey(auto4);
        System.out.println(b);

    }
}
