package by.javatr.task7.runner;

import by.javatr.exception.ImpossibleDetermineClosestToOriginException;
import by.javatr.scanner.DataScanner;
import by.javatr.task7.util.Point;
import by.javatr.task7.util.PointService;

/**
 * Даны две точки А(х1, у1) и В(х2, у2).
 * Составить алгоритм, определяющий,
 * которая из точек находится ближе
 * к началу координат. x y.
 */
public class Runner {

    public static void main(String[] args) {

        double firstPointX;
        System.out.println("Введите координату X первой точки: ");
        firstPointX = DataScanner.enterDoubleFromConsole();

        double firstPointY;
        System.out.println("Введите координату Y первой точки: ");
        firstPointY = DataScanner.enterDoubleFromConsole();

        Point firstPoint = new Point(firstPointX, firstPointY);


        double secondPointX;
        System.out.println("Введите координату X второй точки: ");
        secondPointX = DataScanner.enterDoubleFromConsole();

        double secondPointY;
        System.out.println("Введите координату Y второй точки: ");
        secondPointY = DataScanner.enterDoubleFromConsole();

        Point secondPoint = new Point(secondPointX, secondPointY);

        try {
            Point closestPoint = PointService.getClosestToOrigin(firstPoint, secondPoint);

            System.out.println("Точка с координатами: ( " + closestPoint.getCoordinateX() + " , " + closestPoint.getCoordinateY() + " ) ближе к началу координат.");

        } catch (ImpossibleDetermineClosestToOriginException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
