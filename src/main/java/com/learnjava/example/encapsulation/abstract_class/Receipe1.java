package com.learnjava.example.encapsulation.abstract_class;

public class Receipe1 extends Receipe{
    @Override
    void getReady() {
        System.out.println("Get ready with Raw materials for Receipe1");
    }

    @Override
    void doTheDish() {
        System.out.println("Do the dish for Receipe1");
    }

    @Override
    void cleanUp() {
        System.out.println("Clean up utensils after Receipe1");
    }
}
