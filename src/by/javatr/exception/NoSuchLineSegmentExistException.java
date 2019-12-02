package by.javatr.exception;

public class NoSuchLineSegmentExistException extends Exception {

    public NoSuchLineSegmentExistException() {
        super();
    }

    public NoSuchLineSegmentExistException(String message) {
        super(message);
    }

    public NoSuchLineSegmentExistException(String message, Throwable cause) {
        super(message, cause);
    }
}
