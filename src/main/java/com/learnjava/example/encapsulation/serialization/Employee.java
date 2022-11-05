package com.learnjava.example.encapsulation.serialization;

import java.io.Serializable;

public class Employee implements Serializable {
    private static final Long serialVersionUID = 1L;
    private int empId;
    private String empName;

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                '}';
    }
}
