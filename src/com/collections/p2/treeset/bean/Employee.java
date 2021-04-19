package com.collections.p2.treeset.bean;

public class Employee implements Comparable<Employee>{
    private int empId;
    private String empName;
    private String empEmail;
    private char empGender;
    private float empSalary;

    public Employee() {
    }

    public Employee(int empId, String empName, String empEmail, char empGender, float empSalary) {
        super();
        this.empId = empId;
        this.empName = empName;
        this.empEmail = empEmail;
        this.empGender = empGender;
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public char getEmpGender() {
        return empGender;
    }

    public float getEmpSalary() {
        return empSalary;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public void setEmpGender(char empGender) {
        this.empGender = empGender;
    }

    public void setEmpSalary(float empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmployeeDetails() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empEmail='" + empEmail + '\'' +
                ", empGender=" + empGender +
                ", empSalary=" + empSalary +
                '}';
    }

    @Override
    public int compareTo(Employee employee) {
        return this.getEmpId()-employee.getEmpId();
    }
}
