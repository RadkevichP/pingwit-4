package pl.pingwit.lec_25.point_3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Pavel Radkevich
 * @since 27.04.23
 */
public class ConsumerMain {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();

        Consumer<String> myConsumer = myList::add;

        myConsumer.accept("Mamama");
        System.out.println(myList);
    }
}
