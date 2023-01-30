package pl.pingwit.lec_3.point_3;

/**
 * @author Pavel Radkevich
 * @since 30.01.23
 */
public class Switch17Example {

    public static void main(String[] args) {

        int month = 2;

        switch (month) {
            case 1, 2, 12 -> System.out.println("Winter");
            case 3, 4, 5 -> System.out.println("Spring");
            case 6, 7, 8 -> System.out.println("Summer");
            case 9, 10, 11 -> System.out.println("Autumn");
            default -> System.out.println("No such month! " + month);
        }

    }
}
