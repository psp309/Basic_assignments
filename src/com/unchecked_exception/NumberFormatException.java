package com.unchecked_exception;

public class NumberFormatException {
    private static String input="123.456$";
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(input);
        }catch(java.lang.NumberFormatException e){
            System.out.println("Invalid string argument");
        }
    }
}
