package pl.pingwit.lec_21.point_1;

/**
 * @author Pavel Radkevich
 * @since 5.04.23
 */
public class PingwitGenericArrayList<T> {

    T[] myArray;

    public PingwitGenericArrayList(T[] myArray) {
        this.myArray = myArray;
    }

    public T[] getMyArray() {
        return myArray;
    }

    public void setMyArray(T[] myArray) {
        this.myArray = myArray;
    }
}
