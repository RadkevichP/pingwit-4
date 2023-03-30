package pl.pingwit.lec_19.point_2;

import java.util.*;

/**
 * @author Pavel Radkevich
 * @since 30.03.23
 */
public class SetExample {

    public static void main(String[] args) {

        Auto auto = new Auto("Audi", "A1");
        Auto auto1 = new Auto("Audi", "A2");
        Auto auto2 = new Auto("Audi", "A3");
        Auto auto3 = new Auto("Audi", "A4");
        Auto auto4 = new Auto("Audi", "A4");
        Auto auto5 = new Auto("Audi", "A4");

        List<Auto> autoList = new ArrayList<>(List.of(auto, auto1, auto2, auto3, auto4, auto5));
        System.out.println(autoList);
        System.out.println("---------------------");
        Set<Auto> autos = new HashSet<>(autoList);
       /* autos.add(auto);
        autos.add(auto1);
        autos.add(auto2);
        autos.add(auto3);
        autos.add(auto4);*/

        System.out.println(autos);
        System.out.println(autos.size());

        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("Ppopo");
        sortedSet.add("Brrrr");
        sortedSet.add("Arrr");
        sortedSet.add("Brrrr");

        SortedSet<Double> doubleSortedSet = new TreeSet<>();
        doubleSortedSet.add(5.55d);
        doubleSortedSet.add(1.55d);
        doubleSortedSet.add(0.55d);
        System.out.println(doubleSortedSet);
        System.out.println(sortedSet);

    }
}
