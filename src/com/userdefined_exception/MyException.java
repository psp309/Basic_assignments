package com.userdefined_exception;

public class MyException extends Exception {

    int acc_bal=0;

    public String toString(){
        return "Debit not allowed,low account balance!!";
    }
    public void withdraw(int debitMoney) throws MyException {
        if(acc_bal>1000){
            acc_bal=acc_bal-debitMoney;
        }else {
            throw new MyException();
        }
    }
    public static void main(String[] args) {
        MyException exp=new MyException();
        try {
            exp.withdraw(100);
        } catch (MyException e) {
           // e.printStackTrace();
            System.out.println("Exception : "+e);
        }

    }
}

