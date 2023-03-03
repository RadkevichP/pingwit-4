package pl.pingwit.lec_11.point_1;

/**
 * @author Pavel Radkevich
 * @since 2.03.23
 */
public class Student extends Human {

    private final String university;

    public Student(String name, String surname, int yearOfBirth, String university) {
        super(name, surname, yearOfBirth);
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    @Override
    public void breathe() {
        System.out.println("Студент дышит через раз");
    }
}
