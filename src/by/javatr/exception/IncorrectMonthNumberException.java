package by.javatr.exception;

public class IncorrectMonthNumberException extends Exception{

    public IncorrectMonthNumberException() {
        super();
    }

    public IncorrectMonthNumberException(String message) {
        super(message);
    }

    public IncorrectMonthNumberException(String message, Throwable cause) {
        super(message, cause);
    }
}
