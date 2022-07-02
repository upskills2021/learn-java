package com.learnjava.example.encapsulation.java8.stream;

import com.learnjava.example.encapsulation.java8.data.Student;
import com.learnjava.example.encapsulation.java8.data.StudentDataBase;

import java.util.Set;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toSet;

public class StudentMappingExample {
    public static void main(String[] args) {
        Set<String> studentNames = StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName, toSet()));
        System.out.println(studentNames);
    }
}
