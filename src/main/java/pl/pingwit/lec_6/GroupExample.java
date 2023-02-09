package pl.pingwit.lec_6;

/**
 * @author Pavel Radkevich
 * @since 9.02.23
 */
public class GroupExample {

    public static void main(String[] args) {

        String university = Group.UNIVERSITY;  // доступ к константе

        Student student1 = new Student(25, "Alex", "test", true);
        Student student2 = new Student(25, "Nino", "test", true);
        Student student3 = new Student(25, "Anna", "test", true);
        Student student4 = new Student(25, "Vita", "test", true);

        Student[] students = new Student[]{student1, student2, student3, student4};

        Group group = new Group("25C30", students);
        System.out.println(group);

    }
}
