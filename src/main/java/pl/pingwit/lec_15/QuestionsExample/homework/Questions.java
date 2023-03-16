package pl.pingwit.lec_15.QuestionsExample.homework;

import java.util.Arrays;

/**
 * @author Pavel Radkevich
 * @since 16.03.23
 */
public class Questions {

    public static void main(String[] args) {

        String[] strings = new String[]{"ddd", "aaa", "ccc"};

        String pupa = "pupa";

        strings[2] = pupa;
        strings[0] = null;

        System.out.println(Arrays.toString(strings));

        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));

    }
}
