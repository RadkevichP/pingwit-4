package pl.pingwit.lec_30.point_1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author pradkevich
 * @since 23.6
 */
public class DummyService {

    private int version = 1;
    private List<BigDecimal> someData = new ArrayList<>();

    public void doUselessWork() {
        List<BigDecimal> trash = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            trash.add(createBigDecimal(i));
            if (i % 10 == 0) {
                someData.add(createBigDecimal(i));
            }
        }
        System.out.println("Dummy job is done!");
    }

    private BigDecimal createBigDecimal(int i) {
        return BigDecimal.valueOf(i);
    }

}
