package pl.pingwit.lec_4.point_3;


import java.util.Scanner;

/**
 * @author Pavel Radkevich
 * @since 2.02.23
 */
public class InteractiveSportsman {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter percentage:");
        double percent = scanner.nextDouble();

        System.out.println("Enter days:");
        int days = scanner.nextInt();

        double distance = 10;
        double totalDistance = 0;
        for (int i = 1; i < days; i++) {
            distance = distance + (distance * (percent / 100));
            totalDistance += distance;
        }
        System.out.println("Total distance: " + totalDistance);

    }
}
