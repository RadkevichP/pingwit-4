package pl.pingwit.lec_21.point_1;

/**
 * @author Pavel Radkevich
 * @since 5.04.23
 */
public class ParrotPet implements Pet {

    private String name;
    private String type;

    public ParrotPet(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    public void chikChiric() {
        System.out.println("Chik!");
    }
}
