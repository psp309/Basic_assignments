package com.assignment;
/*
* Write a program to print month in words, based on input month in numbers Example1:
*
* Step1: Accept user define number from 1-12 for each month
* step2: Using Switch statement try identify the month in case
* Step3: Print the month in words
*
* */

import java.util.Scanner;

public class SwitchMonthProgram_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number");
        int month = sc.nextInt();
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month");

        }
    }
}