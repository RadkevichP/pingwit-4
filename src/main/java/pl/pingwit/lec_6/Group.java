package pl.pingwit.lec_6;

import java.util.Arrays;

/**
 * @author Pavel Radkevich
 * @since 9.02.23
 */
public class Group {

    static final String UNIVERSITY = "БГУ";  // константа

    String groupName;
    Student[] students;

    public Group(String groupName, Student[] students) {
        this.groupName = groupName;
        this.students = students;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
