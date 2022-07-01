package com.learnjava.example.encapsulation.java8.parallelstream;

import com.learnjava.example.encapsulation.java8.data.Student;
import com.learnjava.example.encapsulation.java8.data.StudentDataBase;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStream1 {
    private static List<String> getActivitiesUsingSequentialStream() {
        long start = System.currentTimeMillis();
        List<String> activities = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println("Duration in sequential stream : " + duration);
        return activities;
    }

    private static List<String> getActivitiesUsingParallelStream() {
        long start = System.currentTimeMillis();
        List<String> activities = StudentDataBase.getAllStudents()
                .stream()
                .parallel()
                .map(Student::getActivities)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println("Duration in parallel stream : " + duration);
        return activities;
    }

    public static void main(String[] args) {
        getActivitiesUsingSequentialStream();
        getActivitiesUsingParallelStream();
    }
}
