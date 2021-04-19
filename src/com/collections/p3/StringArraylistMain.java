package com.collections.p3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
*Create an ArrayList which will be able to store only Strings. Create a printAll method
which will print all the elements using an Iterator.
* */

public class StringArraylistMain {
    public static void main(String[] args) {
        StringsArraylist sArray=new StringsArraylist();
        List<String> names=new ArrayList<>();
//        names.add("Pooja is from Jalna");
//        names.add("Rahul is from Ahmednagar");
//        names.add("Arjun is from Kolhapur");
        Scanner sc= new Scanner(System.in);
        char ch;
        do {
            System.out.println("Enter the string to be added to arraylist");
            String n = sc.next();
            names.add(n);
            System.out.println("Do you want to continue? if yes Press Y/y ");
            ch=sc.next().charAt(0);
        }while(ch=='y'||ch=='Y');

        System.out.println("--------------Displaying Strings------------------");
        sArray.printAll(names);

    }
}
