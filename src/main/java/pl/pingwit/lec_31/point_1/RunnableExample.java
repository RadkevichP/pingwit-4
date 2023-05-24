package pl.pingwit.lec_31.point_1;

/**
 * @author Pavel Radkevich
 * @since 18.05.23
 */
public class RunnableExample {

    public static void main(String[] args) {

        Runnable task = () -> {
            System.out.println("solving task");
        };
        task.run();

        System.out.println("hello from main");
    }
}
