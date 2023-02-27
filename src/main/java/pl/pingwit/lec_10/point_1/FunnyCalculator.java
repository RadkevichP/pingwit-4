package pl.pingwit.lec_10.point_1;

/**
 * @author Pavel Radkevich
 * @since 27.02.23
 */
public class FunnyCalculator implements Calculator, Lightable {

    @Override
    public final int add(int a, int b) {
        System.out.println("Very funny sum!");
        return a + b;
    }

    @Override
    public int multiply(int a, int b) {
        System.out.println("Very funny number!");
        return a * b;
    }

    @Override
    public int divide(int a, int b) {
        return a / b;
    }

    @Override
    public void turnLightOn() {
        System.out.println("Свет включен!");
    }

}
