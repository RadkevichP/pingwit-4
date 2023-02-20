package pl.pingwit.lec_9;


/*Создать класс Person с полями Имя, фамилия, год рождения, пол (два варианта - мужской и женский),
        семейный статус (singe/married). Используйте знания с лекции 8 при дизайне.

        Создайте класс, в котором создайте объект класса Pesron. Если человек старше 18 и single,
        предложите ему услуги своего сайта знакомств:
        "Уважаемый Павел, желаете ли познакомится с девушкой?" или "Уважаемая Светлана, мы поможем
        вам найти мужчину мечты!"

        Создайте еще один класс, в котором создайте массив Person, и сделайте для них все то же самое.
*/
public class Application {

    public static void main(String[] args) {

        Person person = new Person("Ivan", "Ivanov", 2002, PersonGender.MALE, PersonFamilyStatus.SINGLE);
        Person person2 = new Person("Ivan", "Ivanov", 2004, PersonGender.FEMALE, PersonFamilyStatus.SINGLE);
        Person person3 = new Person("Ia", "Ia", 2003, PersonGender.MALE, PersonFamilyStatus.SINGLE);
        Person person4 = new Person("Fe", "Fu", 1900, PersonGender.MALE, PersonFamilyStatus.SINGLE);

        Person[] people = new Person[]{person, person2, person3, person4};

        Recommendator recommendator = new Recommendator();

        //recommendator.recommend(person);

        recommendator.recommend(people);
        //recommendator.recommend(person);

    }
}



