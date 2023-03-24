package pl.pingwit.lec_17.point_2;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.pingwit.lec_17.point_1.Car;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Pavel Radkevich
 * @since 23.03.23
 */
public class SerializationExample {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        Car car = new Car();
        car.setBrand("Skoda");
        car.setModel("Octavia");
        car.setStatus("active");

        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/main/java/pl/pingwit/lec_17/point_2/octavia.json"))) {
            byte[] bytes = objectMapper.writeValueAsBytes(car);
            bos.write(bytes);
            bos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
