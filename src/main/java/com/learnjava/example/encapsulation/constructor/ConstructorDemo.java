package com.learnjava.example.encapsulation.constructor;

public class ConstructorDemo {
    private String message;
    private int x;

    ConstructorDemo() {
        this("Hello World");
        System.out.println("Inside default constructor");
    }

    ConstructorDemo(String message) {
        this(10, message);
        System.out.println("Inside parameterized constructor1");
    }

    ConstructorDemo(int x, String message) {
        System.out.println("Inside parameterized constructor2");
        this.x = x;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public int getX() {
        return x;
    }
}
