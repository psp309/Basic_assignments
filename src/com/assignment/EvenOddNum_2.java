package com.assignment;

import java.util.Scanner;

/*
*   Write a program to check if a given number is odd or even
*
* 1. Accept the number from user
* 2. Check for even and odd conditions in if statement
* 3. Print whether the number is even or odd
*
* */
public class EvenOddNum_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number to determine if it's odd or even");
        int num=sc.nextInt();

        if(num%2==0){
            System.out.println(num+" is an even number");
        }else{
            System.out.println(num+" is odd number");
        }
    }
}
