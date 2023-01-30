package pl.pingwit.lec_3.point_1;

/**
 * @author Pavel Radkevich
 * @since 30.01.23
 */
public class IfExample {

    public static void main(String[] args) {

        // boolean Boolean

        /* if (false) {
            System.out.println("Hello World!");
        }
        System.out.println("The end!");*/

        //findWinner("Шахтер", 12, "Динамо", 5);
        findWinner("Шахтер", 5, "Динамо", 5);
    }

    public static void findWinner(String team1, int score1, String team2, int score2) {
        if (score1 > score2) {
            System.out.println(team1 + " победила!");
        } else if (score2 > score1) {
            System.out.println("команда " + team2 + " победила!");
        } else {
            System.out.println("Ничья!");
        }
    }
}
