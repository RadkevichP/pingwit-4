package pl.pingwit.lec_18.point_3;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author Pavel Radkevich
 * @since 27.03.23
 */
public class LinkedListExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(120);

        arrayList.add("t");
        arrayList.add("t");
        arrayList.add("t");
        arrayList.add("t");
        arrayList.add("t");
        arrayList.add(0, "p");
        arrayList.get(8);

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add(0,"trtrt");
        linkedList.get(10);

        System.out.println(arrayList);
    }
}
