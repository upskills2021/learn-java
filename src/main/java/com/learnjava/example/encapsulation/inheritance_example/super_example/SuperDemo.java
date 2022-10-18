package com.learnjava.example.encapsulation.inheritance_example.super_example;

public class SuperDemo {
    public static void main(String[] args) {
        ChildClass childClass = new ChildClass(10, "Hello");
        System.out.println("Value of str :: " + childClass.getStr());
        System.out.println("Value of i :: " + childClass.getI());
    }
}
