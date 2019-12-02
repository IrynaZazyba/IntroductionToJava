package by.javatr.task6.util;

public class TimeConvertorService {

    public static int getHour(SecondOfTheDay timeInSeconds) {
        return timeInSeconds.getTimeInSeconds() / 3600;
    }

    public static int getMinute(SecondOfTheDay timeInSeconds) {
        return timeInSeconds.getTimeInSeconds() / 60 % 60;
    }

    public static int getSecond(SecondOfTheDay timeInSeconds) {
        return timeInSeconds.getTimeInSeconds() % 60;

    }


}
