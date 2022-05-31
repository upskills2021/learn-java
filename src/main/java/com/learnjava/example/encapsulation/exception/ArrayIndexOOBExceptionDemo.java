package com.learnjava.example.encapsulation.exception;

public class ArrayIndexOOBExceptionDemo {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30};
        System.out.println("Elements of the array :: ");
        try {
            for (int i = 0; i <= arr.length; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("After array output");
    }
}
