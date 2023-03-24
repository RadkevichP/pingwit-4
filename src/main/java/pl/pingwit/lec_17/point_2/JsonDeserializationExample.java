package pl.pingwit.lec_17.point_2;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import pl.pingwit.lec_17.point_1.FakeCar;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Pavel Radkevich
 * @since 23.03.23
 */
// json - JavaScript Object Notation
public class JsonDeserializationExample {

    public static void main(String[] args) {
        // jakson
        ObjectMapper objectMapper = new ObjectMapper();
        ObjectReader objectReader = objectMapper.readerFor(FakeCar.class);

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/main/java/pl/pingwit/lec_17/point_2/car.json"))) {
            byte[] bytes = bis.readAllBytes();
            FakeCar car = objectReader.readValue(bytes);
            System.out.println(car);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
