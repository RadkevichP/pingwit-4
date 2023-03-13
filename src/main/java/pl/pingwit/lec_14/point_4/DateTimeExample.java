package pl.pingwit.lec_14.point_4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 * @author Pavel Radkevich
 * @since 13.03.23
 */
public class DateTimeExample {

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalDate of = LocalDate.of(1990, 03, 01);
        LocalDate of1 = LocalDate.of(1990, Month.MARCH, 1);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        String formattedNow = dateTimeFormatter.format(now);

        // парсить строку в дату - это значит преобразовать строку в объект Java
        DateTimeFormatter forParser = DateTimeFormatter.ofPattern("yyyy-dd-MM");
        String strangeFormat = "01-1990-03";
        LocalDate fromString = LocalDate.parse("1990-03-01", forParser);

        System.out.println(dateTimeFormatter.format(fromString));

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy : HH/mm/ss/ms");
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTimeFormatter1.format(dateTime));

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
    }
}
