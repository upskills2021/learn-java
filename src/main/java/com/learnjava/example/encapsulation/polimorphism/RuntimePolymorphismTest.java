package com.learnjava.example.encapsulation.polimorphism;

public class RuntimePolymorphismTest {
    public static void main(String[] args) {
        Child c = new Child();
        c.methodA();
        c.methodB();

        Parent p = new Child();
        p.methodA();
    }
}
