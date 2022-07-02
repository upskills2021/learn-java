package com.learnjava.example.encapsulation.java8.neumericstream;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumericStreamAggregationFunction {

    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1,10).sum();
        System.out.println("sum of 1 to 10 :: " + sum);

        OptionalInt max = IntStream.rangeClosed(1,50).max();
        System.out.println(max.isPresent()? max.getAsInt(): "no data found");

        OptionalInt min = IntStream.rangeClosed(1,50).min();
        System.out.println(min.isPresent()? min.getAsInt(): "no data found");

        OptionalDouble avg = IntStream.rangeClosed(1,10).average();
        System.out.println(avg.isPresent() ? avg.getAsDouble() : "no data found");
    }
}
