package pl.pingwit.lec_25.point_5;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.function.Supplier;

/**
 * @author Pavel Radkevich
 * @since 27.04.23
 */
public class SupplierMain {

    public static void main(String[] args) {
        Supplier<String> myStringSupplier = () -> RandomStringUtils.randomAlphabetic(12);

        String s = myStringSupplier.get();

        System.out.println(s);
        System.out.println(myStringSupplier.get());

    }
}
