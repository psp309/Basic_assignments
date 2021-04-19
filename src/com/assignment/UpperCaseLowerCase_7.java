package com.assignment;
/*
*
* Write a program to convert from upper case to lower case and vice versa of an alphabet
* and print the old character and new character as shown in example (Ex: a->A, M->m).
*
* Step1: Accept the character from user
* step2: Convert the character from upper case to lower case or vice versa by checking the character in if statement
* step3: Print the character in its original form and converted form
*
*
* */
public class UpperCaseLowerCase_7 {
    public static void main(String[] args) {
        char ch='P';
        if(Character.isLowerCase(ch)){
            System.out.println(ch+" -> "+Character.toUpperCase(ch));
        }else{
            System.out.println(ch+" -> "+Character.toLowerCase(ch));
        }
    }

}
