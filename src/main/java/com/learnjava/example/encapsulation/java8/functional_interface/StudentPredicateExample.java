package com.learnjava.example.encapsulation.java8.functional_interface;


import com.learnjava.example.encapsulation.java8.data.Student;
import com.learnjava.example.encapsulation.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StudentPredicateExample {
    public static void main(String[] args) {
        Predicate<Student> studentGradeLevelPredicate = (s) -> s.getGradeLevel() >= 3;
        Predicate<Student> studentGpaPredicate = (s) -> s.getGpa() >= 3.9;
        Consumer<Student> studentConsumer = s -> System.out.println("Student Name :: " + s.getName());

        List<Student> filteredStudents = StudentDataBase.getAllStudents()
                .stream()
                .filter(studentGradeLevelPredicate)
                .filter(studentGpaPredicate)
                .collect(Collectors.toList());
        filteredStudents.forEach(studentConsumer);
    }
}
