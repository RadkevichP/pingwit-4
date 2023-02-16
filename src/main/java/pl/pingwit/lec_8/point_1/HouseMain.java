package pl.pingwit.lec_8.point_1;

/**
 * @author Pavel Radkevich
 * @since 16.02.23
 */
public class HouseMain {

    public static void main(String[] args) {

        House house1 = new House("Individual", 5, 100, true);
        House house2 = new House("Individual", 5, 100, true);
        House house3 = new House("Individual", 5, 100, true);
        House house4 = new House("Super-puper Tower", 5, 100, true);

        house1.setFloorNumber(9);

        //House house3 = house1;
        int myInt = 4;
        int myInt2 = 4;

        //System.out.println(myInt == myInt2);

        System.out.println("Одинаковы ли дома? " + house1.equals(house2));
        //System.out.println("Одинаковы ли дома? " + house1.equals(house3));
        //System.out.println(house1);
        //System.out.println(house3);
        //System.out.println(house2);

        if (house1.equals(house2)){
            System.out.println("Так дома же одинаковые!");
        }

        if (house1 == house2) {
            System.out.println("Ссылки одинаковые");
        }

        System.out.println(house1.hashCode());
        System.out.println(house2.hashCode());
        System.out.println(house3.hashCode());

    }
}
