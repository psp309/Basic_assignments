package com.assignment;

import java.util.Scanner;

/*
* Write a Java program to find if the given number is palindrome or not
*
* step1:
* step2:
* step3:
*
* while loop
* */
public class PalindromeNumber_18 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to check if it is Palindrome");
        int number=sc.nextInt();
        if (getPalindromeNumber(number) == 2)
            System.out.println(number + " is a palindrome");
        else
            System.out.println(number + "is not a palindrome");
    }

    private static int getPalindromeNumber(int input1) {

        String numberStr = String.valueOf(input1);

        int digitCount = numberStr.length();

        boolean isPalindrome = true;

        int range = digitCount / 2;

        if (digitCount % 2 == 0)
            range--;

        for (int i = 0; i <= range; i++) {
            if (numberStr.charAt(i) != numberStr.charAt(digitCount - i - 1))
                isPalindrome = false;
        }

        if (isPalindrome == true)
            return 2;
        else
            return 1;
    }

}
