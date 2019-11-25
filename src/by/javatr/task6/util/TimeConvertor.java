
package by.javatr.task6.util;

import by.javatr.validator.Validator;

public class TimeConvertor {

    private int hour;
    private int minute;
    private int second;
    private int timeInSeconds;


    public TimeConvertor(int timeInSeconds) throws IllegalArgumentException {

        if (!Validator.validateEnteredSecondsInDay(timeInSeconds)) {
            throw new IllegalArgumentException("Invalid integer value was entered");
        }
        this.timeInSeconds = timeInSeconds;

    }

    public int getHour() {
        if (hour == 0) {
            hour = timeInSeconds / 3600;
        }
        return hour;
    }

    public int getMinute() {
        if (minute == 0) {
            minute = timeInSeconds / 60 % 60;
        }

        return minute;
    }

    public int getSecond() {
        if (second == 0) {
            second = timeInSeconds % 60;
        }
        return second;
    }

}
