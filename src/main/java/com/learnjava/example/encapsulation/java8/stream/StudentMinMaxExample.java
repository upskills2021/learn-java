package com.learnjava.example.encapsulation.java8.stream;

import com.learnjava.example.encapsulation.java8.data.Student;
import com.learnjava.example.encapsulation.java8.data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentMinMaxExample {
    public static void main(String[] args) {
        Optional<Student> optionalMaxStudent = minBy();
        Optional<Student> optionalMinStudent = maxBy();
        System.out.println(optionalMinStudent.get());
        System.out.println(optionalMaxStudent.get());
    }

    private static Optional<Student> minBy() {
        Optional<Student> optionalStudent = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
        return optionalStudent;
    }
    private static Optional<Student> maxBy() {
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
    }
}
