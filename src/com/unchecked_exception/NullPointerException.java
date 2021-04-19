package com.unchecked_exception;
import java.lang.Throwable;

public class NullPointerException extends Throwable {
    public static void main(String[] args) {
        String name=null;
        try {
            if (name.equals("pooja")) {
                System.out.println("Its my name");
            } else {
                System.out.println("Someone else name");
            }
        }catch (java.lang.NullPointerException e) {
            System.out.println("NullPointerException has occurred due to null string "+ e.getMessage());
        }
    }
}
