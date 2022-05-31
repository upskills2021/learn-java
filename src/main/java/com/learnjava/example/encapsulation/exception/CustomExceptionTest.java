package com.learnjava.example.encapsulation.exception;

public class CustomExceptionTest {
    public static void main(String[] args) {
        try {
            method1(args);
        } catch (CustomUncheckedException e) {
            e.printStackTrace();
            System.err.println(e);
        }

    }

    private static void method1(String[] args) throws CustomUncheckedException {
        if (args.length > 0) {
            System.out.println("Program arguments passed :: ");
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
        } else {
           // throw new CustomCheckedException("Program arguments are empty...");
            throw new CustomUncheckedException("Program arguments are empty...");
        }
    }
}
