package com.learnjava.example.encapsulation.collection.mapdemo;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private String studentId;
    private String name;
    private String grade;
    private String gpa;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", gpa='" + gpa + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(getStudentId(), student.getStudentId()) && Objects.equals(getName(), student.getName()) && Objects.equals(getGrade(), student.getGrade()) && Objects.equals(getGpa(), student.getGpa());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStudentId(), getName(), getGrade(), getGpa());
    }

    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }
}
