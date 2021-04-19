package com.collections.p3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringsArraylist {
    List<String> name=new ArrayList<>();

    public void printAll(List<String >n){
        Iterator<String>it=n.listIterator();
        while(it.hasNext()){
            String eachString= it.next();
            System.out.println(eachString);
        }
    }


}
