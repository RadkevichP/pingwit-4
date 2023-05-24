package pl.pingwit.lec_31.point_4;

import pl.pingwit.lec_31.point_2.Counter;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Pavel Radkevich
 * @since 18.05.23
 */
public class AtomicCounter extends Counter {

    Integer myInt = 8;

    private AtomicInteger number = new AtomicInteger(0);

    public int getNumber() {
        return number.get();
    }

    public void increment() {
        number.incrementAndGet();
    }

    public void decrement() {
        number.decrementAndGet();
    }
}
