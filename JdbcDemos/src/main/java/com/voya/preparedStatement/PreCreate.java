package com.voya.preparedStatement;

import java.sql.*;

public class PreCreate {

    public static void main(String[] args) {

        String url="jdbc:mysql://localhost:3306/voyatraining";
        String username="root";
        String password="root";

        Connection connection = null;
        PreparedStatement preparedStatement=null;
        String sql = "create table cab(cab_number int primary key, cab_pickup_location varchar(5), cab_drop_location varchar(50),pickup_time varchar(10), pickup_date varchar(10))";
        try {
            connection = DriverManager.getConnection(url,username,password);
            preparedStatement  = connection.prepareStatement(sql);


            boolean result= preparedStatement.execute(sql);
            System.out.println(result);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }



    }
}
