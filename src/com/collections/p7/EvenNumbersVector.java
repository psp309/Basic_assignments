package com.collections.p7;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class EvenNumbersVector {

    List<Integer> a1=new Vector<>();
    List<Integer> a2=new Vector<>();

    public List<Integer> saveEvenNumbers(int n){
        for (int i=1;i<=n;i++){
            if(i%2==0){
                a1.add(i);
            }
        }
        return a1;
    }

    public List<Integer> printEvenNumbers(List<Integer>a){
        Iterator<Integer> it= a.iterator();
        while (it.hasNext()){
            Integer eachNum=it.next();
            a2.add(eachNum*2);
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
