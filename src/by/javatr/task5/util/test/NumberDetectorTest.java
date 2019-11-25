package by.javatr.task5.util.test;

import by.javatr.task5.util.NumberDetector;
import org.junit.Assert;
import org.junit.Test;

public class NumberDetectorTest {


    @Test
    public void isNumberPerfectTest_Positive_Perfect_Integer() {

        int positiveNumber=6;

        boolean actual= NumberDetector.isNumberPerfect(positiveNumber);

        Assert.assertTrue(actual);
    }

    @Test
    public void isNumberPerfectTest_Positive_Not_Perfect_Integer() {

        int positiveNumber=7;

        boolean actual= NumberDetector.isNumberPerfect(positiveNumber);

        Assert.assertFalse(actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void isNumberPerfectTest_Negative_Integer() throws IllegalArgumentException {

        int positiveNumber=-9;

        NumberDetector.isNumberPerfect(positiveNumber);

    }

}
