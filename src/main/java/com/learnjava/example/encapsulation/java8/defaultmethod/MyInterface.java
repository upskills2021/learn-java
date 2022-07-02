package com.learnjava.example.encapsulation.java8.defaultmethod;

public interface MyInterface {
    void printIntoLog();
    default void printIntoFileSystem(){

    }
}
