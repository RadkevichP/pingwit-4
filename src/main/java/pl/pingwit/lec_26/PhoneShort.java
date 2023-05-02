package pl.pingwit.lec_26;

import java.util.Objects;

/**
 * @author Pavel Radkevich
 * @since 1.05.23
 */
public class PhoneShort {

    private final String brand;
    private final String model;

    public PhoneShort(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneShort that = (PhoneShort) o;
        return Objects.equals(brand, that.brand) && Objects.equals(model, that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model);
    }

    @Override
    public String toString() {
        return "PhoneShort{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
