package com.learnjava.example.encapsulation.java8.stream;

import com.learnjava.example.encapsulation.java8.data.Student;
import com.learnjava.example.encapsulation.java8.data.StudentDataBase;

import java.util.stream.Collectors;

public class StudentJoiningExample {
    public static void main(String[] args) {
        System.out.println("All student names :: " + joiningWithDelimiter());
        System.out.println("All student names :: " + joiningWithDelimiterWithPrefix());
    }

    private static String joiningWithDelimiter() {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining("-"));
    }
    private static String joiningWithDelimiterWithPrefix() {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining("-", "[", "]"));
    }
}
