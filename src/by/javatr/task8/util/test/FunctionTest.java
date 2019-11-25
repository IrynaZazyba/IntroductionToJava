package by.javatr.task8.util.test;

import by.javatr.task10.util.LineSegment;
import by.javatr.task8.util.Function;
import org.junit.Assert;
import org.junit.Test;

public class FunctionTest {

    @Test
    public void calculateFunctionTest_Positive_Number() {

        double x=5.7;

        double expected=-6.39;
        double actual= Function.calculateFunction(x);

        Assert.assertEquals(expected,actual,.001);
    }

    @Test
    public void calculateFunctionTest_Negative_Number() {

        double x=2.0;

        double expected=0.5;
        double actual= Function.calculateFunction(x);

        Assert.assertEquals(expected,actual,.001);

    }

    @Test
    public void calculateFunctionWithStepTest_() {

        LineSegment ls=new LineSegment(9,16.2,2);

        double [][] expected={{9,-0.452},{11,-225.951},{13,0.463},{15,-0.856}};
        double [][] actual=Function.calculateFunctionWithStep(ls);

        Assert.assertArrayEquals(expected[0],actual[0],0.001);
        Assert.assertArrayEquals(expected[1],actual[1],0.001);
        Assert.assertArrayEquals(expected[2],actual[2],0.001);
        Assert.assertArrayEquals(expected[3],actual[3],0.001);

    }
}