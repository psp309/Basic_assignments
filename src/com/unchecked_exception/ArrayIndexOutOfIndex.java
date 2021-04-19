package com.unchecked_exception;

public class ArrayIndexOutOfIndex {
    public static void main(String[] args) {
        int[] a= {1,2,3,4,5};
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.print(a[i]+"\t");
            }

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("");
            System.out.println("User is trying access 5th index which is causing ArrayIndexOutOfBound Exaception "+e.getMessage());
        }

    }
}
