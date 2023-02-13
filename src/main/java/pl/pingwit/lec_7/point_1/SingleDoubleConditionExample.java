package pl.pingwit.lec_7.point_1;

/**
 * @author Pavel Radkevich
 * @since 13.02.23
 */
public class SingleDoubleConditionExample {

    public static void main(String[] args) {
        if (checkFaceId() && checkPassword()) {
            System.out.println("мы рады вам!");
        }

    }

    public static boolean checkFaceId() {
        System.out.println("Проверяем ваш фейс....");
        return false;
    }

    public static boolean checkPassword() {
        System.out.println("проверяем пароль......");
        return true;
    }
}
