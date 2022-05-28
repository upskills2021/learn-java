package com.learnjava.example.encapsulation.abstract_class;

public abstract class Receipe {
    public void execute() {
        getReady();
        doTheDish();
        cleanUp();
    }
    abstract void getReady();
    abstract void doTheDish();
    abstract void cleanUp();
}
