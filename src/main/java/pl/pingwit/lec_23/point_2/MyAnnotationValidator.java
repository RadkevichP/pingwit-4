package pl.pingwit.lec_23.point_2;

import pl.pingwit.lec_23.point_1.LettersOnly;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.regex.Pattern;

/**
 * @author Pavel Radkevich
 * @since 17.04.23
 */
public class MyAnnotationValidator {

    private static final Pattern ONLY_LETTERS_PATTERN = Pattern.compile("^[a-zA-Z]*$");

    public void validate(Object obj) {
        for (Field declaredField : obj.getClass().getDeclaredFields()) {
            declaredField.setAccessible(true);

            for (Annotation annotation : declaredField.getAnnotations()) {
                if (annotation.annotationType().equals(LettersOnly.class)) {
                    try {
                        String value = (String) declaredField.get(obj);
                        if (!ONLY_LETTERS_PATTERN.matcher(value).matches()) {
                            String message = String.format("Field %s with value %s can contain only letters", declaredField.getName(), value);
                            throw new PingwitValidationException(message);
                        }
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

}
