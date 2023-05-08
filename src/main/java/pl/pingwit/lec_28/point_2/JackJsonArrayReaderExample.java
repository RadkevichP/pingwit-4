package pl.pingwit.lec_28.point_2;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class JackJsonArrayReaderExample {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        InputStream resource = ClassLoader.getSystemResourceAsStream("lec_28/point_2/json_array.json");

        List<String> lectures = objectMapper.readValue(resource, new TypeReference<>() {
        });

        System.out.println(lectures);
    }

}
