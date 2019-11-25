package by.javatr.task7.util.test;

import by.javatr.task7.util.DistanceSolver;
import by.javatr.task7.util.Point;
import org.junit.Assert;
import org.junit.Test;


public class DistanceSolverTest {

    @Test
    public void getClosestToOriginTest() {
        Point firstPoint=new Point(-1,7);
        Point secondPoint =new Point(1.7,5.9);

        Point expected=secondPoint;
        Point actual=DistanceSolver.getClosestToOrigin(firstPoint,secondPoint);

        Assert.assertEquals(expected,actual);
    }


}