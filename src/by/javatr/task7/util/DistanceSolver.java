package by.javatr.task7.util;

public class DistanceSolver {


    public static Point getClosestToOrigin(Point firstPoint, Point secondPoint) {

        return firstPoint.distanceToOrigin() < secondPoint.distanceToOrigin() ? firstPoint : secondPoint;

    }

}
