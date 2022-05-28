package com.learnjava.example.encapsulation.inheritance_example;

public class Employee extends Person{
    private String empId;
    private String empTitle;
    private Double salary;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpTitle() {
        return empTitle;
    }

    public void setEmpTitle(String empTitle) {
        this.empTitle = empTitle;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
