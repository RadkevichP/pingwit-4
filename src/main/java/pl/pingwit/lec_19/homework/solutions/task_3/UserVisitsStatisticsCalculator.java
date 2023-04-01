package pl.pingwit.lec_19.homework.solutions.task_3;

import java.util.*;

/**
 * @author Pavel Radkevich
 * @since 1.04.23
 */
/*
Task 3
Напишите класс, который описывает посещение сайта. В нем должен храниться имя пользователя
и строка-название посещенного сайта.

В классе Application создайте список посещений, причем один пользователь мог посещать разные сайты, мог по несколько раз посещать один и тот
же сайт.

2.1 Напишите метод, который примет на вход списко посещений и вернет коллекцию уникальных имен пользователей.
2.2 Напишите метод, который примет на вход список посещений и вернет коллекцию уникальных сайтов.
2.3 напишите метод, который примет на вход список посещений и вернет Map<String, Integer> в которой хранится количество посещений
 */
public class UserVisitsStatisticsCalculator {

    public static void main(String[] args) {
        /*
        В классе Application создайте список посещений, причем один пользователь мог посещать разные сайты, мог по несколько раз посещать один и тот
        же сайт.
         */
        UserVisit visit1 = new UserVisit("Pavel", "google.com");
        UserVisit visit2 = new UserVisit("Pavel", "google.com");
        UserVisit visit3 = new UserVisit("Pavel", "youtube.com");
        UserVisit visit4 = new UserVisit("Pavel", "udemy.com");
        UserVisit visit5 = new UserVisit("Pavel", "udemy.com");
        UserVisit visit6 = new UserVisit("Pavel", "onliner.by");
        UserVisit visit7 = new UserVisit("Ivan", "caroutlet.eu");
        UserVisit visit8 = new UserVisit("Ivan", "youtube.com");
        UserVisit visit9 = new UserVisit("Anna", "google.com");
        UserVisit visit10 = new UserVisit("Anna", "udemy.com");
        UserVisit visit11 = new UserVisit("Anna", "udemy.com");

        List<UserVisit> userVisits = new ArrayList<>(List.of(visit1, visit2, visit3, visit4, visit5, visit6, visit7, visit8, visit9, visit10, visit11));

        // 2.1 Напишите метод, который примет на вход списко посещений и вернет коллекцию уникальных имен пользователей.
        Set<String> userNames = findUniqueUsers(userVisits);
        System.out.println("Пользватели системы: " + userNames);

        // 2.2 Напишите метод, который примет на вход список посещений и вернет коллекцию уникальных сайтов.
        Set<String> sites = findUniqueSites(userVisits);
        System.out.println("Сайты: " + sites);

        // 2.3 напишите метод, который примет на вход список посещений и вернет Map<String, Integer> в которой хранится количество посещений
        Map<String, Integer> visitsCountForSite = calculateSiteVisitCount(userVisits);
        System.out.println("количество посещений каждого сайта: " + visitsCountForSite);
    }

    // метод, который примет на вход список посещений и вернет Map<String, Integer> в которой хранится количество
    private static Map<String, Integer> calculateSiteVisitCount(List<UserVisit> userVisits) {
        Map<String, Integer> result = new HashMap<>();

        for (UserVisit userVisit : userVisits) {
            String siteName = userVisit.getSiteName();

            if (result.containsKey(siteName)) {
                Integer visitsCount = result.get(siteName);
                Integer updatedCount = visitsCount + 1;
                result.put(siteName, updatedCount);
            } else {
                result.put(siteName, 1);
            }
        }

        return result;
    }

    private static Set<String> findUniqueSites(List<UserVisit> userVisits) {
        Set<String> sites = new HashSet<>();

        for (UserVisit userVisit : userVisits) {
            sites.add(userVisit.getSiteName());
        }

        return sites;
    }

    private static Set<String> findUniqueUsers(List<UserVisit> userVisits) {
        Set<String> result = new HashSet<>();

        for (UserVisit userVisit : userVisits) {
            result.add(userVisit.getUserName());
        }

        return result;
    }
}
