package pl.pingwit.lec_7.point_2;

import pl.pingwit.lec_7.point_2.subpoint.Person;

/**
 * @author Pavel Radkevich
 * @since 13.02.23
 */
public class ModifiersMain {

    public static void main(String[] args) {


        Person person = new Person();
        // только public поля доступны
        String name = person.name;

        //person.email
        //person.passportNumber
        //person.motherSurname

        person.sayHello();
    }
}
