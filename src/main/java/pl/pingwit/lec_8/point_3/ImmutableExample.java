package pl.pingwit.lec_8.point_3;

import java.util.Arrays;

/**
 * @author Pavel Radkevich
 * @since 16.02.23
 */
public class ImmutableExample {

    public static void main(String[] args) {
        Car carFromInternet = new Car("KIA", "Rio", EngineType.PETROL);

        System.out.println(carFromInternet);
        String brand = carFromInternet.getBrand();
        // ошибка программиста
        carFromInternet.setBrand("Ford");

        System.out.println("Save to database" + carFromInternet);

        ImmutableCar kiaSportage = new ImmutableCar("KIA", "Sportage", EngineType.DIESEL, new int[]{1, 2, 3, 4, 5});

        int[] seats = kiaSportage.getSeats();
        seats[1] = 777;

        System.out.println(kiaSportage);
        System.out.println(Arrays.toString(seats));


        CarRecord carRecord = new CarRecord("Audi", "A4", EngineType.DIESEL, new int[]{1, 2, 3, 4, 5});
        CarRecord carRecord2 = new CarRecord("Audi", "A4", EngineType.DIESEL, new int[]{1, 2, 3, 4, 5});

        System.out.println("Сравнить рекорды " + carRecord.equals(carRecord2));

        char[] chars = "анна".toCharArray();
        new String(chars);

    }
}
