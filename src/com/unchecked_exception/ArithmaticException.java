package com.unchecked_exception;

public class ArithmaticException {
    public static void main(String[] args) {
        int a=10;
        try {
            int div = a / 0;
            System.out.println(div);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic exception caught is: "+e.getMessage());
        }
    }
}
