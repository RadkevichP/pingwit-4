package pl.pingwit.lec_28.point_2.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PingwitShorten {
//    @JsonProperty("firstname")
//    private String firstName;
    @JsonProperty("pavel")
    private String lastName;
    private String name;
    private List<PingwitStudent> students;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PingwitStudent> getStudents() {
        return students;
    }

    public void setStudents(List<PingwitStudent> students) {
        this.students = students;
    }


    @Override
    public String toString() {
        return "PingwitShorten{" +
                "lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
