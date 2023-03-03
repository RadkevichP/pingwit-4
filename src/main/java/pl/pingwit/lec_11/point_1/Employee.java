package pl.pingwit.lec_11.point_1;

/**
 * @author Pavel Radkevich
 * @since 2.03.23
 */
public class Employee extends Human {

    private final String accessId;

    public Employee(String name, String surname, int yearOfBirth, String accessId) {
        super(name, surname, yearOfBirth);
        this.accessId = accessId;
    }

    @Override
    public int getYearOfBirth() {
        return 0;
    }

    public String getAccessId() {
        return accessId;
    }
}
