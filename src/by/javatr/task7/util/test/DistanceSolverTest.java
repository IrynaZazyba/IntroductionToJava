package by.javatr.task7.util.test;

import by.javatr.exception.ImpossibleDetermineClosestToOriginException;
import by.javatr.task7.util.PointService;
import by.javatr.task7.util.Point;
import org.junit.Assert;
import org.junit.Test;


public class DistanceSolverTest {

    @Test
    public void getClosestToOriginTest() throws ImpossibleDetermineClosestToOriginException {
        Point firstPoint = new Point(-1, 7);
        Point secondPoint = new Point(1.7, 5.9);

        Point expected = secondPoint;
        Point actual = PointService.getClosestToOrigin(firstPoint, secondPoint);

        Assert.assertEquals(expected, actual);
    }

    @Test(expected = ImpossibleDetermineClosestToOriginException.class)
    public void getClosestToOriginTest_The_Same_Coordinate() throws ImpossibleDetermineClosestToOriginException {
        Point firstPoint = new Point(-1, 7);
        Point secondPoint = new Point(-1, 7);

        PointService.getClosestToOrigin(firstPoint, secondPoint);

    }

    @Test
    public void distanceToOriginTest_Positive_Integers() {

        Point point = new Point(1, 5);

        double expected = 5.1;
        double actual = PointService.distanceToOrigin(point);

        Assert.assertEquals(expected, actual, .01);
    }

    @Test
    public void distanceToOriginTest_Positive_Doubles() {

        Point point = new Point(1.7, 5.9);

        double expected = 6.14;
        double actual = PointService.distanceToOrigin(point);

        Assert.assertEquals(expected, actual, .01);
    }

    @Test
    public void distanceToOriginTest_Negative_Numbers() {

        Point point = new Point(-1, 7);

        double expected = 7.07;
        double actual = PointService.distanceToOrigin(point);

        Assert.assertEquals(expected, actual, .01);
    }

}