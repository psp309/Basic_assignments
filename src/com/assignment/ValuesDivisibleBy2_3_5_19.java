package com.assignment;
/*
* Write a program to print first 5 values which are divisible by 2, 3, and 5.
*
* step1: Initialize counter variable and  the number to 0
* step2: In while loop check the condition for count to not exceed 5
* step3: In if statement within while loop check for divisibility by 2,3,5 & print values
*
* while loop
* */
public class ValuesDivisibleBy2_3_5_19 {
    public static void main(String[] args) {
        int count=0,num=0;
        while(count!=5){
            num++;
            if(num%2==0 && num%3==0 && num%5==0){
                count++;
                System.out.println(num);
            }
        }

    }
}
