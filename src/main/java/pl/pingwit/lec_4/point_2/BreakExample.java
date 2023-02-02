package pl.pingwit.lec_4.point_2;

/**
 * @author Pavel Radkevich
 * @since 2.02.23
 */
public class BreakExample {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 0; i < 10; i++) {

            System.out.println("Hello! " + i);

            sum += 1;
            if (sum == 5) {
                break;
            }

        }
        System.out.println(sum);

        System.out.println("After cycle");
    }
}
