package pl.pingwit.lec_28.point_2;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.pingwit.lec_28.point_2.entity.PingwitShorten;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class JacksonJsonWriterExample {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        InputStream resource = ClassLoader.getSystemResourceAsStream("lec_28/point_2/pingwit.json");
        PingwitShorten pingwitShorten = mapper.readValue(resource, PingwitShorten.class);
        System.out.println(pingwitShorten);


        String asString = mapper.writeValueAsString(pingwitShorten);
        System.out.println(asString);

        File output = new File("src/main/java/pl/pingwit/lec_28/point_2/pingwit_output.json");
        mapper.writeValue(output, pingwitShorten);
    }
}
