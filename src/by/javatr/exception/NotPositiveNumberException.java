package by.javatr.exception;

public class NotPositiveNumberException extends Exception {

    public NotPositiveNumberException() {
        super();
    }

    public NotPositiveNumberException(String message) {
        super(message);
    }

    public NotPositiveNumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotPositiveNumberException(Throwable cause) {
        super(cause);
    }
}
