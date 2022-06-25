package com.learnjava.example.encapsulation.java8.stream;

import com.learnjava.example.encapsulation.java8.data.Student;
import com.learnjava.example.encapsulation.java8.data.StudentDataBase;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;


public class StudentStreamExample {
    public static void main(String[] args) {
        List<Student> allStudents = StudentDataBase.getAllStudents();
        Map<Integer, Map<String, List<String>>> studentActivitiesMap = getStudentMap(allStudents);
        BiConsumer<String, List<String>> studentNameActivitiesConsumer = (name, activities) -> System.out.println(name + " - " + activities);
        BiConsumer<Integer, Map<String, List<String>>> studentBiConsumer = (id, activitiesMap) -> {
            System.out.print(id + " ");
            activitiesMap.forEach(studentNameActivitiesConsumer);
        };
        studentActivitiesMap.forEach(studentBiConsumer);

        System.out.println("Unique activities :: " + findoutTotalUniqueActivities(allStudents));
    }

    private static long findoutTotalUniqueActivities(List<Student> allStudents) {
        return allStudents.stream() //Stream<Student>
                .map(Student::getActivities) // Stream<List<String>>
                .flatMap(Collection::stream) // Stream<String>
                .distinct() // Stream<String>
                .count();
    }

    private static Map<Integer, Map<String, List<String>>> getStudentMap(List<Student> allStudents) {
        return allStudents.stream() // Stream<Student>
                .filter(s -> s.getGradeLevel() >= 3) // Stream<Student>
                .filter(s -> s.getGpa() >= 3.9) // Stream<Student>
                .collect(Collectors.groupingBy(Student::getId, Collectors.toMap(Student::getName, Student::getActivities))); // Map<Integer, Map<String, List<String>>>
    }
}
