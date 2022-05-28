package com.learnjava.example.encapsulation.inheritance_example;

public class Student extends Person{
    private String studentId;
    private String collegeName;
    private String departmentName;
    private int rollNo;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", phoneNo='" + getPhoneNo() + '\'' +
                ", address=" + getAddress() + '\'' +
                "studentId='" + studentId + '\'' +
                ", collegeName='" + collegeName + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
}
