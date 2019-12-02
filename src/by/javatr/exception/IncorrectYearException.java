package by.javatr.exception;

public class IncorrectYearException  extends Exception {

    public IncorrectYearException() {
        super();
    }

    public IncorrectYearException(String message) {
        super(message);
    }

    public IncorrectYearException(String message, Throwable cause) {
        super(message, cause);
    }
}
