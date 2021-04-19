package com.checked_exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ClassNotFound_SQLException {
    public static void main(String[] args) {
        Connection con=null;

        String driverName="com.mysql.jdbc.Driver";
        try {
            Class.forName(driverName);
            String url="http://localhost:3306/login_db";
            String username="root";
            String password="root";
            con= DriverManager.getConnection(url,username,password);
        } catch (ClassNotFoundException e) {
            //e.printStackTrace();
            System.out.println("Could not find the database driver"+e.getMessage());
        }
        catch (SQLException e) {
           // e.printStackTrace();
            System.out.println("unable to establish Connection"+e.getMessage());
        }
    }
}
