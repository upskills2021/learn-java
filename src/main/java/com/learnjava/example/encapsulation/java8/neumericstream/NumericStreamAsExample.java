package com.learnjava.example.encapsulation.java8.neumericstream;

import java.util.stream.IntStream;

public class NumericStreamAsExample {
    private static long asLongStream() {
        return IntStream.rangeClosed(1,5).asLongStream().sum();
    }
    private static double asDoubleStream() {
        return IntStream.rangeClosed(1,5).asDoubleStream().sum();
    }
    public static void main(String[] args) {
        System.out.println("asDoubleStream :: " + asDoubleStream());
        System.out.println("asLongStream :: " + asLongStream());
    }
}
