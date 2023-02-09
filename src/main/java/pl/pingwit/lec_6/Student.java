package pl.pingwit.lec_6;

/**
 * @author Pavel Radkevich
 * @since 9.02.23
 */
public class Student {

    static String COUNTRY_CODE;

    int age;
    String name;
    String email;
    boolean isForeigner;

    static {
        System.out.println("запрос к базе данных...");
        COUNTRY_CODE = "PL";
    }

    {
        System.out.println("Hello from init block");
        email = "test@email.com";
    }

    public Student() {
        System.out.println("Student is created!");
    }

    public Student(int age) {
        this.age = age;
    }

    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    public Student(int age, String name, String email, boolean isForeigner) {
        this.age = age;
        this.name = name;
        this.email = email;
        this.isForeigner = isForeigner;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", isForeigner=" + isForeigner +
                '}';
    }
}
