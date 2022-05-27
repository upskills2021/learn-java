package com.learnjava.example.encapsulation.static_context;

public class StaticMethodDemo {
  static void method1() {
      System.out.println("Inside method1");
  }
  static {
      System.out.println("Inside static block");
  }

    public static void main(String[] args) {
        method1();
        System.out.println("Inside main method");
    }
}
