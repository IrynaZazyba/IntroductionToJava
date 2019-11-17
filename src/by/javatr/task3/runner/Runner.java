package by.javatr.task3.runner;

import by.javatr.scanner.DataScanner;
import by.javatr.task3.util.Square;


/**
 * Окружность вписана в квадрат заданной площади.
 * Найти площадь квадрата, вписанного в эту
 * окружность. Во сколько раз площадь вписанного
 * квадрата меньше площади заданного?
 */

public class Runner {

    public static void main(String[] args) {

        double d = 0.0;
        System.out.println("Введите площадь квадрата: ");
        d = DataScanner.enterDoubleFromConsole();

        try {
            Square sq = new Square(d);

            System.out.println("Площадь вписанного квадрата: " + sq.calculateAreaSquare());
            System.out.println("Отношение родительского квадрата к дочернему: " + sq.ratioOfAreas());

        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
