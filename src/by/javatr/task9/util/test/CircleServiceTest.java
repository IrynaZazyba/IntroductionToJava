package by.javatr.task9.util.test;

import by.javatr.exception.NotPositiveNumberException;
import by.javatr.task9.util.Circle;
import by.javatr.task9.util.CircleService;
import org.junit.Assert;
import org.junit.Test;

public class CircleServiceTest {

    @Test
    public void calculateСircumferenceTest() throws NotPositiveNumberException {

        Circle circle = new Circle(7.8);

        double expected=49.01;
        double actual= CircleService.calculateСircumference(circle);

        Assert.assertEquals(expected,actual,.01);

    }

    @Test
    public void calculateCircleAreaTest() throws NotPositiveNumberException {

        Circle circle = new Circle(9.4);

        double expected=277.59;
        double actual=CircleService.calculateCircleArea(circle);

        Assert.assertEquals(expected,actual,.01);

    }
}