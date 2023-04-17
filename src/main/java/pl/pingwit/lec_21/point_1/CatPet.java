package pl.pingwit.lec_21.point_1;

import pl.pingwit.lec_23.point_1.LettersOnly;

/**
 * @author Pavel Radkevich
 * @since 5.04.23
 */
public class CatPet implements Pet{

    @LettersOnly
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
