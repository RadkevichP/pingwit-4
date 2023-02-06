package pl.pingwit.lec_5.point_4;

import java.util.Arrays;

/**
 * @author Pavel Radkevich
 * @since 6.02.23
 */
public class BubbleSortExample {
    public static void main(String[] args) {
        int[] arrayToSort = {1, 5, 2, 2, 0};
        System.out.println(Arrays.toString(arrayToSort));

        boolean needToSort = true;

        while (needToSort) {
            needToSort = false;

            for (int i = 1; i < arrayToSort.length; i++) {
                if (arrayToSort[i] < arrayToSort[i - 1]) {
                    swap(arrayToSort, i, i - 1);
                    needToSort = true;
                }
            }
        }

        System.out.println(Arrays.toString(arrayToSort));
    }

    private static void swap(int[] array, int left, int right) {
        int tmp = array[right];
        array[right] = array[left];
        array[left] = tmp;
    }
}
