package by.javatr.task10.runner;

import by.javatr.exception.NoSuchLineSegmentExistException;
import by.javatr.exception.NotPositiveNumberException;
import by.javatr.scanner.DataScanner;
import by.javatr.task10.printer.ArrayPrinter;
import by.javatr.task10.util.LineSegment;
import by.javatr.task10.util.FunctionService;

/**
 * Составить программу для вычисления значений
 * функции F(x) на отрезке [а, b] с шагом h.
 * Результат представить в виде таблицы, первый
 * столбец которой – значения аргумента, второй
 * - соответствующие значения функции. F(x)=tg(x)
 */
public class Runner {

    public static void main(String[] args) {

        double a;
        System.out.println("Введите значение начала отрезка: ");
        a = DataScanner.enterDoubleFromConsole();

        double b;
        System.out.println("Введите значение конца отрезка: ");
        b = DataScanner.enterDoubleFromConsole();

        double step;
        System.out.println("Введите значение шага: ");
        step = DataScanner.enterDoubleFromConsole();

        try {
            LineSegment ls = new LineSegment(a, b);
            double [][] array = FunctionService.calculateFunctionWithStep(ls, step);

            ArrayPrinter.printMultidimensionalArray(array);

        } catch (NoSuchLineSegmentExistException | NotPositiveNumberException ex) {
            System.out.println(ex.getMessage());
        }


    }
}
