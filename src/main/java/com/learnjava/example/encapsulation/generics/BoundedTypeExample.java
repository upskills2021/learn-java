package com.learnjava.example.encapsulation.generics;

import java.util.Collection;
import java.util.List;

public class BoundedTypeExample {
    public static <T extends Number> Integer sumItems(final Collection<T> numbers) {
        return numbers
                .stream()
                .mapToInt(Number::intValue)
                .reduce(0, Integer:: sum);

    }

    public static void main(String[] args) {
        Integer sum = sumItems(List.of(1 ,2, 1.0));
        System.out.println(sum);
    }
}
