package by.javatr.validator;

/**
 * Класс валидации данных.
 */

public class Validator {

    public static boolean validateEnteredSecondsInDay(int timeInSeconds) {

        return (timeInSeconds < 86400 & timeInSeconds > 0);

    }

    public static boolean validatePositiveDouble(double param) {
        return param > 0.0;
    }

    public static boolean validatePositiveInteger(int param) {
        return param > 0;
    }

    public static boolean validateLineSegmentExist(double startPoint, double endPoint) {
        return endPoint > startPoint;
    }


    public static boolean validateCountMonth(int month) {
        return month <= 12 & month >= 1;

    }


    public static boolean validateIsYearExist(int year) {
        return year > 0;
    }
}
