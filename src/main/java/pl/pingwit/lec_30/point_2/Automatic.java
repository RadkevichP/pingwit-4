package pl.pingwit.lec_30.point_2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author pradkevich
 * @since 23.6
 */
public class Automatic {

    public static void main(String[] args) {
        while (true) {
            createGarbage();
        }
    }

    private static void createGarbage() {
        List<BigDecimal> result = new ArrayList<>();
        try {
            Thread.sleep(3000);
        for (long i = 0; i < 100000; i++) {
            result.add(new BigDecimal(i));
        }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Garbage created!");
    }
}
