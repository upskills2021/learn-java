package com.learnjava.example.encapsulation.exception;

public class CustomExceptionTest {
    public static void main(String[] args) {
        try {
            method1(args);
        } catch (CustomUncheckedException e) {
            System.out.println(e);
        }

    }

    private static void method1(String[] args) {
        if (args.length > 0) {
            System.out.println("Program arguments passed :: ");
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
        } else {
            //throw new CustomCheckedException("Program arguments are empty...");
            throw new CustomUncheckedException("Program arguments are empty...");
        }
    }
}
