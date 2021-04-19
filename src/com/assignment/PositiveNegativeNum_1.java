package com.assignment;

import java.util.Scanner;

/*
*  Write a program to check if a given number is Positive, Negative, or Zero.
*
* 1. Accept a number from user
* 2. check for the conditions for as the number is greater than or less than 0
* 3. Accordingly print whether it is positive,negative or zero.
*
* */
public class PositiveNegativeNum_1 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number either negative,positive or zero");
        int num=sc.nextInt();

        if(num>0){
            System.out.println(num+" is positive number");
        }
        else if(num<0){
            System.out.println(num+" is negative number");
        }else{
            System.out.println("Number is "+num);
        }
    }
}
