package by.javatr.task10.util.test;

import by.javatr.exception.NoSuchLineSegmentExistException;
import by.javatr.exception.NotPositiveNumberException;
import by.javatr.task10.util.LineSegment;
import by.javatr.task10.util.FunctionService;
import org.junit.Assert;
import org.junit.Test;

public class FunctionTest {

    @Test
    public void calculateFunctionWithStepTest() throws NoSuchLineSegmentExistException, NotPositiveNumberException {

        LineSegment ls = new LineSegment(9, 16.2);
        double step = 2;
        double[][] expected = {{9, -0.452}, {11, -225.951}, {13, 0.463}, {15, -0.856}};
        double[][] actual = FunctionService.calculateFunctionWithStep(ls, step);

        Assert.assertArrayEquals(expected[0], actual[0], 0.001);
        Assert.assertArrayEquals(expected[1], actual[1], 0.001);
        Assert.assertArrayEquals(expected[2], actual[2], 0.001);
        Assert.assertArrayEquals(expected[3], actual[3], 0.001);

    }

    @Test(expected = NoSuchLineSegmentExistException.class)
    public void calculateFunctionWithStepTest_NoSuchLineSegmentExist() throws NoSuchLineSegmentExistException, NotPositiveNumberException {

        LineSegment ls = new LineSegment(9, 4.7);
        double step = 2;

        FunctionService.calculateFunctionWithStep(ls,step);

    }

    @Test(expected = NotPositiveNumberException.class)
    public void calculateFunctionWithStepTest_NotPositiveNumberException() throws NoSuchLineSegmentExistException, NotPositiveNumberException {

        LineSegment ls = new LineSegment(9, 15.7);
        double step = -2;

        FunctionService.calculateFunctionWithStep(ls,step);

    }

}