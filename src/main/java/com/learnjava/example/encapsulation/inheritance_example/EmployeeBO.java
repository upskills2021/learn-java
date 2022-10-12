package com.learnjava.example.encapsulation.inheritance_example;

public class EmployeeBO {
    public Double calculateNetIncome(Employee employee) {
        double grossSalary = employee.getBasicSalary() + employee.getDa() + employee.getHra();
        double deduction = grossSalary - employee.getPf() - employee.getPt();
        return (grossSalary - deduction);
    }
}
