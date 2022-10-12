package com.learnjava.example.encapsulation.constructor;

public class ConstructorDemo {
    private String message;
    private int x;

    ConstructorDemo() { // default constructor
        this("Hello World");
        System.out.println("Inside default constructor");
    }

    ConstructorDemo(String message) { // parameterized constructor
        this(10, message);
        System.out.println("Inside parameterized constructor1");
    }

    ConstructorDemo(int x, String message) { // parameterized constructor
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
