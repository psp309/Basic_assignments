package com.checked_exception;
//class Test{
//    private Test(){
//    }
//}

abstract class Test{
    public Test(){}
}
public class IllegalAccessException {
    public static void main(String[] args) {
        try {
            Test t= Test.class.newInstance();

        } catch (InstantiationException e) {
            //e.printStackTrace();
            System.out.println("As abstract class cannot be instantiated "+e.getMessage());
        } catch (java.lang.IllegalAccessException e) {
            //e.printStackTrace();
            System.out.println("You are trying to create instance of a class having private constructor  "+e.getMessage());
        }

    }
}
