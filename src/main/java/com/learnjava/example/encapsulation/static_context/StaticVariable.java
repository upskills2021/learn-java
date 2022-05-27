package com.learnjava.example.encapsulation.static_context;

public class StaticVariable {
  private static int x;
  static {
      System.out.println("Inside the static block of static variable class");
      x = 10;
    }

    public static void main(String[] args) {
        System.out.println("Inside main method");
        System.out.println("Value of x :: " + x);
    }
}
