package com.collections.p2.arraylist.bean;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
* Create one more class EmployeeDB which has the following methods. i) boolean
* addEmployee(Employee e) ii) boolean deleteEmployee(int empId)
* iii) String showPaySlip(int empId) iv) Employee[] listAll()
*
* */

public class EmployeeDB {
//    List<Employee> empDb= new ArrayList<>();
//    public boolean addEmployee(Employee e){
//        return empDb.add(e);
//    }
//    public boolean deleteEmployee(int empId){
//        boolean isDeleted=false;
//        Iterator<Employee> it=empDb.iterator();
//        while(it.hasNext()){
//            Employee emp=it.next();
//            if(emp.getEmpId()==empId){
//                isDeleted=true;
//                it.remove();
//            }
//        }
//        return isDeleted;
//    }
//    public String showPaySlip(int empId){
//        String payslip="Invalid employee id";
//        for(Employee e:empDb){
//            if(e.getEmpId()==empId) {
//                payslip = "Payslip for employee with empID" + empId + " is " + e.getEmpSalary();
//            }
//        }
//        return payslip;
//    }
//    public Employee[] listAll(){
//        Employee[] empArray=new Employee[empDb.size()];
//        for(int i=0;i<empDb.size();i++){
//            empArray[i]=empDb.get(i);
//        }
//        return empArray;
//    }

    List<Employee> empDb=new ArrayList<>();
    public boolean addEmployee(Employee e){
        return empDb.add(e);
    }
    public boolean deleteEmployee(int empId){
        boolean isDeleted=false;
        Iterator<Employee> it= empDb.iterator();
        while(it.hasNext()){
            Employee emp=it.next();
            if(emp.getEmpId()==empId){
                isDeleted=true;
                it.remove();
            }
        }
        return isDeleted;
    }
    public String showPaySlip(int empId){
        String payslip="Invalid employeeId";
        for(Employee e:empDb){
            if(e.getEmpId()==empId){
                payslip="Payslip for employee with empID "+empId+" is "+e.getEmpSalary();
            }
        }
        return payslip;
    }
    public Employee[] listAll(){
        Employee[] empArray=new Employee[empDb.size()];
        for(int i=0;i<empDb.size();i++){
            empArray[i]=empDb.get(i);
        }
        return empArray;
    }
}
