package com.learnjava.example.encapsulation.java8.optional;

import com.learnjava.example.encapsulation.java8.data.Student;
import com.learnjava.example.encapsulation.java8.data.StudentDataBase;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> studentNameOptional = getStudentName();
        if (studentNameOptional.isPresent())
            System.out.println("Student name :: " + getStudentName().get());
        else
            System.out.println("Student not found");
    }

    public static Optional<String> getStudentName() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        return studentOptional.map(student -> Optional.ofNullable(student.getName())).orElse(Optional.empty());
    }
}
