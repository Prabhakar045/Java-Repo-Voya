package com.voya.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTable {

    public static void main(String[] args) {

        String url="jdbc:mysql://localhost:3306/voyatraining";
        String username="root";
        String password="root";

        Connection connection = null;
        try {
            connection = DriverManager.getConnection("","root","root");
            Statement statement = connection.createStatement();

            String sql = "insert into employee values('pbk',1,'bengaluru')";
            boolean result= statement.execute(sql);
            System.out.println(result);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



    }
}
