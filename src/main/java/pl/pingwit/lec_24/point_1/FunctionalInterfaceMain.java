package pl.pingwit.lec_24.point_1;

/**
 * @author Pavel Radkevich
 * @since 20.04.23
 */
public class FunctionalInterfaceMain {

    public static void main(String[] args) {

        MyFunctionalInterface myFunctionalInterface1 = new MyFunctionalInterface() {
            @Override
            public String test(String name) {
                return "Hello, " + name + "!";
            }
        };

        MyFunctionalInterface myFunctionalInterface = name -> "Hello, " + name + "!";

        String pavel = myFunctionalInterface.test("Pavel");
        System.out.println(pavel);

    }
}
