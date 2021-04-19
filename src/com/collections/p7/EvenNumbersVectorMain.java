package com.collections.p7;

import java.util.List;
import java.util.Scanner;

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
