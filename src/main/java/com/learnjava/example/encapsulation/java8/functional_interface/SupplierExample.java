package com.learnjava.example.encapsulation.java8.functional_interface;

import com.learnjava.example.encapsulation.java8.data.Student;
import com.learnjava.example.encapsulation.java8.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class SupplierExample {
    public static Supplier<Student> studentSupplier = () -> {
        return  new Student("Adam",2,4.0,"male", Arrays.asList("swimming", "basketball","volleyball"));
    };
    public static Supplier<List<Student>> supplierStudents = () -> StudentDataBase.getAllStudents();

    public static void main(String[] args) {
           Student student = studentSupplier.get();
           System.out.println(student);
           List<Student> students = supplierStudents.get();
           System.out.println(students);
           Optional.ofNullable(student).ifPresent(System.out::println);
    }
}
