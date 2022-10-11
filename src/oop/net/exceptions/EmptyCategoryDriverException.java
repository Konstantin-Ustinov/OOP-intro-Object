package oop.net.exceptions;

public class EmptyCategoryDriverException extends RuntimeException{
    public EmptyCategoryDriverException() {
    }

    public EmptyCategoryDriverException(String message) {
        super(message);
    }
}
