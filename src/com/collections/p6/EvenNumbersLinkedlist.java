package com.collections.p6;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class EvenNumbersLinkedlist {

    List<Integer> a1= new LinkedList<>();
    List<Integer> a2=new LinkedList<>();

    public List<Integer> saveEvenNumbers(int n){
        for(int i=1;i<=n;i++){
            if(i%2==0){
                a1.add(i);
            }
        }
        return a1;
    }
    public List<Integer> printEvenNumbers(List<Integer> a){
        Iterator<Integer> it=a.iterator();
        while(it.hasNext()){
            Integer eachEvenNum=it.next();
            //int mulNum=eachEvenNum*2;
            a2.add(eachEvenNum*2);
        }

        return a2;
    }

    public int printEvenNumber(int n){
        if(a1.contains(n)){
            return n;
        }else{
            return 0;
        }
    }
}
