package by.javatr.exeption;

/**
 * Thrown when the number of seconds in the day
 * is not in the range of acceptable values.
 */
public class NumberSecondsInDayException extends Exception {

    public NumberSecondsInDayException(String message){
        super(message);
    }


}
