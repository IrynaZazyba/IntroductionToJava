package by.javatr.task4.runner;

import by.javatr.scanner.DataScanner;
import by.javatr.task4.util.NumericHelper;

/**
 * Составить программу, печатающую значение true,
 * если указанное высказывание является истинным,
 * и false — в противном случае: среди заданных
 * целых чисел А, В, С, D есть хотя бы два четных.
 */

public class Runner {

    public static void main(String[] args) {

        int j = 0;
        int array[] = new int[4];
        while (j < 4) {
            System.out.println("Введите число: ");
            array[j] = DataScanner.enterIntFromConsole();
            j++;
        }

        NumericHelper nh = new NumericHelper(array);

        System.out.println("Результат: " + nh.hasTwoEvenNumbers());


    }
}
