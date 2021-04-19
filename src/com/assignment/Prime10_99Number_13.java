package com.assignment;
/*
* Write a program to print prime numbers between 10 and 99.
*
* step1: write a method primeNumber to calculate prime number returning the boolean value
* step2: Accept the number from 10-99 in for-loop and compare if that isPrime
* step3: If isPrime=true then print the number
*
* */
public class Prime10_99Number_13 {
    public static void main(String[] args) {
        for(int number=10;number<99;number++){
            if(primeNumber(number)){
                System.out.print(number+"\t");
            }
        }

    }

    public static boolean primeNumber(int num) {
        boolean isPrime = true;
        if (num < 0) {
            num *= -1;
            primeNumber(num);
        } else if (num == 0 || num == 1) {
            System.out.println(num + "  is neither prime nor composite");
        } else {
            for (int i = 2; i < num / 2 + 1; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }

}
