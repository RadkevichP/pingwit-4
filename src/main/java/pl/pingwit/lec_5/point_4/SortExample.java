package pl.pingwit.lec_5.point_4;

import java.util.Arrays;

/**
 * @author Pavel Radkevich
 * @since 6.02.23
 */
public class SortExample {

    public static void main(String[] args) {

        int[] myArray =new  int[] {3, -9, 10, 3};

        System.out.println(Arrays.toString(myArray));

        Arrays.sort(myArray);

        System.out.println(Arrays.toString(myArray));

        int index = Arrays.binarySearch(myArray, 3);
        System.out.println(index);
    }
}
