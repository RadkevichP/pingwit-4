package pl.pingwit.lec_4.point_2;

/**
 * @author Pavel Radkevich
 * @since 2.02.23
 */
public class ReturnExample {

    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            System.out.println(i);

            if (i == 10) {
                System.out.println("Goodbye!");
                return;
            }
        }

        System.out.println("After cycle");

    }

}
