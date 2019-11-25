package by.javatr.task9.util.test;

import by.javatr.task9.util.Circle;
import org.junit.Assert;
import org.junit.Test;

public class CircleTest {

    @Test
    public void calculateСircumferenceTest() {

        Circle circle = new Circle(7.8);

        double expected=49.01;
        double actual=circle.calculateСircumference();

        Assert.assertEquals(expected,actual,.01);

    }

    @Test
    public void calculateCircleAreaTest() {

        Circle circle = new Circle(9.4);

        double expected=277.59;
        double actual=circle.calculateCircleArea();

        Assert.assertEquals(expected,actual,.01);

    }
}