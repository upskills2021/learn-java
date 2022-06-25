package com.learnjava.example.encapsulation.java8.methodreference;

import com.learnjava.example.encapsulation.java8.data.Student;
import com.learnjava.example.encapsulation.java8.data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReference {
    static Predicate<Student> predicateUsingLamda = RefactorMethodReference::greaterThan;

    private static boolean greaterThan(Student student) {
        return student.getGradeLevel() >= 3;
    }
    public static void main(String[] args) {
        System.out.println(predicateUsingLamda.test(StudentDataBase.studentSupplier.get()));
    }
}
