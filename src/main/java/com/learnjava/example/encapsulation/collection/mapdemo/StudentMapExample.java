package com.learnjava.example.encapsulation.collection.mapdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentMapExample {

    public static void main(String[] args) {
        List<Student> students = StudentData.getAllStudents();
        //Group by grade and find student count on particular grade
        Map<String, Integer> studentGradeCount = groupByGrade(students);
        // Find Student with Particular Grade
        List<Student> studentWithParticularGrade = findStudentWithParticularGrade(students, "B");
        System.out.println(studentWithParticularGrade);

        for (String key : studentGradeCount.keySet()) {
            List<Student> studentsByGrade = findStudentWithParticularGrade(students, key);
            System.out.println("Grade :: " + key + " -> Students :: " + studentsByGrade);
        }
    }

    private static List<Student> findStudentWithParticularGrade(List<Student> students, String grade) {
        List<Student> filteredStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getGrade().equals(grade)) {
                filteredStudents.add(student);
            }
        }
        return filteredStudents;
    }

    private static Map<String, Integer> groupByGrade(List<Student> students) {
        Map<String, Integer> studentGradeCount = new HashMap<>();
        for (Student student : students) {
            if (studentGradeCount.containsKey(student.getGrade())) {
                Integer gradeCount = studentGradeCount.get(student.getGrade());
                gradeCount++;
                studentGradeCount.put(student.getGrade(), gradeCount);
            } else {
                studentGradeCount.put(student.getGrade(), 1);
            }
        }
        return studentGradeCount;
    }

    private static List<Student> findStudentWithMaxGpa() {
        // TODO:: logic is to be written
        return null;
    }

    private static List<Student> findStudentWithMinGpa() {
        // TODO:: logic is to be written
        return null;
    }
}
