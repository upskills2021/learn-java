package com.learnjava.example.encapsulation.java8.parallelstream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStream {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        Supplier<Integer> sequentialStreamSupplier = () -> sum_sequential_stream();
        Supplier<Integer> parallelStreamSupplier = () -> sum_parallel_stream();
        long sequentialDuration = checkPerformanceResult(sequentialStreamSupplier, 20);
        System.out.println("Sequential Duration in milliseconds : " + sequentialDuration);
        long parallelDuration = checkPerformanceResult(parallelStreamSupplier, 20);
        System.out.println("Parallel Duration in milliseconds : " + parallelDuration);
    }

    public static long checkPerformanceResult(Supplier<Integer> sum, int numberOfTimes) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < numberOfTimes; i++) {
            sum.get();
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static int sum_parallel_stream() {
        return IntStream.rangeClosed(1, 10000)
                .parallel() // splits data into multiple parts
                .sum();// perform the sum of indivitual parts and consolidate the result
    }

    public static int sum_sequential_stream() {
        return IntStream.rangeClosed(1, 10000).sum();
    }
}
