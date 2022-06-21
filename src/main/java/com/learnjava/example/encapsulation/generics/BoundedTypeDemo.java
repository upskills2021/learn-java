package com.learnjava.example.encapsulation.generics;

import java.util.List;
import java.util.Optional;

public class BoundedTypeDemo {
    public static void main(String[] args) {
        BoundedType<Integer> boundedType = new BoundedType<>(List.of(1,2,3));
        Optional<Integer> minItemOptional = boundedType.findMinItem();
        minItemOptional.ifPresent(System.out::println);

        Optional<Integer> maxItemOptional = boundedType.findMaxItem();
        maxItemOptional.ifPresent(System.out::println);
    }
}
