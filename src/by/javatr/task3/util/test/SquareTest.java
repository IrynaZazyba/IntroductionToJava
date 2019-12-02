package by.javatr.task3.util.test;

import by.javatr.exception.NegativeAreaException;

import by.javatr.task3.util.SquareService;
import org.junit.Assert;
import org.junit.Test;

public class SquareTest {
    @Test
    public void calculateAreaSquareTest() throws NegativeAreaException {

        double area = 98.7;

        double expected = 49.35;
        double actual = SquareService.calculateAreaSquare(area);

        Assert.assertEquals(expected, actual, .01);
    }

    @Test
    public void ratioOfAreasTest() throws NegativeAreaException {

        double area = 98.7;
        double inscribedSquareArea = SquareService.calculateAreaSquare(area);

        double expected = 2;
        double actual = SquareService.ratioOfAreas(area,inscribedSquareArea);

        Assert.assertEquals(expected, actual, .0);

    }
}
