package com.learnjava.example.encapsulation.exception;

public class MultiCatch {
    public static void main(String[] args) {
        try {
            String input = args[0]; // if arguments are empty
            System.out.println("Input is :: " + input);
            int number = Integer.parseInt(input); // if input string is not number ex: abc
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Input is required :: " + e);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input provided :: " + e);
        } finally {
            System.out.println("Finally block");
        }
    }
}
