package com.collections.p2.treeset.bean;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeDB {
    Set<Employee> empDBTree=new TreeSet<>();
    public boolean addEmployee(Employee e){
        return empDBTree.add(e);
    }
    public boolean deleteEmployee(int empId){
        boolean isDeleted=false;
        Iterator<Employee> it= empDBTree.iterator();
        while(it.hasNext()){
            Employee emp=it.next();
            if(emp.getEmpId()==empId){
                isDeleted=true;
                it.remove();
            }
        }
        return isDeleted;
    }
    public String showPayslip(int empId){
        String payslip="Invalid employee Id";
        for (Employee e:empDBTree){
            if(e.getEmpId()==empId){
                payslip="Payslip for employee with id "+empId+" is "+e.getEmpSalary();
            }
        }
        return payslip;
    }

//To convert set into an array

//    public Employee[] listAll(){
//        Employee[] empArray=new Employee[empDBTree.size()];
//
//        empArray = empDBTree.toArray();
//        for(int i=0;i<empDBTree.size();i++) {
//
//        }
//        return empArray;
//    }

    public Set<Employee> listAll() {
        return empDBTree;
    }
}
