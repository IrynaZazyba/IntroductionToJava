package by.javatr.task6.util.test;

import by.javatr.task6.util.TimeConvertor;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class TimeConvertorTest {

    private static TimeConvertor timeConvertor;

    @BeforeClass
    public static void getConvertor() {
        timeConvertor = new TimeConvertor(9600);
    }

    @Test
    public void getHourTest() {

        int expected = 2;
        int actual = timeConvertor.getHour();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMinuteTest() {

        int expected=40;
        int actual=timeConvertor.getMinute();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getSecondTest() {

        int expected=0;
        int actual=timeConvertor.getSecond();

        Assert.assertEquals(expected,actual);
    }
}