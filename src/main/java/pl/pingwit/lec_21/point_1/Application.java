package pl.pingwit.lec_21.point_1;

import pl.pingwit.lec_20.homework.AccountInfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author Pavel Radkevich
 * @since 5.04.23
 */
public class Application {

    public static void main(String[] args) {

        ParrotPet[] parrotPets = new ParrotPet[]{new ParrotPet("Gosha", "ARA"), new ParrotPet("Pirat", "wavy")};

        PingwitArrayList arrayList = new PingwitArrayList(parrotPets);

        Object[] myArray = arrayList.getMyArray();

        Object o1 = new Object();
        //myArray[0] = o1;

        for (Object o : myArray) {
            ParrotPet pa = (ParrotPet) o;
            pa.chikChiric();
        }


        PingwitGenericArrayList<ParrotPet> list2 = new PingwitGenericArrayList<>(parrotPets);
        ParrotPet[] myArray1 = list2.getMyArray();
        for (ParrotPet parrotPet : myArray1) {
            parrotPet.chikChiric();
        }

        PingwitGenericArrayList<String> list3 = new PingwitGenericArrayList<>(new String[]{"jhjh", "kjnkj"});
        String[] myArray2 = list3.getMyArray();

        List<String> objects = new ArrayList();
        objects.add("popopo");

        for (Object object : objects) {
            String object1 = (String) object;
            object1.length();
        }

        List<ParrotPet> parrotPets1 = Arrays.asList(parrotPets);
        List<CatPet> catPets = new ArrayList<>(List.of(new CatPet("Murzik", "cat")));
        printNames(catPets);
        printNames(parrotPets1);

    }

    public static void printNames(List<? extends Pet> pets) {
        for (Pet pet : pets) {
            System.out.println(pet.getName());
        }
    }
}
