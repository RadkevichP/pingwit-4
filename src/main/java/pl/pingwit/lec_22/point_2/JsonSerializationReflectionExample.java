package pl.pingwit.lec_22.point_2;

import pl.pingwit.lec_21.point_1.ParrotPet;
import pl.pingwit.lec_22.point_1.Employee;

import java.lang.reflect.Field;

/**
 * @author Pavel Radkevich
 * @since 13.04.23
 */
public class JsonSerializationReflectionExample {

    public static void main(String[] args) throws IllegalAccessException {
        Employee employee = new Employee("Pavel R", "transport", 123.56f);
        ParrotPet parrotPet = new ParrotPet("Popka", "durak");

        String jsonString = toJsonString(employee);
        String jsonString2 = toJsonString(parrotPet);

        System.out.println(jsonString);
        System.out.println(jsonString2);
    }

    private static String toJsonString(Object o) throws IllegalAccessException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        stringBuilder.append("\n");

        Field[] declaredFields = o.getClass().getDeclaredFields();
        for (int i = 0; i < declaredFields.length; i++) {

            Field field = declaredFields[i];
            field.setAccessible(true);

            stringBuilder.append(formatString(field.getName()));
            stringBuilder.append(": ");
            if (field.getType().isPrimitive()) {
                stringBuilder.append(formatPrimitive(field, o));
            } else if (field.getType().equals(String.class)) {
                stringBuilder.append(formatString(field.get(o).toString()));
            } else {
                throw new IllegalArgumentException("Type is not supported" + field.getType().getSimpleName());
            }

            if (i != declaredFields.length - 1) {
                stringBuilder.append(",");
            }
            stringBuilder.append("\n");
        }

        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    private static String formatString(String toString) {
        return String.format("\"%s\"", toString);
    }

    private static String formatPrimitive(Field field, Object o) throws IllegalAccessException {
        return field.get(o).toString();
    }
}
/*
{
  "brand": "Skoda",
  "model": "Octavia"
}
 */
