package pl.pingwit.lec_3.point_2;

/**
 * @author Pavel Radkevich
 * @since 30.01.23
 */
public class TernaryExample {

    public static void main(String[] args) {

        printStatus(18);
        printStatus(25);
        printStatus(1);
        printStatus(44);

    }

    public static void printStatus(int age) {

        String information = "Человек ";
        // условие ? если истинно : если ложно

        String status = age >= 18 ? "несовершеннолетний" : "совершеннолетний";

        System.out.println(information + status);

    }
}
