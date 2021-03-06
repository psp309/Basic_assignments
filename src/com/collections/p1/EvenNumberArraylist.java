package com.collections.p1;
/*
 Develop a java class with a method saveEvenNumbers(int N) using ArrayList to store
even numbers from 2 to N, where N is a integer which is passed as a parameter to the
method saveEvenNumbers().
The method should return the ArrayList (A1) created. In the same class create a method
printEvenNumbers()which iterates through the arrayList A1 in step 1, and It should
multiply each number with 2 and display it in format 4,8,12ā¦.2*N. and add these
numbers in a new ArrayList (A2). The new ArrayList (A2) created needs to be returned.
Create a method printEvenNumber(int N) parameter is a number N. This method should
search the arrayList (A1) for the existence of the number āNā passed. If exists it should
return the Number else return zero.Hint: Use instance variable for storing the ArrayList
A1 and A2. NOTE: You can test the methods using a main method.

* */
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
