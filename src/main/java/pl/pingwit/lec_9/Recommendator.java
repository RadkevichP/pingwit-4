package pl.pingwit.lec_9;

/**
 * @author Pavel Radkevich
 * @since 20.02.23
 */
public class Recommendator {

    public void recommend(Person[] people) {
        for (Person person : people) {
            recommendForOnePerson(person);
        }
    }

    public void recommend(Person person) {
        recommendForOnePerson(person);
    }


    private void recommendForOnePerson(Person person) {
        int age = 2023 - person.getYearOfBirth();

        if (age >= 18 && person.getFamilyStatus().equals(PersonFamilyStatus.SINGLE)) {
            if (person.getGender().equals(PersonGender.MALE)) {
                String name = person.getName();
                System.out.println("Уважаемый " + name + " , желаете ли познакомится с девушкой?");
            }
            if (person.getGender().equals(PersonGender.FEMALE)) {
                String name = person.getName();
                System.out.println("Уважаемая " + name + " мы поможем вам найти мужчину мечты!");
            }
        }
    }
}
