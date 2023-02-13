package pl.pingwit.lec_7.point_1;

/**
 * @author Pavel Radkevich
 * @since 13.02.23
 */
public class ConditionExample {

    public static void main(String[] args) {

        boolean isPasswordCorrect = checkPassword();
        boolean checkFaceId = checkFaceId();

        if (isPasswordCorrect && checkFaceId) {
            System.out.println("Доступ разрешен!");
        }

        if (isPasswordCorrect || checkFaceId) {
            System.out.println("Доступ разрешен!");
        }

        if (isPasswordCorrect || checkFaceId) {
            System.out.println("Доступ разрешен!");
        }

        if (isPasswordCorrect & checkFaceId) {
            System.out.println("Доступ разрешен!");
        }

        System.out.println("The end!");
    }

    public static boolean checkPassword() {
        System.out.println("проверяем пароль......");
        return false;
    }

    public static boolean checkFaceId() {
        System.out.println("Проверяем ваш фейс....");
        return false;
    }
}
