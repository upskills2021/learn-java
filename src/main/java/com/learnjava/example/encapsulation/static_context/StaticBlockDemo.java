package com.learnjava.example.encapsulation.static_context;

public class StaticBlockDemo {
    static{
        System.out.println("Inside static block1");
    }
    static {
        System.out.println("Inside static block2");
    }


    public static void main(String[] args) {
        System.out.println("Inside main method");
    }
}
