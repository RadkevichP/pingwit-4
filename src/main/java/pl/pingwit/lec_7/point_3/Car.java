package pl.pingwit.lec_7.point_3;

/**
 * @author Pavel Radkevich
 * @since 13.02.23
 */
public class Car {

    // static поля
    // поля
    // конструкторы
    // геттеры-сеттеры
    // методы
    // equals() and hashCode()
    // toString()

    public static final int WHEELS_NUMBER = 4;

    private String brand;
    private String model;
    private int serialNumber;
    private int fuel;

    public Car() {
    }

    public Car(String brand, String model, int serialNumber) {
        this.brand = brand;
        this.model = model;
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void startEngine() {
        System.out.println("Vrooom!");
    }

    public static void printCommonCarInfo() {
        System.out.println("У машины " + WHEELS_NUMBER + " колес");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", serialNumber=" + serialNumber +
                '}';
    }

}
