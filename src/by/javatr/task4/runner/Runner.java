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

        int firstNumber;
        System.out.println("Введите число: ");
        firstNumber = DataScanner.enterIntFromConsole();

        int secondNumber;
        System.out.println("Введите число: ");
        secondNumber = DataScanner.enterIntFromConsole();

        int thirdNumber;
        System.out.println("Введите число: ");
        thirdNumber= DataScanner.enterIntFromConsole();

        int fourNumber;
        System.out.println("Введите число: ");
        fourNumber = DataScanner.enterIntFromConsole();

        System.out.println("Результат: "+NumericHelper.hasTwoEvenNumbers(firstNumber,secondNumber,thirdNumber,fourNumber));




    }
}
