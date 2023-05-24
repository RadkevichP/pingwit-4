package pl.pingwit.lec_31.point_3;

import pl.pingwit.lec_31.point_2.Counter;

import java.util.Objects;

/**
 * @author Pavel Radkevich
 * @since 18.05.23
 */
public class SynchronizedCounter extends Counter {

    private int number = 0;

    public int getNumber() {
        return number;
    }

    @Override
    public void increment() {
        synchronized (this) {
            number++;
        }
    }

    @Override
    public void decrement() {
        synchronized (this) {
            number--;
        }
    }
}
