package com.learnjava.example.encapsulation.interface_demo;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
