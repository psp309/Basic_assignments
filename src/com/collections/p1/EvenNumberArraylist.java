package com.collections.p1;

//import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EvenNumberArraylist {
    List<Integer> a1 =new ArrayList<>();
    List<Integer> a2 =new ArrayList<>();
    public List<Integer> saveEvenNumbers(int n){

        for(int i=1;i<=n;i++){
            if(i%2==0){
                a1.add(i);
            }
        }
        return a1;
    }
    public List<Integer>printEvenNumbers(List<Integer> a){
        Iterator<Integer>it=a.iterator();
        while (it.hasNext()){
            Integer eachNum=it.next();
           // Integer multiplyNum=eachNum*2;
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
