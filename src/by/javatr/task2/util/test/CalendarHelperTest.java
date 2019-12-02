package by.javatr.task2.util.test;

import by.javatr.exception.IncorrectMonthNumberException;
import by.javatr.exception.IncorrectYearException;
import by.javatr.task2.util.CalendarHelper;
import org.junit.Assert;
import org.junit.Test;

public class CalendarHelperTest {

    @Test
    public void countOfDayTest_Correct_Data()throws IncorrectMonthNumberException,IncorrectYearException{

        int year=2019;
        int month=11;

        int expected=30;
        int actual= CalendarHelper.countOfDay(year,month);

        Assert.assertEquals(expected,actual);

    }

    @Test(expected= IncorrectMonthNumberException.class)
    public void countOfDayTest_Wrong_Month() throws IncorrectMonthNumberException,IncorrectYearException {

        int year=2019;
        int month=19;

        CalendarHelper.countOfDay(year,month);

    }

    @Test(expected=IncorrectYearException.class)
    public void countOfDayTest_Wrong_Year() throws IncorrectMonthNumberException,IncorrectYearException{

        int year=-987;
        int month=12;

        CalendarHelper.countOfDay(year,month);

    }

    @Test
    public void countOfDayTest_Leap_Year()throws IncorrectYearException,IncorrectMonthNumberException{

        int year=2012;
        int month=2;

        int expected=29;
        int actual=CalendarHelper.countOfDay(year,month);

        Assert.assertEquals(expected,actual);

    }


}
