package pl.pingwit.lec_11.point_2;

import org.apache.commons.lang3.StringUtils;
import pl.pingwit.lec_11.point_1.Human;

/**
 * @author Pavel Radkevich
 * @since 2.03.23
 */
public class StringExample {

    public static void main(String[] args) {

        Human human = new Human("Pavel", "Ivanov", 1990);

        String hello = "hello";

        String helloWorld = hello;
        helloWorld = helloWorld + " World!";

        System.out.println(helloWorld);
        System.out.println(hello);

        char[] chars = new char[]{'m', ':', 'm', 'a'};

        String fromChars = String.valueOf(chars);
        System.out.println(fromChars);

        String s = "Добрый вечер, " + human.getName() + "! Мы вам рады!";
        String format = String.format("Добрый вечер, %s. Мы вам рады! %s", human.getName(), human.getSurname());
        System.out.println(format);

        String join = String.join(", ", "Pavel", "Ivan", "Sasha", human.getName());
        System.out.println(join);

        String emailUpper = "Radkevichp@gmail.com";
        String emailLower = "radkevichp@gmail.com";

        System.out.println(emailUpper.equalsIgnoreCase(emailLower));
        System.out.println(emailLower.equals(emailUpper));

        String s1 = "ABBA".toLowerCase();
        String s2 = s1.toUpperCase();
        System.out.println(s1);

        String privetWhitespace = "  privet!   ";
        String strip = privetWhitespace.strip();
        System.out.println(strip);
        System.out.println(privetWhitespace);

        String emptyString = "  ";
        System.out.println(emptyString.isEmpty());

        boolean blank = emptyString.isBlank();

        char[] chars1 = strip.toCharArray();
        char[] reversed = new char[chars1.length];

        String example = "example";
        char c = example.charAt(2);
        System.out.println(c);

        String replced = example.replace("a", "1111");
        System.out.println(replced);

        //-------------------------------------------------------------------------------

        StringBuilder builder = new StringBuilder("0");
        //String s12 = "0";
        for (int i = 0; i < 100; i++) {
            builder.append("mam");
        }
        System.out.println(builder);

        //-------------------------------------------------------------------------------
        String testBlock = """
                Hello world!
                I'm here.
                No one stops me.
                """;
        String withoutTestBlock = "Hello world!\nI'm here.\nNo one stops me";
        System.out.println(testBlock);

        //-------------------------------------------------------------------------------
        boolean notBlank = StringUtils.isNotBlank("");
        String reverse = StringUtils.reverse("palindrome");

        System.out.println(reverse);
    }
}
