package com.learnjava.example.encapsulation.java8.stream;

import com.learnjava.example.encapsulation.java8.data.Student;
import com.learnjava.example.encapsulation.java8.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentGroupingByExample {
    public static void main(String[] args) {
        Map<String, List<Student>> studentListMap = groupingByGender();
        System.out.println(studentListMap);
        System.out.println(customizeGroupingExample());
        System.out.println(twoLevelGrouping());
    }

    private static Map<String, List<Student>> groupingByGender() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGender));
    }

    private static Map<String, List<Student>> customizeGroupingExample() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(student ->  student.getGpa() > 3.8 ? "OUTSTANDING" : "AVERAGE"));
    }

    private static Map<Integer, Map<String, List<Student>>> twoLevelGrouping() {
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.groupingBy(student -> student.getGpa() > 3.8 ? "OUTSTANDING" : "AVERAGE")));
    }
}
