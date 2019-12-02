package by.javatr.task6.util.test;

import by.javatr.exception.NotPositiveNumberException;
import by.javatr.task6.util.SecondOfTheDay;
import by.javatr.task6.util.TimeConvertorService;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class TimeConvertorTest {


    public static SecondOfTheDay secondOfTheDay;

    @BeforeClass
    public static void getSecondOfTheDay() throws NotPositiveNumberException {
        secondOfTheDay=new SecondOfTheDay(9600);
    }

    @Test
    public void getHourTest() {

        int expected = 2;
        int actual = TimeConvertorService.getHour(secondOfTheDay);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMinuteTest() {

        int expected=40;
        int actual=TimeConvertorService.getMinute(secondOfTheDay);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getSecondTest() {

        int expected=0;
        int actual=TimeConvertorService.getSecond(secondOfTheDay);

        Assert.assertEquals(expected,actual);
    }
}