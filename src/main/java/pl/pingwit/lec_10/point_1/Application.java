package pl.pingwit.lec_10.point_1;

/**
 * @author Pavel Radkevich
 * @since 27.02.23
 */
public class Application {

    public static void main(String[] args) {

        Calculator myCalculator = new FunnyCalculator();
        int sum = myCalculator.add(5, 6);

        Lightable light = new FunnyCalculator();
        light.turnLightOn();

        System.out.println(sum);

        Calculator myCalculator2 = new SadCalculator();

        int sum2 = myCalculator2.add(5, 6);
        System.out.println(sum2);

        SuperFunnyCalculator superFunnyCalculator = new SuperFunnyCalculator();

    }
}
