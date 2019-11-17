package by.javatr.task10.runner;

import by.javatr.scanner.DataScanner;
import by.javatr.task10.printer.ArrayPrinter;
import by.javatr.task8.util.Function;

public class Runner {

    public static void main(String[] args) {

        double a;
        System.out.println("Введите значение начала отрезка: ");
        a = DataScanner.enterDoubleFromConsole();

        double b;
        System.out.println("Введите значение конца отрезка: ");
        b = DataScanner.enterDoubleFromConsole();

        double h;
        System.out.println("Введите значение шага: ");
        h = DataScanner.enterDoubleFromConsole();

        double array[][]=Function.calculateFanctionWithStep(a,b,h);

        ArrayPrinter.printMultidimensionalArray(array);

    }
}
