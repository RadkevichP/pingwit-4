package pl.pingwit.lec_17.point_1;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.*;
import java.util.Objects;

/**
 * @author Pavel Radkevich
 * @since 23.03.23
 */
// POJO Plain Old Java Object
public class Car implements Serializable {

    private static final int WHEEL_NUMBER = 4;

    private String brand;
    private String model;

    @JsonIgnore
    private transient String status;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model);
    }
}
