package com.assignment;
/*
* Write a program to add all the values in a given number and print. Ex: 1234->10
*
* Step1: Initialize the number
* step2: In a for loop check the condition
* step3: print the addition of digits in a number
*
* */
public class AddDigitsInNumber_15 {
    public static void main(String[] args) {
        int sum=0;
        int number=2345;
        System.out.print(number+" => ");

        for(;number!=0;){
            sum += number%10;
            number=number/10;
        }
//        while(number!=0){
//            sum += number%10;
//            number=number/10;
//        }
        System.out.print(sum);

    }
}
