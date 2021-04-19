package com.assignment;

import java.util.Scanner;

/*
* Write a program that displays a menu with options 1. Add 2. Sub Based on the options
chosen, read 2 numbers and perform the relevant operation. After performing the
operation, the program should ask the user if he wants to continue. If the user presses y
or Y, then the program should continue displaying the menu else the program should
terminate. [ Note: Use Scanner class, you can take help from the trainer regarding the
same ]
* do-while loop
*
* step1: Accept the option from user whether to perform addition or subtraction
* step2: In if statement check for the option and accordingly accept two numbers
* Step3: Perform addition or subtraction as per user choice and print the result
* step4: Finally check if the user wants to continue he is prompted to check if he/she wants to continue.
*
*
* */
public class UserMenu_20 {
    public static void main(String[] args) {
        double num1=0,num2=0,sum=0,sub=0;
        char ch;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter the number to perform desired operation\n1.Add\n2.Sub");
            int option=sc.nextInt();

            if (option == 1) {
                System.out.println("Enter first number");
                num1=sc.nextDouble();
                System.out.println("Enter first number");
                num2=sc.nextDouble();
                System.out.println("Additions of "+ num1 +" + "+ num2 +" ==> "+(num1+num2));
            } else if (option == 2) {
                System.out.println("Enter first number");
                num1=sc.nextDouble();
                System.out.println("Enter first number");
                num2=sc.nextDouble();
                System.out.println("Subtraction of "+ num1 +" - "+ num2 +" ==> "+ (num1-num2));
            } else {
                System.out.println("Invalid option\nPress option 1 or 2");
            }
            System.out.println("Press Y/y to continue or N/n for exiting");
            ch= sc.next().charAt(0);
        }while((ch=='y')||(ch=='Y'));
    }

}
