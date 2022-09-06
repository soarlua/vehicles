package com.interview.vehicles.domain.usecase.validate;

public class ValidatedException extends RuntimeException {
    public ValidatedException(String message) {
        super(message);
    }
}
