package com.collections.p6;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EvenNumbersMain {
    public static void main(String[] args) {
        EvenNumbersLinkedlist evenNumbersLinkedlist=new EvenNumbersLinkedlist();
        List<Integer> b1 = new LinkedList<>();
        List<Integer> b2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number,till the point you want to find even numbers");
        int num=sc.nextInt();
        System.out.println("----------------------------List of even number in linkedlist-1--------------------------");
        b1=evenNumbersLinkedlist.saveEvenNumbers(num);
        System.out.println(b1);
        System.out.println("-----------------------------List of even number*2 in linkedlist-2--------------------------");
        b2=evenNumbersLinkedlist.printEvenNumbers(b1);
        System.out.println(b2);
        System.out.println("------------------------------Check if number exist in linkedlist-1----------------------");
        System.out.println("Enter the number to check if that exist in linkedlist-1");
        int numExist=sc.nextInt();
        System.out.println(evenNumbersLinkedlist.printEvenNumber(numExist));

    }
}
