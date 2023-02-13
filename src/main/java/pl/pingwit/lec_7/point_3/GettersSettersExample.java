package pl.pingwit.lec_7.point_3;

/**
 * @author Pavel Radkevich
 * @since 13.02.23
 */
public class GettersSettersExample {

    public static void main(String[] args) {

        Car car = new Car("Skoda", "Fabia", 123456);
        int wheelsNumber = car.WHEELS_NUMBER;

        int wheelsNumber1 = Car.WHEELS_NUMBER;
        Car.printCommonCarInfo();


        System.out.println(wheelsNumber1);
    }


    public void fillTheFuel(Car car) {
        car.setFuel(30);
    }

}
