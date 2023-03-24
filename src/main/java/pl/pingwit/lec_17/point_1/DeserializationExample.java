package pl.pingwit.lec_17.point_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author Pavel Radkevich
 * @since 23.03.23
 */
public class DeserializationExample {

    public static void main(String[] args) {

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/main/java/pl/pingwit/lec_17/point_1/fabia"));) {
            Car car = (Car) objectInputStream.readObject();

            System.out.println(car);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
