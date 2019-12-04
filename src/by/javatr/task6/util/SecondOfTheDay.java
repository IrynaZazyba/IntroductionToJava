package by.javatr.task6.util;

import by.javatr.exception.NotPositiveNumberException;
import by.javatr.validator.Validator;

public class SecondOfTheDay {

    private int timeInSeconds;

    public SecondOfTheDay() {
        timeInSeconds=86400;
    }

    public SecondOfTheDay(int timeInSeconds) throws NotPositiveNumberException {

        if (!Validator.validateEnteredSecondsInDay(timeInSeconds)) {
            throw new NotPositiveNumberException("Invalid integer value was entered");
        }
        this.timeInSeconds = timeInSeconds;

    }

    public void setTimeInSeconds(int timeInSeconds) throws NotPositiveNumberException {
        if (!Validator.validateEnteredSecondsInDay(timeInSeconds)) {
            throw new NotPositiveNumberException("Invalid integer value was entered");
        }
        this.timeInSeconds = timeInSeconds;
    }

    public int getTimeInSeconds() {
        return timeInSeconds;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        SecondOfTheDay that = (SecondOfTheDay) obj;
        if(timeInSeconds!=that.timeInSeconds)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int prime=31;
        int result=1;
        result=prime*result+timeInSeconds;
        return result;
    }

    @Override
    public String toString() {
        return getClass().getName()+"@"
                +" timeInSeconds:" + timeInSeconds;
    }
}
