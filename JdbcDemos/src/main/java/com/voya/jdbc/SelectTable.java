package com.voya.jdbc;

import java.sql.*;

public class SelectTable {
    public static void main(String[] args) {

        String url="jdbc:mysql://localhost:3306/voyatraining";
        String username="root";
        String password="root";

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();

            String sql = "select * from employee";
            ResultSet resultSet= statement.executeQuery(sql);
            System.out.println(resultSet);

            while(resultSet.next()){
                String name = resultSet.getString("name");
                int employeeId = resultSet.getInt("employeeId");
                String city = resultSet.getString("city");

                System.out.println(name+" "+employeeId+" "+city);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



    }
}
