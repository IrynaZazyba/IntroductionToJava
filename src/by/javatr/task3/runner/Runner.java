package by.javatr.task3.runner;

import by.javatr.exception.NegativeAreaException;
import by.javatr.scanner.DataScanner;
import by.javatr.task3.util.SquareService;

/**
 * Окружность вписана в квадрат заданной площади.
 * Найти площадь квадрата, вписанного в эту
 * окружность. Во сколько раз площадь вписанного
 * квадрата меньше площади заданного?
 */
public class Runner {

    public static void main(String[] args) {

        double area;
        System.out.println("Введите площадь квадрата: ");
        area = DataScanner.enterDoubleFromConsole();

        try {
            double inscribedSquareArea=SquareService.calculateAreaSquare(area);

            System.out.println("Площадь вписанного квадрата: " + inscribedSquareArea);
            System.out.println("Отношение родительского квадрата к дочернему: " + SquareService.ratioOfAreas(area,inscribedSquareArea));

        } catch (NegativeAreaException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
