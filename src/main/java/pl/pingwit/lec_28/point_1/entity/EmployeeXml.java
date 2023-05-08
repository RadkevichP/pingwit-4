package pl.pingwit.lec_28.point_1.entity;

import java.util.List;

public class EmployeeXml {
    private String id;
    private String firstName;
    private String lastName;
    private String location;
    private String gender;

    private List<ProgrammingLanguage> skills;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<ProgrammingLanguage> getSkills() {
        return skills;
    }

    public void setSkills(List<ProgrammingLanguage> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Employee{" +
            "id='" + id + '\'' +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", location='" + location + '\'' +
            ", gender='" + gender + '\'' +
            ", skills=" + skills +
            '}';
    }

}
