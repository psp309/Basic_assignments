package com.assignment;
/*
* Write a program to check if the program has received command line arguments or not.
* If the program has not received the values then print "No Values", else print all the
* values in a single line separated by ,(comma). Eg1) java Example O/P: No values Eg2)
* java Example Mumbai Bangalore O/P: Mumbai,Bangalore [Note: You can use length
* property of an array to check its length
*
* step 1:check in if statement is the command line argument is entered.
* step 2: If yes print values separated by ',' or print "No Values"
*
* */

public class CommandArgument_3 {
    public static void main(String[] args) {

        if(args.length==0){
            System.out.println("No values");
        }else{
            for(int i=0;i<args.length;i++){
                System.out.print(args[i]);
                if(i< args.length-1){
                    System.out.print(",");
                }

            }
        }
    }
}
