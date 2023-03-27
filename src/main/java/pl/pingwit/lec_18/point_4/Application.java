package pl.pingwit.lec_18.point_4;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pavel Radkevich
 * @since 27.03.23
 */
public class Application {

    public static void main(String[] args) {

        String[] strings = new String[100];
        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            stringList.add(RandomStringUtils.random(3));
            ///strings[i] = RandomStringUtils.random(3);
        }

        strings[4] = null;
    }
}
