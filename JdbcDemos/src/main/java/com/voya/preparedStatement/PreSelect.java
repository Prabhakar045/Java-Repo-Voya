package com.voya.preparedStatement;

import com.mysql.cj.protocol.Resultset;

import java.sql.*;
import java.util.Scanner;

public class PreSelect {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String username = "root";
        String password = "root";

        String sql = "select * from cab where cab_drop_location=?";
        try (
                Connection connection = DriverManager.getConnection(url, username, password);
                PreparedStatement preparedStatement = connection.prepareStatement(sql);

                Scanner sc = new Scanner(System.in);
        ){

            preparedStatement.setString(1, "cabNumber");

            ResultSet resultSet= preparedStatement.executeQuery(sql);
            System.out.println(resultSet);

            while(resultSet.next()){
                int cabNumber = resultSet.getInt("cab_number");
                String pickupLocation = resultSet.getString("cab_pickup_location");

                String dropupLocation = resultSet.getString("cab_pickup_location");

            }

                for (int i = 0; i < 4; i++) {
                    int cabNumber = sc.nextInt();
                    sc.nextLine();
                    String pickupLocation = sc.nextLine();
                    String dropLocation = sc.nextLine();
                    String time = sc.nextLine();
                    String date = sc.nextLine();

                    //assign values
                    preparedStatement.setInt(1, cabNumber);
                    preparedStatement.setString(2, pickupLocation);
                    preparedStatement.setString(3, dropLocation);
                    preparedStatement.setString(4, time);
                    preparedStatement.setString(5, date);


                boolean result = preparedStatement.execute(sql);
                System.out.println(result);


            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }}
