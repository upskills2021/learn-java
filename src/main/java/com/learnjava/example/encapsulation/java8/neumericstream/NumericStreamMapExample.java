package com.learnjava.example.encapsulation.java8.neumericstream;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMapExample {
    public static void main(String[] args) {
        System.out.println(mapToDouble());
        System.out.println(mapToObject());

    }

    private static String mapToObject() {
        return IntStream.rangeClosed(1,10).mapToObj(String::valueOf)
                .collect(Collectors.joining("-", "(", ")"));
    }

    private static double mapToDouble() {
        return IntStream.rangeClosed(1, 10).mapToDouble((i) -> i).sum();
    }
}
