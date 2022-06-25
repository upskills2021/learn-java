package com.learnjava.example.encapsulation.java8;

import java.util.function.Consumer;

public class EffectivelyFinalExample {
    private static int k = 0;
    public static void main(String[] args) {
        int i = 0;
        Consumer<Integer> c1 = (a) -> {
           int j = i;
           k = k+1;
           System.out.println(j);
        };

    }
}
