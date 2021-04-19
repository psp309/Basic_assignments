package com.assignment;
/*
* Initialize a character variable in a program and if the value is alphabet then print
* "Alphabet" if it’s a number then print "Digit" and for other characters print "Special Character"
*
* step1: Initialize the character with alphabet or digit or special character
* step2: Compare the character in if statement to check for ascii codes for alphabets or digits
* step3: Print the "Alphabet" or "Digit" or "Special Character" as per the value.
*
*
* */
public class DigitAlphabetSpecial_5 {
    public static void main(String[] args) {

        char ch='$';

        if(ch>=65 && ch<=90 || ch>=97 && ch<=122){
            System.out.println("Alphabet");
        }else if(ch>=48 && ch<=57){
            System.out.println("Digit");
        }else{
            System.out.println("Special Character");
        }

    }
}
