package com.collections.p2.treeset.service;


import com.collections.p2.treeset.bean.Employee;
import com.collections.p2.treeset.bean.EmployeeDB;

public class EmployeeManagementTreeset {
    public static void main(String[] args) {
        EmployeeDB employeeDB=new EmployeeDB();

//        Employee emp1=new Employee(1,"Pooja","pooja@gmail.com",'F',8000);
//        Employee emp2=new Employee(2,"Rahul","rahul@gmail.com",'M',10000);
//        Employee emp3=new Employee(3,"Komal","komal@gmail.com",'F',8500);
//        Employee emp4=new Employee(4,"Arjun","arjun@yahoo.com",'M',9000);
//        Employee emp5=new Employee(5,"smita","smita@gmail.com",'F',10000);
//        Employee emp6=new Employee(6,"Kiran","kiran@hotmail.com",'M',11000);
//        Employee emp7=new Employee(7,"Rushi","rushi@gmail.com",'M',12000);

        Employee emp1=new Employee(103,"Pooja","pooja@gmail.com",'F',8000);
        Employee emp2=new Employee(102,"Rahul","rahul@gmail.com",'M',10000);
        Employee emp3=new Employee(106,"Komal","komal@gmail.com",'F',8500);
        Employee emp4=new Employee(104,"Arjun","arjun@yahoo.com",'M',9000);
        Employee emp5=new Employee(108,"smita","smita@gmail.com",'F',10000);
        Employee emp6=new Employee(106,"Kiran","kiran@hotmail.com",'M',11000);
        Employee emp7=new Employee(107,"Rushi","rushi@gmail.com",'M',12000);

        employeeDB.addEmployee(emp1);
        employeeDB.addEmployee(emp2);
        employeeDB.addEmployee(emp3);
        employeeDB.addEmployee(emp4);
        employeeDB.addEmployee(emp5);
        employeeDB.addEmployee(emp6);
        employeeDB.addEmployee(emp7);

        System.out.println("------------------------------List of all employee-----------------------------");
        for (Employee e: employeeDB.listAll()){
            System.out.println(e.getEmployeeDetails());
        }
        //System.out.println("---------------------------Remove an employee---------------------");
        employeeDB.deleteEmployee(1);
        System.out.println("------------------------------List of employee after removal-----------------------------");
        for (Employee e: employeeDB.listAll()){
            System.out.println(e.getEmployeeDetails());
        }

        System.out.println("------------------------------Showing Payslip-----------------------------");
        System.out.println(employeeDB.showPayslip(7));
    }
}
