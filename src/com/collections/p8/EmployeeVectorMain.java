package com.collections.p8;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;
/*
* Write a program that will have a Vector which is capable of storing emp objects. Use an
Iterator and enumeration to list all the elements of the Vector.
*
* */
public class EmployeeVectorMain {
    public static void main(String[] args) {
        List<Employee> employees=new Vector<>();

        employees.add(new Employee(101,"Smita","Tirupati Plaza",13000));
        employees.add(new Employee(104,"Pooja","2nd Ave s",10000));
        employees.add(new Employee(103,"Komal","Discovery garden",11000));
        employees.add(new Employee(102,"Rushi","Tulsi Apartment",12000));
        System.out.println("-------------Displaying employees in vector data-structure------------");
        Iterator<Employee>it=employees.iterator();
        while (it.hasNext()){
            Employee emp=it.next();
            System.out.println(emp);
        }
    }
}
