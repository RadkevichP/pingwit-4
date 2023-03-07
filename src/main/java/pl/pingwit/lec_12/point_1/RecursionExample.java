package pl.pingwit.lec_12.point_1;

/**
 * @author Pavel Radkevich
 * @since 7.03.23
 */
public class RecursionExample {

    public static void main(String[] args) {
        // получить сумму от 0 до 10
        int recursiveSum = sumRecursive(11);
        System.out.println("recursice: " + recursiveSum);
    }

    // сумма через рекурсию
    private static int sumRecursive(int to) {
        if (to <= 0) {
            return 0;
        } else {
            return to + sumRecursive(to - 2);
        }
    }

    // сумма через цикл
    private static int sumLoop(int to) {
        int sum = 0;
        for (int i = 0; i <= to; i++) {
            sum += i;
        }
        return sum;
    }
}
