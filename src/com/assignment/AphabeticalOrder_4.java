package com.assignment;
/*
*
* Initialize two character variables in a program and display the characters in alphabetical
* order. Eg1) if first character is s and second is e O/P: e,s Eg2) if first character is a and
* second is e O/P:a,e
*
* step 1: Initialize the two character variables
* step 2: compare using if statement
* step 3:Print the alphabets in proper order.
*
* */
public class AphabeticalOrder_4 {
    public static void main(String[] args) {
        char x='t';
        char y='e';

        if(x<y){
            System.out.println(x+","+y);
        }else{
            System.out.println(y+","+x);
        }

    }

}
