package com.learnjava.example.encapsulation.non_static_context;

public class NonstaticMembers {
    int x;
    static int y;

    static {
        System.out.println("Inside static block");
        y += 10;
    }

    {
        System.out.println("Inside non static block");
        x += 20;
        y += 20;
    }

    NonstaticMembers() {
        System.out.println("Inside Constructor");
        x += 30;
        y += 30;
    }
    void init() {
        System.out.println("Inside init method");
        x += 40;
        y += 40;
    }

}
