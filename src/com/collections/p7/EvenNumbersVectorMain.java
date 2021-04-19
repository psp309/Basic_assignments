package com.collections.p7;

import java.util.List;
import java.util.Scanner;
/*
*
* Implement the assignment 1 using Vector
*
* Develop a java class with a method saveEvenNumbers(int N) using ArrayList to store
even numbers from 2 to N, where N is a integer which is passed as a parameter to the
method saveEvenNumbers().
The method should return the ArrayList (A1) created. In the same class create a method
printEvenNumbers()which iterates through the arrayList A1 in step 1, and It should
multiply each number with 2 and display it in format 4,8,12….2*N. and add these
numbers in a new ArrayList (A2). The new ArrayList (A2) created needs to be returned.
Create a method printEvenNumber(int N) parameter is a number N. This method should
search the arrayList (A1) for the existence of the number ‘N’ passed. If exists it should
return the Number else return zero.Hint: Use instance variable for storing the ArrayList
A1 and A2. NOTE: You can test the methods using a main method.
*
* */
public class EvenNumbersVectorMain {
    public static void main(String[] args) {
        EvenNumbersVector evenNumbersVector=new EvenNumbersVector();
        List<Integer> b1;
        List<Integer> b2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number,till the point you want to find even numbers");
        int num=sc.nextInt();
        System.out.println("----------------------------List of even number in Vector-1--------------------------");
        b1=evenNumbersVector.saveEvenNumbers(num);
        System.out.println(b1);
        System.out.println("-----------------------------List of even number*2 in Vector-2--------------------------");
        b2=evenNumbersVector.printEvenNumbers(b1);
        System.out.println(b2);
        System.out.println("------------------------------Check if number exist in vector-1----------------------");
        System.out.println("Enter the number to check if that exist in vector-1");
        int numExist=sc.nextInt();
        System.out.println(evenNumbersVector.printEvenNumber(numExist));

    }
}
