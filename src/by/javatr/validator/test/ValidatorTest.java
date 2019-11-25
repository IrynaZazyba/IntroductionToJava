package by.javatr.validator.test;

import by.javatr.validator.Validator;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorTest {

    @Test
    public void validateEnteredSecondsInDayTest_True_Conditions() {

        int secindsInDsy=8500;

        boolean actual=Validator.validateEnteredSecondsInDay(secindsInDsy);

        Assert.assertTrue(actual);

    }

    @Test
    public void validateEnteredSecondsInDayTest_False_Conditions() {

        int secindsInDsy=-800;

        boolean actual=Validator.validateEnteredSecondsInDay(secindsInDsy);

        Assert.assertFalse(actual);

    }



    @Test
    public void validatePositiveDoubleTest_Positive_Double() {

        double positiveNumber= 58.9;

        boolean actual= Validator.validatePositiveDouble(positiveNumber);

        Assert.assertTrue(actual);

    }

    @Test
    public void validatePositiveDoubleTest_Negative_Double() {

        double negativeNumber = -74.9;

        boolean actual=Validator.validatePositiveDouble(negativeNumber);

        Assert.assertFalse(actual);

    }

    @Test
    public void validatePositiveIntegerTest_Positive_Numbers() {

        int positiveNumber= 59;

        boolean actual= Validator.validatePositiveDouble(positiveNumber);

        Assert.assertTrue(actual);
    }

    @Test
    public void validatePositiveIntegerTest_Negative_Numbers() {

        int negativNumber=-59;

        boolean actual= Validator.validatePositiveDouble(negativNumber);

        Assert.assertFalse(actual);
    }



    @Test
    public void validateLineSegmentExistTest_True_Conditions () {

        double startPoint=5;
        double endPoint=9.8;

        boolean actual=Validator.validateLineSegmentExist(startPoint,endPoint);

        Assert.assertTrue(actual);

    }

    @Test
    public void validateLineSegmentExistTest_False_Conditions () {

        double startPoint=-5;
        double endPoint=-7;

        boolean actual=Validator.validateLineSegmentExist(startPoint,endPoint);

        Assert.assertFalse(actual);

    }

    @Test
    public void validateCountMonthTest_True_Conditions() {

        int month=10;

        boolean actual=Validator.validateCountMonth(month);

        Assert.assertTrue(actual);

    }

    @Test
    public void validateCountMonthTest_False_Conditions() {

        int month=15;

        boolean actual=Validator.validateCountMonth(month);

        Assert.assertFalse(actual);

    }

    @Test
    public void validateIsYearExistTest_True_Conditions() {

        int year=2018;

        boolean actual= Validator.validateIsYearExist(year);

        Assert.assertTrue(actual);
    }

    @Test
    public void validateIsYearExistTest_False_Conditions() {

        int year=-987;

        boolean actual= Validator.validateIsYearExist(year);

        Assert.assertFalse(actual);
    }


}