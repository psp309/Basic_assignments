package com.collections.p4;


import java.util.ArrayList;
import java.util.List;
/*
* Create an ArrayList which will be able to store only numbers like int,float,double,etc, but
not any other data type.
* */
class ArrayListIntFloatDoubleElements<O> extends ArrayList<O> {
    @Override
    public boolean add(O o) {
        if(o instanceof Integer||o instanceof Float||o instanceof Double){
            super.add(o);
            return true;
        }else{
            throw new ClassCastException("Only int,float and double values can be added to the arraylist");
        }
    }

    public static void main(String[] args) {
        List<Object> elements=new ArrayListIntFloatDoubleElements<>();

      try {
          elements.add(1);
          elements.add(1.34F);
          elements.add(34.673898299D);
          elements.add("Pooja");
      }catch(Exception e){
          e.printStackTrace();
      }


    }

}
