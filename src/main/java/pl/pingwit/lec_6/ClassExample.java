package pl.pingwit.lec_6;

/**
 * @author Pavel Radkevich
 * @since 9.02.23
 */
public class ClassExample {

    public static void main(String[] args) {

        Student firstStudent = new Student();

        firstStudent.age = 20;
        firstStudent.email= "test@gmail.com";
        firstStudent.name = "Nick";
        firstStudent.isForeigner = true;

        String studentString = firstStudent.toString();
        System.out.println("Our student " + studentString);

        Student secondStudent = new Student();
        System.out.println(secondStudent);

    }
}
