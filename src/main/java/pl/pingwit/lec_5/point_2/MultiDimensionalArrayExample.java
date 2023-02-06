package pl.pingwit.lec_5.point_2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Pavel Radkevich
 * @since 6.02.23
 */
public class MultiDimensionalArrayExample {

    public static void main(String[] args) {

        int[][] twoDimensionalArray = new int[8][3];

        int[] myArray = new int[] {5,2};

        System.out.println(myArray.length);

        System.out.println(twoDimensionalArray.length);
        for (int i = 0; i < twoDimensionalArray.length; i++) {

            int[] ints = twoDimensionalArray[i];
            for (int i1 = 0; i1 < ints.length; i1++) {
                ints[i1] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < twoDimensionalArray.length; i++) {
            System.out.println(Arrays.toString(twoDimensionalArray[i]));
        }

    }
}
