package com.assignment;

import java.util.Scanner;

/*
* Write a program to reverse a given number and print Eg1) I/P: 1234 O/P:4321 Eg2)
* I/P:1004 O/P:4001
*
* step1 : Initialized or accept an user defined number to be reversed
* step2 : In while loop check the condition and find the remainder and qotient to further process it
* step3 :Print the reverse number
*
* while loop
*
* */
public class ReverseNumber_17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be reversed");
        int num=sc.nextInt();
        //int num=23567;
        System.out.println("Original number ==> "+num);
        System.out.print("Reverse number ==> ");
        while(num!=0){
            int remainder=num%10;
            System.out.print(remainder+"");
            num=num/10;
        }
    }
}
