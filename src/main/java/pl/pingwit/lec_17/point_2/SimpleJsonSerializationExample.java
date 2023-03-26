package pl.pingwit.lec_17.point_2;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.pingwit.lec_17.point_1.Car;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Pavel Radkevich
 * @since 26.03.23
 */
public class SimpleJsonSerializationExample {

    public static void main(String[] args) {

        Car car = new Car();
        car.setBrand("Skoda");
        car.setModel("Octavia");
        car.setStatus("active");

        ObjectMapper mapper = new ObjectMapper();
        File file = new File("src/main/java/pl/pingwit/lec_17/point_2/octavia.json");
        try {
            mapper.writeValue(file, car);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
