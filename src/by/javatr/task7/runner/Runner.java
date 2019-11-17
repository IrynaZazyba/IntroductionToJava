package by.javatr.task7.runner;

import by.javatr.scanner.DataScanner;
import by.javatr.task7.util.Point;
import by.javatr.task7.util.DistanceSolver;

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


        Point closestPoint = DistanceSolver.getClosestToOrigin(firstPoint, secondPoint);

        System.out.println("Точка с координатами: ( " + closestPoint.getCoordinateX() + " , " + closestPoint.getCoordinateY() + " ) ближе к началу координат.");


    }
}
