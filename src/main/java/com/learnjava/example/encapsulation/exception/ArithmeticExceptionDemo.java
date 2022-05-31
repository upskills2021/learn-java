package com.learnjava.example.encapsulation.exception;

import java.util.Scanner;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        try {
            int a, b, c;
            System.out.println("Enter two numbers: ");
            Scanner scanner = new Scanner(System.in);
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = a / b;
            System.out.println("Result is " + c);
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }
        System.out.println("More code goes here");
    }
}
