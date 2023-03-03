package pl.pingwit.lec_11.point_1;

/**
 * @author Pavel Radkevich
 * @since 2.03.23
 */
public class Human implements Animal, Walkable {

    private final String name;
    private final String surname;
    private final int yearOfBirth;

    public Human(String name, String surname, int yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public void breathe() {
        System.out.println("Вдох-выдох");
        //openMouth();
    }

    private void openMouth() {
        System.out.println("open");
    }

    @Override
    public void walk() {
        System.out.println("бегу вприпрыжку");
    }
}
