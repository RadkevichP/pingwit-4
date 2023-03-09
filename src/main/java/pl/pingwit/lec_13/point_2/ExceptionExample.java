package pl.pingwit.lec_13.point_2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Pavel Radkevich
 * @since 9.03.23
 */
public class ExceptionExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Введите число:");
            try {
                int input = scanner.nextInt();
                System.out.println(100 / input);
            } catch (ArithmeticException exception) {
                System.out.println("Ошибка в вычислениях " + exception.getMessage());
            } catch (InputMismatchException exception) {
                String problem = scanner.next();
                System.out.println("Вы неправильно вводите, нужно число, a не " + problem);
            }
        }
    }
}
