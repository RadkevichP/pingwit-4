package pl.pingwit.lec_5.point_1;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author Pavel Radkevich
 * @since 6.02.23
 */
public class ArrayExample {

    public static void main(String[] args) {

        int[] myIntArray2 = new int[]{3, 5, 7};  // 3, 5, 7

        /*int sum = 0;
        for (int i = 0; i < myIntArray2.length; i++) {
            sum += myIntArray2[i];
            System.out.println(myIntArray2[i]);
        }

        System.out.println(sum);*/


        int[] myEmptyArray = new int[10];

        for (int i = 0; i < myEmptyArray.length; i++) {
            myEmptyArray[i] = (int) (Math.random() * 10);
        }


        for (int i = 0; i < myEmptyArray.length; i++) {
            System.out.print(myEmptyArray[i]);
            System.out.print(", ");
        }

        System.out.println("");
        for (int element : myEmptyArray) {  // for each
            System.out.print(element);
        }

        System.out.println(" ");
        System.out.println(myEmptyArray);

        System.out.println(Arrays.toString(myEmptyArray));

    }

}
