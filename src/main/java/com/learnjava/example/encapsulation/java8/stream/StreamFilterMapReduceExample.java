package com.learnjava.example.encapsulation.java8.stream;

import com.learnjava.example.encapsulation.java8.data.Student;
import com.learnjava.example.encapsulation.java8.data.StudentDataBase;

public class StreamFilterMapReduceExample {
    public static void main(String[] args) {
        System.out.println(noOfNoteBooks());
    }

    private static int noOfNoteBooks() {
        int noOfNotebooks = StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGradeLevel() == 3.0)
                .map(Student::getNoteBooks)
                .reduce(0, Integer::sum);
        return noOfNotebooks;
    }
}
