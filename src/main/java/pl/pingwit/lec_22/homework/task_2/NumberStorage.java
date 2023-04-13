package pl.pingwit.lec_22.homework.task_2;

/**
 * @author Pavel Radkevich
 * @since 13.04.23
 */
public class NumberStorage <T extends Number>  {

    private final T[] numbers;

    public NumberStorage(T[] numbers) {
        this.numbers = numbers;
    }

    public T[] getNumbers() {
        return numbers;
    }
}
