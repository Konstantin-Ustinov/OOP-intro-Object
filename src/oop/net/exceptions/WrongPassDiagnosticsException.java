package oop.net.exceptions;

public class WrongPassDiagnosticsException extends RuntimeException{
    public WrongPassDiagnosticsException() {
    }

    public WrongPassDiagnosticsException(String message) {
        super(message);
    }
}
