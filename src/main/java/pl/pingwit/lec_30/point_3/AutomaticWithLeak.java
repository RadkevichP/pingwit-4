package pl.pingwit.lec_30.point_3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author pradkevich
 * @since 23.6
 */
public class AutomaticWithLeak {

    private static List<BigDecimal> BY_THREE = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            createGarbage();
        }
    }

    private static void createGarbage() {
        List<BigDecimal> result = new ArrayList<>();
        for (int i = 0; i < 700000; i++) {
            result.add(new BigDecimal(i));
            if (i % 3 == 0) {
                BY_THREE.add(new BigDecimal(i));
            }
        }
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Garbage created!");
    }
}
