package com.assignment;

import java.util.Scanner;

/*
*
* Write a program to print * in Floyds format (using for and while loop)*
*      *
*     * *
*    * * *
*   * * * *
*
* Step1: Enter the integer i.e the number of rows
* step2: We require two for loops the first one to get number of rows and second one to print number of * in a particular row
* step3: Print the '*'
* step3:
* */
public class PatternForLoop_16 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number od rows");
        int row=sc.nextInt();

        for(int i=0;i<row;i++){
            for(int j=0;j<=i;j++){
                System.out.print("\t"+"*"+" ");
            }
            System.out.println(" ");
        }
    }
}
