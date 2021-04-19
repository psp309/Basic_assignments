package com.checked_exception;

import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingWritingFile {
    public static void main(String[] args) {
        //User defined data
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
        String data= sc.nextLine();
        byte[] buf=data.getBytes();
        //Writing the above data to file
        try {
            FileOutputStream fout=new FileOutputStream("C:/Users/HP/Desktop/error/data.txt");
            for(byte b:buf){
                fout.write(b);
            }
        fout.flush();
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("File not found "+e.getMessage());
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Generic Exception IOexception "+e.getMessage());
        }
        //Read above file --------not working
        System.out.println("-------Reading file----------");

        try {
            FileInputStream fin=new FileInputStream("C:/Users/HP/Desktop/error/data.txt");
            while(sc.hasNext()){
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
           // e.printStackTrace();
            System.out.println("File not found "+e.getMessage());
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Generic Exception IOexception "+e.getMessage());
        }


    }
}
