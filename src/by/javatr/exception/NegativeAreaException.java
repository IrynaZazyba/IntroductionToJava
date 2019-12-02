package by.javatr.exception;

public class NegativeAreaException extends Exception {

    public NegativeAreaException() {
        super();
    }

    public NegativeAreaException(String message) {
        super(message);
    }

    public NegativeAreaException(String message, Throwable cause) {
        super(message, cause);
    }
}
