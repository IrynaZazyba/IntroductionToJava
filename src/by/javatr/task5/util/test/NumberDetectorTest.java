package by.javatr.task5.util.test;

import by.javatr.exception.NotPositiveNumberException;
import by.javatr.task5.util.NumberHelper;
import org.junit.Assert;
import org.junit.Test;

public class NumberDetectorTest {


    @Test
    public void isNumberPerfectTest_Positive_Perfect_Integer() throws NotPositiveNumberException {

        int positiveNumber=6;

        boolean actual= NumberHelper.isNumberPerfect(positiveNumber);

        Assert.assertTrue(actual);
    }

    @Test
    public void isNumberPerfectTest_Positive_Not_Perfect_Integer() throws NotPositiveNumberException{

        int positiveNumber=7;

        boolean actual= NumberHelper.isNumberPerfect(positiveNumber);

        Assert.assertFalse(actual);
    }

    @Test(expected = NotPositiveNumberException.class)
    public void isNumberPerfectTest_Negative_Integer() throws NotPositiveNumberException{

        int positiveNumber=-9;

        NumberHelper.isNumberPerfect(positiveNumber);

    }

}
