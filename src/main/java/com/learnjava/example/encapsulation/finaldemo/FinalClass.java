package com.learnjava.example.encapsulation.finaldemo;

public final class FinalClass {
    public static final String MSG1 = "Hello";
    public static final String MSG2 = "World";

    private FinalClass() {
        //private constructor is used to prevent the object creation
    }
}
