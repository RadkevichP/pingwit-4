package pl.pingwit.lec_8.point_3;

import java.util.Objects;

/**
 * @author Pavel Radkevich
 * @since 16.02.23
 */
public class Car {

    private String brand;
    private String model;
    private EngineType engineType;

    public Car(String brand, String model, EngineType engineType) {
        this.brand = brand;
        this.model = model;
        this.engineType = engineType;
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

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineType);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineType=" + engineType +
                '}';
    }
}
