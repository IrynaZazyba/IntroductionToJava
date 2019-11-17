package by.javatr.task8.runner;

import by.javatr.scanner.DataScanner;
import by.javatr.task8.util.Function;

public class Runner {

    public static void main(String[] args) {

        double x;
        System.out.println("Введите значение x: ");
        x = DataScanner.enterDoubleFromConsole();

        System.out.println("Значение функции при x = "+x+": "+Function.calculateFunction(x));

    }
}
