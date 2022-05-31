package com.learnjava.example.encapsulation.exception;

public class CustomUncheckedException extends RuntimeException{
    public CustomUncheckedException(String message) {
        super(message);
    }
}
