package com.learnjava.example.encapsulation.java8.stream;

import com.learnjava.example.encapsulation.java8.data.Student;
import com.learnjava.example.encapsulation.java8.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMapFunctionExample {
    public static void main(String[] args) {
        List<Student> students = StudentDataBase.getAllStudents();
        System.out.println(findStudentNames(students));
    }

    private static List<String> findStudentNames(List<Student> students) {
        return students.stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
