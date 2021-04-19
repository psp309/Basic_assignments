package com.collections.p8;

public class Employee {
    private int id;
    private String name;
    private String address;
    private double sal;

    public Employee(int id, String name, String address, double sal) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getSal() {
        return sal;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", sal=" + sal +
                '}';
    }
}
