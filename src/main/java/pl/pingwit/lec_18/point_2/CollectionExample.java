package pl.pingwit.lec_18.point_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Pavel Radkevich
 * @since 27.03.23
 */
public class CollectionExample {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();

        String myString = "Hello0";
        String myString2 = "Hello1";
        String myString3 = "Hello2";
        String myString4 = "Hello3";
        String myString5 = "Hello4";

        stringList.add(myString);  // добавляет элемент
        stringList.add(myString2);
        stringList.add(myString3);
        stringList.add(myString4);
        stringList.add(myString5);
        //stringList.add(2, "Pupa");

        boolean hello2 = stringList.contains("Hello2");  // содержит ли элемент
        int size = stringList.size();  // сколько элементов в коллекции
        int hello3 = stringList.indexOf("Hello3");  // выводит на каком месте стоит элемент
        boolean empty = stringList.isEmpty();  // пустая ли коллекция

        List<String> numbers = new LinkedList<>();
        numbers.add("One");
        numbers.add("Two");
        numbers.add("Three");
        numbers.add("Four");
        numbers.add("Five");

        // добавление одной коллекции в другую
        stringList.addAll(numbers);

        // получение суб-коллекции
        List<String> subList = numbers.subList(1, 3);
        //stringList.removeAll(subList);

        System.out.println(stringList);

        List<String> toRetain = new LinkedList<>();
        toRetain.add("One");
        toRetain.add("Two");
        toRetain.add("Three");
        toRetain.add("Four");
        // оставить только элементы, которые присутсивуют в двух коллекциях
        stringList.retainAll(toRetain);

        // удалить по значению
        stringList.remove("Hello0");
        // удалить по индексу
        stringList.remove(3);

        System.out.println(stringList);

    }
}
