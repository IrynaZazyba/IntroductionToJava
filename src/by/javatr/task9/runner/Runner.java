package by.javatr.task9.runner;

import by.javatr.exception.NotPositiveNumberException;
import by.javatr.scanner.DataScanner;
import by.javatr.task9.util.Circle;
import by.javatr.task9.util.CircleService;

/**
 * Вычислить длину окружности и площадь
 * круга одного и того же заданного радиуса R.
 */
public class Runner {

    public static void main(String[] args) {

        double radius;
        System.out.println("Введите значение радиуса: ");
        radius = DataScanner.enterDoubleFromConsole();

        try {
            Circle circle = new Circle(radius);
            System.out.printf("Длина окружности равна: %.2f\n", CircleService.calculateСircumference(circle));
            System.out.printf("Площадь круга равна: %.2f\n",CircleService.calculateCircleArea(circle));
        } catch (NotPositiveNumberException ex) {
            System.out.println(ex.getMessage());
        }


    }
}
