package pl.pingwit.lec_28.point_1;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import pl.pingwit.lec_28.point_1.entity.EmployeeXml;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class JacksonXmlParserExample {
    public static void main(String[] args) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();

        InputStream resource = ClassLoader.getSystemResourceAsStream("lec_28/point_1/employee.xml");

        List<EmployeeXml> employees = xmlMapper.readValue(resource, new TypeReference<>() {});

        employees.forEach(System.out::println);
    }

}
