package com.voya.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

    public static void main(String[] args) {

        String url="jdbc:mysql://localhost:3306/voyatraining";
        String username="root";
        String password="root";

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();

            String sql = "create table employee1(name varchar(20), employeeId int primary key,city varchar(30))";
            boolean result= statement.execute(sql);
            System.out.println(result);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



    }
}
