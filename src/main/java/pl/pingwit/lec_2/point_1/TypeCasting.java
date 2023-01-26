package pl.pingwit.lec_2.point_1;

/**
 * @author Pavel Radkevich
 * @since 26.01.23
 */
public class TypeCasting {

    public static void main(String[] args) {
        byte myByte = 56;
        int myInt = myByte;

        long myLong = myByte;

        /*System.out.println(myInt);
        System.out.println(myLong);*/

        int myLargeInt = 10000000;
        myByte = (byte) myLargeInt;

        myLargeInt = myByte;

        /*System.out.println(myByte);
        System.out.println(myLargeInt);*/

        float myFloat = 10.56f;
        int rounded = (int) myFloat;

        int toFloat = 124;
        float fromInt = toFloat;

        System.out.println(rounded);
        System.out.println(fromInt);

    }
}
