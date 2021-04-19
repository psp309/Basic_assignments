package com.assignment;
/*
* Write a program to print even numbers between 23 and 57, each number should be
* printed in a separate row.
*
* step1: using for loop
* step2: Print the even number between 23 & 57
*
* */
public class EvenNumber23_57_11 {
    public static void main(String[] args) {
      for(int i=23;i<=57;i++){
          if(i%2==0){
              System.out.println(i);
          }
      }
    }
}
