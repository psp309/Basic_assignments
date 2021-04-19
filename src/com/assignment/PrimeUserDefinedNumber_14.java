package com.assignment;

import java.util.Scanner;

/*
* Write a Java program to find if the given number is prime or not.
*
* step1: Accept number from user with Scanner class
* step2: check if the number is prime number using for-loop amd if statement
* step3: print if the number is prime or not
* */
public class PrimeUserDefinedNumber_14 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Please enter an integer number");
        int num= sc.nextInt();
        primeNumber(num);
    }
    public static void primeNumber(int n) {
        boolean isPrime = true;
        if (n < 0) {
            n *= -1;
            primeNumber(n);
        } else if (n == 0 || n == 1) {
            System.out.println(n + "  is neither prime nor composite");
        } else {
            for (int i = 2; i < n / 2 + 1; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(n + " is prime");
            } else {
                System.out.println(n + " is not prime");
            }
        }
    }
}
