package by.javatr.task7.util.test;

import by.javatr.task7.util.Point;
import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distanceToOriginTest_Positive_Integers() {

        Point point=new Point(1,5);

        double expected=5.1;
        double actual=point.distanceToOrigin();

        Assert.assertEquals(expected,actual,.01);
    }

    @Test
    public void distanceToOriginTest_Positive_Doubles() {

        Point point=new Point(1.7,5.9);

        double expected=6.14;
        double actual=point.distanceToOrigin();

        Assert.assertEquals(expected,actual,.01);
    }

    @Test
    public void distanceToOriginTest_Negative_Numbers() {

        Point point=new Point(-1,7);

        double expected=7.07;
        double actual=point.distanceToOrigin();

        Assert.assertEquals(expected,actual,.01);
    }
}
