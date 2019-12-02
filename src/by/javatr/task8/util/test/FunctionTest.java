package by.javatr.task8.util.test;

import by.javatr.task8.util.FunctionService;
import org.junit.Assert;
import org.junit.Test;

public class FunctionTest {

    @Test
    public void calculateFunctionTest_Positive_Number() {

        double x = 5.7;

        double expected = -6.39;
        double actual = FunctionService.calculateFunction(x);

        Assert.assertEquals(expected, actual, .001);
    }

    @Test
    public void calculateFunctionTest_Negative_Number() {

        double x = 2.0;

        double expected = 0.5;
        double actual = FunctionService.calculateFunction(x);

        Assert.assertEquals(expected, actual, .001);

    }


}