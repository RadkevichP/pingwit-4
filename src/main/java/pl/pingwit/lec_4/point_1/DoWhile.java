package pl.pingwit.lec_4.point_1;

/**
 * @author Pavel Radkevich
 * @since 2.02.23
 */
public class DoWhile {

    public static void main(String[] args) {

        int pigWeight = 201;

        do {
            System.out.println("текущий вес " + pigWeight);
            System.out.println("дал поросенку 20 кг");
            pigWeight += 20;
        }
        while (pigWeight < 200);

        System.out.println("Поросенок весит " + pigWeight);
    }
}
