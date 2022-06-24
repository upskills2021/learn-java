package com.learnjava.example.encapsulation.java8.functional_interface;

import java.util.function.Predicate;

public class PredicateExample {
   private static final Predicate<Integer> p = (i) -> {return i%2 == 0;};
   private static final Predicate<Integer> p1 = (i) -> i % 5 == 0;

    public static void main(String[] args) {
        boolean isEven = p.test(10);
        System.out.println("Number is Even ?? " + isEven);
        boolean isModulo = p1.test(10);
        System.out.println("Number is modulo of 5 ?? " + isModulo);
    }
}
