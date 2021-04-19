package com.assignment;
/*
* Write a program to check if a given number is prime or not
*
* Step1: Initialize a variable with a number
* step2: If statement checks if number is negative then converts into positive number and recursively call prime number
* step3: other if statement checks if number is 0 or 1
* step3: Using for loop check if number is prime or not
*
* */
public class Prime_GiveNumber_12 {
    public static void main(String[] args) {
        Prime_GiveNumber_12 p=new Prime_GiveNumber_12();
        p.primeNumber(-7);
    }
    public void primeNumber(int num){
        boolean isPrime=true;
        if(num<0){
            num *=-1;
            primeNumber(num);
        }else if(num==0||num==1){
            System.out.println(num+"  is neither prime nor composite");
        }else{
            for(int i=2;i<num/2+1;i++){
                if(num%i==0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(num+" is prime");
            }else{
                System.out.println(num+" is not prime");
            }
        }
    }
}
