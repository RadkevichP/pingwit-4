package pl.pingwit.lec_6;

/**
 * @author Pavel Radkevich
 * @since 9.02.23
 */
public class ConstructorExample {

    public static void main(String[] args) {

        int myAge = 33;
        String myName = "Pavel";
        String myEmail = "test";
        boolean isForeigner = false;

        Student student = new Student(33, "Pavel", "test", false);
        System.out.println(student);

        Student student1 = new Student(myAge, myName);
        System.out.println(student1);


    }
}
