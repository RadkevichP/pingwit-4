package pl.pingwit.lec_31.point_2;

/**
 * @author Pavel Radkevich
 * @since 18.05.23
 */
public class Counter {

    private int number = 0;

    public int getNumber() {
        return number;
    }

    // ------ 5 -> 6 -> set 6
    // ------ 5 -> 4 -> set 4
    public void increment() {
        // 1 get - read value
        // 2 increment +
        // 3 write
        number++;
    }

    public void decrement() {
        number--;
    }
}
