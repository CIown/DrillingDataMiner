package com.ddm.config.exception;

/**
 * @author Jqy
 */
public class ValidationException extends RuntimeException {

    public ValidationException() {
        super("Validation Error");
    }

    public ValidationException(String message) {
        super(message);
    }

    public ValidationException(String message, Throwable ex) {
        super(message, ex);
    }

}
