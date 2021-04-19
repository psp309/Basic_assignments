package com.collections.p1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenNumberMain {
    public static void main(String[] args) {
        EvenNumberArraylist evenNumber= new EvenNumberArraylist();
        //System.out.println(evenNumber.saveEvenNumbers(30));
        List<Integer> b1;
        List<Integer> b2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number till which you want to calculate even numbers in list");
        int num=sc.nextInt();
        System.out.println("----------------------List of even numbers in Arraylist-1----------------");
        b1=evenNumber.saveEvenNumbers(num);
        //b1=evenNumber.saveEvenNumbers(30);
        System.out.println(b1);
        System.out.println("----------------------List of even nos *2 in Arraylist-2 ----------------");
        b2=evenNumber.printEvenNumbers(b1);
        System.out.println(b2);

        System.out.println("----------------checking the whether the num is present List-1 ----------------------");
        System.out.println("Enter the number whose existence you need to check in list-1");
        int checkNum=sc.nextInt();
        //System.out.println(evenNumber.printEvenNumber(9));
        System.out.println(evenNumber.printEvenNumber(checkNum));
    }
}
