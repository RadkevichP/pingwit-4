package pl.pingwit.lec_3.point_3;

/**
 * @author Pavel Radkevich
 * @since 30.01.23
 */
public class SwitchExample {

    public static void main(String[] args) {

        int day = 12;

        switch (day) {
            // if (day == 1) {}
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("такого дня недели не существует: " + day);
        }

        System.out.println("The end!");

    }
}
