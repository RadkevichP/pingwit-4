package pl.pingwit.lec_15.point_1;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author Pavel Radkevich
 * @since 16.03.23
 */
public class DateTimeFinalExamples {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2022, 12, 15);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDate date2 = date.plusDays(100);
        System.out.println(date2);

        boolean after = date.isAfter(date2);
        System.out.println(after);

    }
}
