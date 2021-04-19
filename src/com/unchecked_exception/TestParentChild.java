package com.unchecked_exception;
class Parent{
    String pname;
    Parent(String name){
        pname=name;
    }
    void display(){
        System.out.println(pname);
    }
}
class Child extends Parent{
    String cname;
    Child(String nm){
        super(nm);
        cname=nm;
    }
    void display(){
        System.out.println(cname);
    }
}
public class TestParentChild {
    public static void main(String[] args) {
        Parent p1=new Parent("Homo-Sapien");
        Child c1= new Child("Human");
        p1 = c1;
        p1.display();
    try {
        Parent p2 = new Parent("Shiv");
        Child c2 = (Child) p2;
    }catch(ClassCastException e){
        System.out.println("The Parent object class can't be casted to child class type ");
    }
    }
}
