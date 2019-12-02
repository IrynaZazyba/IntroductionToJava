package by.javatr.task7.util;

import by.javatr.exception.ImpossibleDetermineClosestToOriginException;

public class PointService {


    public static double distanceToOrigin(Point point) {
        return Math.sqrt(Math.pow(point.getCoordinateX(), 2) + Math.pow(point.getCoordinateY(), 2));

    }


    public static Point getClosestToOrigin(Point firstPoint, Point secondPoint) throws ImpossibleDetermineClosestToOriginException {
        if (distanceToOrigin(firstPoint) == distanceToOrigin(secondPoint)) {
            throw new ImpossibleDetermineClosestToOriginException("Distance is the same!");
        }
        return distanceToOrigin(firstPoint) <= distanceToOrigin(secondPoint) ? firstPoint : secondPoint;

    }

}
