package pl.pingwit.lec_17.point_2;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.pingwit.lec_17.point_1.FakeCar;

import java.io.File;
import java.io.IOException;

/**
 * @author Pavel Radkevich
 * @since 26.03.23
 */
public class SimpleJsonDeserializationExample {

    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File("src/main/java/pl/pingwit/lec_17/point_2/car.json");

        try {
            FakeCar fakeCar = mapper.readValue(file, FakeCar.class);
            System.out.println(fakeCar);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
