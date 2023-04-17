package pl.pingwit.lec_23.point_1;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Pavel Radkevich
 * @since 17.04.23
 */
public class JaksonAnnotationsExample {

    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        AccountInformation accountInformation = new AccountInformation("Pavel", "Radkevich", "iuhiu@kj.tu");

        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/main/java/pl/pingwit/lec_23/point_1/account.json"))) {
            byte[] bytes = mapper.writeValueAsBytes(accountInformation);
            bos.write(bytes);
            bos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
