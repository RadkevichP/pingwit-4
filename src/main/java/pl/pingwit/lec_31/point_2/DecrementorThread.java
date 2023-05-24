package pl.pingwit.lec_31.point_2;

/**
 * @author Pavel Radkevich
 * @since 18.05.23
 */
public class DecrementorThread extends Thread {

    private final Counter counter;

    public DecrementorThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.decrement();
        }
    }
}
