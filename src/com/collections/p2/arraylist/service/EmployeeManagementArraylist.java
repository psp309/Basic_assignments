package com.collections.p2.arraylist.service;

import com.collections.p2.arraylist.bean.Employee;
import com.collections.p2.arraylist.bean.EmployeeDB;
/*
* 1. Create an application for employee management having following classes: a)
Create an Employee class with following attributes and behaviors : i) EmpId Int ii)
EmpName String iii) EmpEmail String iv) EmpGender char v) EmpSalary float vi)
GetEmployeeDetails() -> prints employee details
b) Create one more class EmployeeDB which has the following methods. i) boolean
addEmployee(Employee e) ii) boolean deleteEmployee(int empId) iii) String
showPaySlip(int empId) iv) Employee[] listAll()
2. Do implementation of the above application with below two methods : I. Use an
ArrayList which will be used to store the employees and use enumeration/iterator
to process the employees.
*
* */
public class EmployeeManagementArraylist {
    public static void main(String[] args) {

        EmployeeDB employeeDB=new EmployeeDB();

        Employee emp1=new Employee(1,"Pooja","pooja@gmail.com",'F',8000);
        Employee emp2=new Employee(2,"Rahul","rahul@gmail.com",'M',10000);
        Employee emp3=new Employee(3,"Komal","komal@gmail.com",'F',8500);
        Employee emp4=new Employee(4,"Arjun","arjun@yahoo.com",'M',9000);
        Employee emp5=new Employee(5,"smita","smita@gmail.com",'F',10000);
        Employee emp6=new Employee(6,"Kiran","kiran@hotmail.com",'M',11000);
        Employee emp7=new Employee(7,"Rushi","rushi@gmail.com",'M',12000);

        employeeDB.addEmployee(emp1);
        employeeDB.addEmployee(emp2);
        employeeDB.addEmployee(emp3);
        employeeDB.addEmployee(emp4);
        employeeDB.addEmployee(emp5);
        employeeDB.addEmployee(emp6);
        employeeDB.addEmployee(emp7);

        System.out.println("-------------------------List of Employees after adding of employees--------------");
        System.out.println(("                                                                                       "));
        for(Employee e:employeeDB.listAll()){
            System.out.println(e.getEmployeeDetails());
        }
        System.out.println("                                                                    ");
        System.out.println("----------------------------Payslip------------------------------");
        System.out.println("                                                                    ");
        System.out.println(employeeDB.showPaySlip(5));
        System.out.println("                                                                    ");
        employeeDB.deleteEmployee(1);
        System.out.println("-------------------------After Removal of employee----------------");
        System.out.println("                                                                          ");
        for(Employee e:employeeDB.listAll()){
            System.out.println(e.getEmployeeDetails());
        }

    }
}
