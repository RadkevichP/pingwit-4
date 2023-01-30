package pl.pingwit.lec_3.point_4;

/**
 * @author Pavel Radkevich
 * @since 30.01.23
 */
public class ForLoopExample {

    public static void main(String[] args) {

        int fatBurned = 0;

        for (int i = 0; i < 10; i+=3) {
            System.out.println("я отжался");
            System.out.println("текущее значение счетчика: " + i);
            fatBurned += 5;
        }

        System.out.println("Я сжег жира: " + fatBurned);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
