package pl.pingwit.lec_22.point_1;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Pavel Radkevich
 * @since 13.04.23
 */
public class ReflectionBasicExample {

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException {

        Employee employee = new Employee("Pavel R", "transport", 123.56f);

        Class<?> clazz = employee.getClass();
        Class<Employee> employeeClass = Employee.class;
        Class<?> aClass = Class.forName("pl.pingwit.lec_22.point_1.Employee");

        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getPackageName());

        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();

        Object reflectionEmployee = null;
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            if (declaredConstructor.getParameterCount() == 0) {
                reflectionEmployee = declaredConstructor.newInstance();
            }
        }

        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);

            System.out.printf("Field %s has type %s", declaredField.getName(), declaredField.getType().getName());
            System.out.println();

            if (declaredField.getName().equals("name")) {
                declaredField.set(reflectionEmployee, "Fedor B.");
            }
            if (declaredField.getName().equals("department")) {
                declaredField.set(reflectionEmployee, "SAS");
            }
            if (declaredField.getName().equals("ratePerHour")) {
                declaredField.set(reflectionEmployee, 10.556f);
            }
        }

        System.out.println(reflectionEmployee);

    }

}
