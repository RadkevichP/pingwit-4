package pl.pingwit.lec_17.point_1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author Pavel Radkevich
 * @since 23.03.23
 */
public class SerializationExample {

    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("Skoda");
        car.setModel("Fabia");
        car.setStatus("active");

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/main/java/pl/pingwit/lec_17/point_1/fabia"))) {
            objectOutputStream.writeObject(car);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
