package com.epam.automation.exceptions;

public class NumberOutOfBoundsException extends Exception {
    public NumberOutOfBoundsException(String message) {
        super(message);
    }

    public NumberOutOfBoundsException(String message, Throwable cause) {
        super(message, cause);
    }

    public NumberOutOfBoundsException(Throwable cause) {
        super(cause);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
