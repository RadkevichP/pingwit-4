package pl.pingwit.lec_21.point_2;

import java.util.*;

/**
 * @author Pavel Radkevich
 * @since 5.04.23
 */


public class LoginApplication {

    public static final String EXIT = "exit";
    public static final String SKIP = "skip";

    public static void main(String[] args) {

        Set<String> usernames = new TreeSet<>();
        usernames.add("Pavel");
        usernames.add("Anna");
        usernames.add("Illia");

        Scanner scanner = new Scanner(System.in);

        // exit
        while (true) {
            System.out.println("Enter your username: ");
            String username = scanner.nextLine();
            if (username.equalsIgnoreCase(EXIT)) {
                break;
            }
            if (usernames.contains(username)) {
                System.out.println("Hello, " + username);
            } else {
                System.out.println("Not found: " + username);
                System.out.println("If you want to register, enter your name. If you want to skip - enter 'skip'");
                String newName = scanner.nextLine();
                if (!newName.equalsIgnoreCase(SKIP)) {
                    System.out.println("Hello, " + newName + " you are registered!");
                    usernames.add(newName);
                } else {
                    continue;
                }
            }
        }

    }

}
