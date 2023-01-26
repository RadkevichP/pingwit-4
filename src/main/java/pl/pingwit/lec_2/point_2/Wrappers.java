package pl.pingwit.lec_2.point_2;

/**
 * @author Pavel Radkevich
 * @since 26.01.23
 */
public class Wrappers {

    public static void main(String[] args) {

        // byte, short, char, int, long, float, boolean

        int myInt = 56;
        byte myByte = 12;
        Byte myWrapperByte = new Byte(myByte);

        Integer myWrapperInteger = new Integer(56);
        Boolean myWrapperBoolean = new Boolean(true);

        //System.out.println(myWrapperByte);

        String number = "567";
        int fromString = Integer.parseInt(number);

        String invalidNumber = "test";
        // int i = Integer.parseInt(invalidNumber);

        //System.out.println(fromString);
        //System.out.println(i);

        int myNewInt = new Integer(45);
        Integer myNewInt2 = 56;

        Integer times = 56;

        printTimes(times);

        int maxValue = Integer.MAX_VALUE;
        System.out.println(maxValue);

        System.out.println("Hello from Git!");

    }

    private static void printTimes(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Hello!");
        }
    }
}
