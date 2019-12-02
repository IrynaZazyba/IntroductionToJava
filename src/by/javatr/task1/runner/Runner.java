package by.javatr.task1.runner;

import by.javatr.scanner.DataScanner;
import by.javatr.task1.util.NumberHelper;

/**
 * Task1. Написать программу, позволяющую по последней
 * цифре числа определить последнюю цифру его квадрата.
 */
public class Runner {
    public static void main(String[] args) {

        int a;
        System.out.println("Введите число: ");
        a = DataScanner.enterIntFromConsole();

        int lastNumberOfSquared = NumberHelper.findLastNumberOfSquared(NumberHelper.getLastDigit(a));

        System.out.println("Последняя цифра квадрата, введенного числа: " + lastNumberOfSquared);

    }
}
