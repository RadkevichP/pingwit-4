package pl.pingwit.lec_4.point_3;

import java.util.Scanner;

/**
 * @author Pavel Radkevich
 * @since 2.02.23
 */
public class ScannerExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = scanner.next();

        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello, " + name + age + " years old!");

    }
}
