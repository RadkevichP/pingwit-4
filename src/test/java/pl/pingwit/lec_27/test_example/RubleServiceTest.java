package pl.pingwit.lec_27.test_example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Pavel Radkevich
 * @since 4.05.23
 */
// TDD Test Driven Development
class RubleServiceTest {

    private final RubleService target = new RubleService();

    @Test
    void shouldAddPostfixTo0() {
        //
        String expectedEnding = "рублей";

        //
        String actual = target.addRublePostfix(0);
        //

        assertTrue(actual.endsWith(expectedEnding));
    }

    @Test
    void shouldAddPostfixTo1() {
        //
        String expectedEnding = "рубль";

        //
        String actual = target.addRublePostfix(1);
        //

        assertTrue(actual.endsWith(expectedEnding));
    }

    @DisplayName("строка должна заканчиваться на ...рубля при 2")
    @Test
    void shouldAddPostfixTo2() {
        //
        String expectedEnding = "рубля";

        //
        String actual = target.addRublePostfix(2);
        //

        assertTrue(actual.endsWith(expectedEnding));
    }

    @Test
    void shouldAddPostfixTo8() {
        //
        String expectedEnding = "рублей";

        //
        String actual = target.addRublePostfix(8);
        //

        assertTrue(actual.endsWith(expectedEnding));
    }

    @Test
    void shouldAddPostfixToNull() {
        //
        String expectedMessage = "добавьте деньги!";
        //
        IllegalArgumentException actualException = assertThrows(IllegalArgumentException.class, () -> target.addRublePostfix(null));
        //
        assertEquals(actualException.getMessage(), expectedMessage);
    }


}
