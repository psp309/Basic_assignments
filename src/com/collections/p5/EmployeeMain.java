package com.collections.p5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
/*
Create an ArrayList of Employee( id,name,address,sal) objects and search for particular
Employee object based on id number.
*
* */
public class EmployeeMain {
    public static void main(String[] args) {

        List<Employee> employeeList=new ArrayList<>();

        Employee emp1= new Employee(100,"Pooja","2nd Ave S",9000);
        Employee emp2= new Employee(101,"Komal","Discovery garden",10000);
        Employee emp3= new Employee(103,"Smita","Tirupati Plaza",11000);
        Employee emp4= new Employee(102,"Rushi","Tulsi Apartment",12000);
        Employee emp5= new Employee(105,"Rahul","5th St",15000);

        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);



        Iterator<Employee>it= employeeList.iterator();
        int searchKey=103;
        while(it.hasNext()){
            Employee eachEmp= it.next();
            if(eachEmp.getId()==searchKey){
                System.out.println(eachEmp);
            }
        }

    }
}
