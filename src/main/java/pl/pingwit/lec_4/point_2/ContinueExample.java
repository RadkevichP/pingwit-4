package pl.pingwit.lec_4.point_2;

/**
 * @author Pavel Radkevich
 * @since 2.02.23
 */
public class ContinueExample {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            if (i == 5) {
                continue;
            }

            System.out.println("i = " + i);
        }
    }
}
