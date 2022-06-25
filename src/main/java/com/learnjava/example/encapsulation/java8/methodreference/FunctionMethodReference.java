package com.learnjava.example.encapsulation.java8.methodreference;

import java.util.function.Function;

public class FunctionMethodReference {
    private static Function<String, String> toUpperCaseLamda = String::toUpperCase;

    public static void main(String[] args) {
        System.out.println(toUpperCaseLamda.apply("abc"));
    }
 }
