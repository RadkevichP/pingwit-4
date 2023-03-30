package pl.pingwit.lec_19.point_4;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author Pavel Radkevich
 * @since 30.03.23
 */
public class SortedMapExample {

    public static void main(String[] args) {

        Map<String, Integer> months = new TreeMap<>();

        months.put("Jan", 31);
        months.put("Dec", 31);
        months.put("Aug", 31);
        months.put("Jul", 31);
        months.put("Oct", 30);

        System.out.println(months);
    }
}
