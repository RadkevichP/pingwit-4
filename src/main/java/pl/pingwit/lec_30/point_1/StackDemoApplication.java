package pl.pingwit.lec_30.point_1;

/**
 * @author pradkevich
 * @since 23.6
 */
public class StackDemoApplication {

    public static void main(String[] args) {
        // First In Last Out
        DummyService dummyService = new DummyService();

        for (int i = 0; i < 5; i++) {
            dummyService.doUselessWork();
        }
        System.out.println("Bye!");
    }

}
