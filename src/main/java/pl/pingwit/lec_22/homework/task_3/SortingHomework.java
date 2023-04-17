package pl.pingwit.lec_22.homework.task_3;

import java.util.*;

/**
 * @author Pavel Radkevich
 * @since 13.04.23
 */
public class SortingHomework {


    // отсортируйте autoInfos по марке и модели. используйте Comparator.comparing(....)
    // отсортируйте autoInfos по объему мотора в обратном порядке. используйте Comparator.comparing(....)

    public static void main(String[] args) {
        AutoInfo autoInfo1 = new AutoInfo("VW", "Polo", 3, 1.0f);
        AutoInfo autoInfo2 = new AutoInfo("VW", "Passat", 4, 1.6f);
        AutoInfo autoInfo3 = new AutoInfo("Skoda", "Fabia", 3, 1.2f);
        AutoInfo autoInfo4 = new AutoInfo("BMW", "5-series", 6, 3.0f);
        AutoInfo autoInfo5 = new AutoInfo("BMW", "2-series", 3, 1.5f);
        AutoInfo autoInfo6 = new AutoInfo("Toyota", "Tundra", 6, 3.7f);
        AutoInfo autoInfo7 = new AutoInfo("Audi", "A8", 8, 4.0f);

        List<AutoInfo> autoInfos = new ArrayList<>(List.of(autoInfo1, autoInfo2, autoInfo3, autoInfo4, autoInfo5, autoInfo6, autoInfo7));

        Map<Integer, List<Float>> volumesByCylinders = groupVolumesByCylinders(autoInfos);
        System.out.println(volumesByCylinders);
    }

    private static Map<Integer, List<Float>> groupVolumesByCylinders(List<AutoInfo> autoInfos) {
        Map<Integer, List<Float>> result = new HashMap<>();

        for (AutoInfo autoInfo : autoInfos) {
            int cylinderCount = autoInfo.getCylinderCount();
            if (result.containsKey(cylinderCount)) {
                result.get(cylinderCount).add(autoInfo.getEngineVolume());
            } else {
                List<Float> volumes = new ArrayList<>();
                volumes.add(autoInfo.getEngineVolume());
                result.put(cylinderCount, volumes);
            }
        }
        return result;
    }

}
