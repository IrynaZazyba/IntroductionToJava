package by.javatr.task9.runner;

import by.javatr.scanner.DataScanner;
import by.javatr.task8.util.Function;
import by.javatr.task9.util.Circle;

public class Runner {

    public static void main(String[] args) {

        double radius;
        System.out.println("Введите значение радиуса: ");
        radius = DataScanner.enterDoubleFromConsole();

        try {
            Circle circle = new Circle(radius);
            System.out.printf("Длина окружности равна: %.2f\n", circle.calculateСircumference());
            System.out.printf("Площадь круга равна: %.2f\n", circle.circleArea());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }


    }
}
