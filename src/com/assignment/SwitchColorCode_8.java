package com.assignment;

import java.util.Scanner;

/*
*
* Write a program to print the color name, based on color code. If color code in not valid
* then print "Invalid Code". R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White.
*
* Step1: Accept the color code from user
* Step2: With Switch statement check the color code
* Step3: According to tje color code print the color
*
* */
public class SwitchColorCode_8 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the following Codes \nR->Red, B->Blue, G->Green, O->Orange, Y->Yellow,W->White");
        String ch = sc.next().toUpperCase();
        switch(ch){
            case "R":
                System.out.println("Red");
                break;
            case "B":
                System.out.println("Blue");
                break;
            case "G":
                System.out.println("Green");
                break;
            case "O":
                System.out.println("Orange");
                break;
            case "Y":
                System.out.println("Yellow");
                break;
            case "W":
                System.out.println("White");
                break;
            default:
                System.out.println("Invalid code");

        }
    }
}
