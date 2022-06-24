package com.learnjava.example.encapsulation.java8.functional_interface;

import java.util.function.Function;

public class FunctionExample {
    static Function<String, String> toUpperCaseFunction = (str) -> str.toUpperCase();
    static Function<String, String> addSomeString = (name) -> name.toUpperCase().concat("default");

    public static void main(String[] args) {
        String str = toUpperCaseFunction.apply("Java8");
        System.out.println(str);
        String str1 = addSomeString.apply("Java8");
        System.out.println(str1);

        System.out.println(toUpperCaseFunction.andThen(addSomeString).apply("java8"));

    }
}
