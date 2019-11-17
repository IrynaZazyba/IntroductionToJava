package by.javatr.validator;


public class Validator {

    public static boolean validateEnteredSecondsInDay(int timeInSeconds) {

        return (timeInSeconds < 86400 & timeInSeconds > 0);

    }


    public static boolean validatePositiveDouble(double param) {
        return param > 0.0;
    }


    public static boolean validateLineSegmentExist(double startPoint, double endPoint ) {
        return endPoint>startPoint;
    }

}
