package pl.pingwit.lec_18.point_2;

import pl.pingwit.lec_17.point_1.Car;

import java.util.*;

/**
 * @author Pavel Radkevich
 * @since 27.03.23
 */
public class ListExample {

    public static void main(String[] args) {
        String[] strings = new String[]{"trt", "reret", "sdeer", "rytyt"};

        // в домашних работах
        List<Car> cars = new ArrayList<>();

        List<String> stringList = Arrays.asList(strings);

        int sumLength = 0;
        for (String s : stringList) {
            sumLength += s.length();
            System.out.println(s);
        }

        for (int i = 0; i < stringList.size(); i++) {
            /// stringList[i];
            stringList.get(i);
            System.out.println(stringList.get(i));
        }

        // не отработает!!
        /*for (String s : stringList) {
            stringList.remove(s);
        }*/


        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
           iterator.remove();
        }

        System.out.println(stringList);

        // неизменяемая коллекция
        List<String> unmodifiableList = List.of("rereer", "reretet", "weewre");
        //unmodifiableList.add("DDD");

    }
}
