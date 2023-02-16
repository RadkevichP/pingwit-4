package pl.pingwit.lec_8.point_3;

import java.util.Arrays;
import java.util.Objects;

/**
 * @author Pavel Radkevich
 * @since 16.02.23
 */
public final class ImmutableCar {

    private final String brand;
    private final String model;
    private final EngineType engineType;
    private final int[] seats;

    public ImmutableCar(String brand, String model, EngineType engineType, int[] seats) {
        this.brand = brand;
        this.model = model;
        this.engineType = engineType;
        this.seats = seats;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public int[] getSeats() {
        int[] clone = seats.clone();
        return clone;
    }

    @Override
    public String toString() {
        return "ImmutableCar{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineType=" + engineType +
                ", seats=" + Arrays.toString(seats) +
                '}';
    }
}
