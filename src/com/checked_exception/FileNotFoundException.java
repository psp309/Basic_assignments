package com.checked_exception;

import java.io.FileReader;

public class FileNotFoundException {
    public static void main(String[] args) {
        try {
            FileReader fr= new FileReader("C:/Users/HP/Desktop/error/data.txt");
        } catch (java.io.FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("File is not available to specified location "+e.getMessage());
        }
    }
}
