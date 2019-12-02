package by.javatr.task9.util;

public class CircleService {

    public static double calculateСircumference(Circle circle) {
        return 2 * Math.PI * circle.getRadius();
    }

    public static double calculateCircleArea(Circle circle) {
        return circle.calculateArea();
    }
}
