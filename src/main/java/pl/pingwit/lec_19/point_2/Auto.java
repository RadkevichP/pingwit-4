package pl.pingwit.lec_19.point_2;

import java.util.Objects;

/**
 * @author Pavel Radkevich
 * @since 30.03.23
 */
// DTO
public class Auto {

    private String brand;
    private String model;

    public Auto(String brand, String model) {
        this.brand = brand;
        this.model = model;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return Objects.equals(brand, auto.brand) && Objects.equals(model, auto.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
