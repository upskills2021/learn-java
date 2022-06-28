package com.learnjava.example.encapsulation.java8.stream;

import com.learnjava.example.encapsulation.java8.data.Student;
import com.learnjava.example.encapsulation.java8.data.StudentDataBase;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StudentFlatMapFunction {
    public static void main(String[] args) {
        List<Student> students = StudentDataBase.getAllStudents();
        System.out.println(findStudentDistinctActivities(students));
    }

    private static List<String> findStudentDistinctActivities(List<Student> students) {
        return students.stream()
                .map(Student::getActivities)// Stream<List<String>>
                .flatMap(Collection::stream) // Stream<String>
                .distinct()
                .collect(Collectors.toList());
    }
}
