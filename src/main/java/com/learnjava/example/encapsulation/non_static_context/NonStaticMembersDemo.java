package com.learnjava.example.encapsulation.non_static_context;

public class NonStaticMembersDemo {
    static {
        System.out.println("Inside Static block1");
    }
    {
        System.out.println("Inside non static block1");
    }
    public NonStaticMembersDemo(){
        System.out.println("Inside constructor");
    }

    public static void main(String[] args) {
        NonStaticMembersDemo demo = new NonStaticMembersDemo();
        System.out.println("Inside main method()");
        NonstaticMembers nonstaticMembers = new NonstaticMembers();
        System.out.println("x = " + nonstaticMembers.x);
        System.out.println("y = " + NonstaticMembers.y);
        nonstaticMembers.init();
        System.out.println("After init method execution");
        System.out.println("x = " + nonstaticMembers.x);
        System.out.println("y = " + NonstaticMembers.y);

    }
}
