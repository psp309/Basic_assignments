package com.assignment;

import java.util.Scanner;

/*
* Write a program to accept gender ("Male" or "Female") and age (1-120) from command
* line arguments and print the percentage of interest based on the given conditions.
* Interest == 8.2% Gender ==> Female Age ==>1 to 58
* Interest == 7.6% Gender ==>Female Age ==>59 -120
* Interest == 9.2% Gender ==> Male Age ==>1-60
* Interest == 8.3% Gender ==> Male Age ==>61-120
*
* step1: Accept the gender and age from user
* step2: Compare the gender and age in if statements.
* step3: Print the Interest as per the gender and age user entered.
*
* */
public class GenderProgram_6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the gender of person");
        String gender=sc.nextLine();
        System.out.println("Enter the age of person");
        int age=sc.nextInt();
        if(gender.equalsIgnoreCase("male")||gender.equalsIgnoreCase("female")){
            //System.out.println("Go ahead!!");
            if(gender.equalsIgnoreCase("female")){
                if(age>=1&&age<=58){
                    System.out.println("Interest = 8.2%");
                }else if(age>=59 && age<=120){
                    System.out.println("Interest = 7.6%");
                }else{
                    System.out.println("Invalid age entered for female\n Enter age between 1-120");
                }
            }else{
                if(age>=1&&age<=60){
                    System.out.println("Interest = 9.2%");
                }else if(age>=61 && age<=120){
                    System.out.println("Interest = 8.3%");
                }else{
                    System.out.println("Invalid age entered for female\n Enter age between 1-120");
                }
            }
        }else{
            System.out.println("Invalid gender! enter gender as male or female");
        }

    }
}
