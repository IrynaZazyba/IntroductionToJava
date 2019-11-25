package by.javatr.task1.util.test;

import by.javatr.task1.util.NumberHelper;
import org.junit.Assert;
import org.junit.Test;

public class NumberHelperTest {

    @Test
    public void getLastDigitTest_Positive_Integer() {

        int positiveNumber = 789;

        int actual = 9;
        int expected = NumberHelper.getLastDigit(positiveNumber);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getLastDigitTest_Negative_Integer() {

        int negativeNumber = -987;

        int actual = 7;
        int expected = NumberHelper.getLastDigit(negativeNumber);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findLastNumberOfSquaredTest_Positive_Integer() {

        int positiveInteger=9;

        int actual=1;
        int expected=NumberHelper.findLastNumberOfSquared(positiveInteger);

        Assert.assertEquals(expected,actual);
    }


}
