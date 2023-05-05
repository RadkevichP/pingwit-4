package pl.pingwit.lec_27.test_example;

import java.util.Objects;
import java.util.function.Function;

/**
 * @author Pavel Radkevich
 * @since 4.05.23
 */
public class RubleService {

    // метод должен выкинуть IllegalArgumentException в случае null
    public String addRublePostfix(Integer amount) {
        // - второй вариант проверки на null: Objects.isNull(null)
        if (amount == null) {
            throw new IllegalArgumentException("добавьте деньги!");
        }
        Function<Integer, String> addWord = number -> {
            String quantity = number.toString();
            if (quantity.endsWith("11") || quantity.endsWith("12") || quantity.endsWith("13") || quantity.endsWith("14") || quantity.endsWith("5") || quantity.endsWith("6") || quantity.endsWith("7") || quantity.endsWith("8") || quantity.endsWith("9") || quantity.endsWith("0")) {
                return quantity + " рублей";
            } else if (quantity.endsWith("2") || quantity.endsWith("3") || quantity.endsWith("4")) {
                return quantity + "рубля";
            }
            return quantity + " рубль";
        };

        return addWord.apply(amount);
    }

}
