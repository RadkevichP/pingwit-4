package pl.pingwit.lec_21.point_1;

/**
 * @author Pavel Radkevich
 * @since 5.04.23
 */
public class CatPet implements Pet{

    private String name;
    private String type;

    public CatPet(String name, String type) {
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

    public void sayMeow() {
        System.out.println("Meow!!!");
    }
}
