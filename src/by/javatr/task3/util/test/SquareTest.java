package by.javatr.task3.util.test;

import by.javatr.task3.util.Square;
import org.junit.Assert;
import org.junit.Test;

public class SquareTest {
    @Test
    public void calculateAreaSquareTest() {

        double parentAreaSquare = 98.7;

        Square sq = new Square(parentAreaSquare);

        double expected = 49.35;
        double actual = sq.calculateAreaSquare();

        Assert.assertEquals(expected, actual, .01);
    }

    @Test
    public void ratioOfAreasTest() {

        double parentAreaSquare = 98.7;
        double area = 49.35;

        Square sq = new Square(parentAreaSquare);
        sq.calculateAreaSquare();

        double expected = 2;
        double actual = sq.ratioOfAreas();

        Assert.assertEquals(expected, actual, .0);

    }
}
