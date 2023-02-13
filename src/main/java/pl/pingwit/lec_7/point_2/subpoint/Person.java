package pl.pingwit.lec_7.point_2.subpoint;

/**
 * @author Pavel Radkevich
 * @since 13.02.23
 */
public class Person {

    // private -> default (package-private)(без модификатора) -> protected -> public

    public String name;
    String email;
    protected int passportNumber = 1234567;
    private String motherSurname;




    public void sayHello() {
        System.out.println("Hello!");
    }

}
