package com.yeahbutstill.demojavaoop.membuatexception;

public class ValidationException extends Throwable {
    public ValidationException(String message) {
        super(message);
    }
}
