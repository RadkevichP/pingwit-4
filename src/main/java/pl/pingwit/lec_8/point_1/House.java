package pl.pingwit.lec_8.point_1;

import java.util.Objects;

/**
 * Класс для хранения данных о домах
 *
 * @author Pavel Radkevich
 * @since 16.02.23
 */
public class House {

    private String type;
    private int floorNumber;
    private int residentsNumber;
    private boolean heatingOn;

    public House() {
    }

    public House(String type, int floorNumber, int residentsNumber, boolean heatingOn) {
        if ("Individual".equals(type) || "Skytower".equals(type)) {
            this.type = type;
            this.floorNumber = floorNumber;
            this.residentsNumber = residentsNumber;
            this.heatingOn = heatingOn;
        } else {
            throw new IllegalArgumentException("Нет такого типа домов: " + type);
        }

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getResidentsNumber() {
        return residentsNumber;
    }

    public void setResidentsNumber(int residentsNumber) {
        this.residentsNumber = residentsNumber;
    }

    public boolean isHeatingOn() {
        return heatingOn;
    }

    public void setHeatingOn(boolean heatingOn) {
        this.heatingOn = heatingOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        House house = (House) o;
        return (floorNumber == house.floorNumber) &&
                (residentsNumber == house.residentsNumber) &&
                (heatingOn == house.heatingOn) &&
                (Objects.equals(type, house.type));
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, floorNumber, residentsNumber, heatingOn);
    }
}
