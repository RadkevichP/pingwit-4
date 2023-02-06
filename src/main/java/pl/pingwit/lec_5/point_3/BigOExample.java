package pl.pingwit.lec_5.point_3;


/**
 * @author Pavel Radkevich
 * @since 6.02.23
 */
public class BigOExample {

    public static void main(String[] args) {

        // [5, -2, 10, 100, 1 ,0, -70]  -> 5 o(n) n - количество элементов в массиве
        // [-70, -2, 0   o(log(n))

        int myInt = 7;
        int myInt2 = 5;



        int sum = sum(myInt, myInt2);
        for (int i = 0; i < 100; i++) {
            System.out.println("h");    // o(n)
        }
    }

    static void printArray(int[] array) {         // o(n)  n - количество элементов в массиве
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    static void printArray(int[][] array) {         // o(n2)  n - количество элементов в массиве
        for (int i = 0; i < array.length; i++) {
            for (int i1 : array[i]) {
                System.out.println(i1);
            }
        }
        System.out.println("st");
    }

    public static int sum(int arg1, int arg2) {
        return arg1 + arg2;
    }
}
