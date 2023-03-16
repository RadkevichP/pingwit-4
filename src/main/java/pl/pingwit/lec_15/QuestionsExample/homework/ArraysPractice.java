package pl.pingwit.lec_15.QuestionsExample.homework;

/**
 * @author Pavel Radkevich
 * @since 16.03.23
 */

/*
Создаем массив из целых чисел: {4,1,-10, 15,25, 88, 90, 133, 20, 0}
В цикле: распечатываем i-й элемент массива через
System.out.printf -пример:  Элемент 0 массива: 4 ,
распечатываем результат деления элемента на 2. Пример: Результат деления 0 на 2: 0
Вычисляем сумму всех элементов
 */
public class ArraysPractice {

    public static void main(String[] args) {

        int[] numbers = new int[]{4, 1, -10, 15, 25, 88, 90, 133, 20, 0};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            int myInt = numbers[i];
            sum += myInt;

            System.out.printf("Элемент %d массива: %d", i, myInt);
            System.out.println();

            int result = myInt / 2;
            System.out.printf("Результат деления %d на 2: %d", myInt, result);
            System.out.println();
        }
        System.out.println("Sum:" + sum);
    }

}
