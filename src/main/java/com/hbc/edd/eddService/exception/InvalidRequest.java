package com.hbc.edd.eddService.exception;

public class InvalidRequest extends RuntimeException{
    public InvalidRequest() {
        super();
    }

    public InvalidRequest(String message) {
        super(message);
    }

    public InvalidRequest(String msg, Exception exception) {
        super(msg, exception);
    }

}
