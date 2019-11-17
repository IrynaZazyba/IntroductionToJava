package by.javatr.task5.runner;

import by.javatr.scanner.DataScanner;
import by.javatr.task5.util.NumberDetector;

/**
 * Составить программу, печатающую значение true,
 * если указанное высказывание является истинным,
 * и false — в противном случае: является ли
 * целое число совершенным (сумма делителей равна
 * самому числу).
 */

public class Runner {

    public static void main(String[] args) {

        int a;
        System.out.println("Введите число: ");
        a = DataScanner.enterIntFromConsole();

        try {
            System.out.println("Является ли число совершенным: " + NumberDetector.isNumberPerfect(a));
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }


    }
}
