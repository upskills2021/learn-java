package com.learnjava.example.encapsulation.java8.methodreference;

import com.learnjava.example.encapsulation.java8.data.Student;

import java.util.function.Supplier;

public class SupplierMethodReference {
    private static Supplier<Student> studentSupplier = Student::new;

    public static void main(String[] args) {
        System.out.println(studentSupplier.get());
    }
}
