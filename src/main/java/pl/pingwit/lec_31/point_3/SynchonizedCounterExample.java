package pl.pingwit.lec_31.point_3;

import pl.pingwit.lec_31.point_2.Counter;
import pl.pingwit.lec_31.point_2.DecrementorThread;
import pl.pingwit.lec_31.point_2.IncrementorThread;

/**
 * @author Pavel Radkevich
 * @since 18.05.23
 */
public class SynchonizedCounterExample {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new SynchronizedCounter();

        IncrementorThread incrementorThread = new IncrementorThread(counter);
        IncrementorThread incrementorThread2 = new IncrementorThread(counter);

        DecrementorThread decrementorThread = new DecrementorThread(counter);
        DecrementorThread decrementorThread2 = new DecrementorThread(counter);

        incrementorThread.start();
        incrementorThread2.start();
        decrementorThread.start();
        decrementorThread2.start();

        incrementorThread.join();
        incrementorThread2.join();
        decrementorThread.join();
        decrementorThread2.join();

        System.out.println(counter.getNumber());
    }
}
