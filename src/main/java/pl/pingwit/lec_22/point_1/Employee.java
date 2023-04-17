package pl.pingwit.lec_22.point_1;

/**
 * @author Pavel Radkevich
 * @since 13.04.23
 */
@Deprecated
public class Employee {

    private String name;
    private String department;
    private float ratePerHour;

    public Employee() {
    }

    public Employee(String name, String department, float ratePerHour) {
        this.name = name;
        this.department = department;
        this.ratePerHour = ratePerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public float getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", ratePerHour=" + ratePerHour +
                '}';
    }
}
