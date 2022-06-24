package com.learnjava.example.encapsulation.java8.functional_interface;

import com.learnjava.example.encapsulation.java8.data.Student;
import com.learnjava.example.encapsulation.java8.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentFunctionExample {
    static Predicate<Student> p1 = (s) -> s.getGradeLevel() > 3;

    static Function<List<Student>, Map<String, Double>> studentMapFunction = (students -> {
        Map<String, Double> studentGradeMap = new HashMap<>();
        students.forEach((student -> {
            if (p1.test(student)) {
                 studentGradeMap.put(student.getName(), student.getGpa());
            }
        }));
        return studentGradeMap;
    });

    public static void main(String[] args) {
        Map<String, Double> studentMap = studentMapFunction.apply(StudentDataBase.getAllStudents());
        System.out.println(studentMap);
    }
}
