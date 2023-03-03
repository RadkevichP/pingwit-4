package pl.pingwit.lec_11.point_1;

/**
 * @author Pavel Radkevich
 * @since 2.03.23
 */
public class OOPMain {

    public static void main(String[] args) {

        Human pavel = new Human("Pavel", "Radkevich", 1990);
        Student studentIvan = new Student("Ivan", "Ivanof", 1989, "KPI");
        Employee employee = new Employee("Ivan", "Ivanof", 1989, "My Access ID");

        /*pavel.breathe();
        studentIvan.breathe();
        employee.breathe();*/

        Animal[] animals = new Animal[]{pavel, studentIvan, employee};

        for (Animal animal : animals) {
            animal.breathe();
        }

        Human[] humans = new Human[]{pavel, studentIvan, employee};

        for (Human human : humans) {
            human.walk();
            human.breathe();
        }


    }
}
