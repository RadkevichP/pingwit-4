package pl.pingwit.lec_28.point_2;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.pingwit.lec_28.point_2.entity.Pingwit;
import pl.pingwit.lec_28.point_2.entity.PingwitShorten;

import java.io.IOException;
import java.io.InputStream;

public class JacksonJsonReaderExample {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        InputStream resource = ClassLoader.getSystemResourceAsStream("lec_28/point_2/pingwit.json");
        PingwitShorten pingwitShorten = mapper.readValue(resource, PingwitShorten.class);
        System.out.println(pingwitShorten);


        resource = ClassLoader.getSystemResourceAsStream("lec_28/point_2/pingwit.json");
        Pingwit pingwit = mapper.readValue(resource, Pingwit.class);
        System.out.println(pingwit);
    }
}
