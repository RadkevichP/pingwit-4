package pl.pingwit.lec_20.point_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Pavel Radkevich
 * @since 3.04.23
 */
public class RegexExample {

    private static final Pattern PHONE_NUMBER_PATTERN = Pattern.compile("\\d+");

    public static final Pattern NON_WHITESPACE_PATTERN = Pattern.compile("\\S+");

    public static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");

    public static void main(String[] args) {

        String phoneNumber = "987988768768";

        Matcher phoneNumberMatcher = PHONE_NUMBER_PATTERN.matcher(phoneNumber);
        if (phoneNumberMatcher.matches()) {
            System.out.println("Number is OK: " + phoneNumber);
        } else {
            System.out.println("Number is not OK: " + phoneNumber);
        }

        String email = "pavel@gmail.com";

        Matcher emailMatcher = EMAIL_PATTERN.matcher(email);
        if (emailMatcher.matches()){
            System.out.println("EMAIL is OK: " + email);
        }

    }
}
