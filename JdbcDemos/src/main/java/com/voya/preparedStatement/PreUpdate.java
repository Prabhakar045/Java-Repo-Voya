package com.voya.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreUpdate {

    public static void main(String[] args) {

        String url="jdbc:mysql://localhost:3306/voyatraining";
        String username="root";
        String password="root";

        Connection connection = null;
        PreparedStatement preparedStatement=null;
        String sql = "insert into cab values(?,?,?,?,?)";
        try {
            connection = DriverManager.getConnection(url,username,password);
            preparedStatement  = connection.prepareStatement(sql);




            {

                Scanner sc = new Scanner(System.in);

                for(int i=0; i<4;i++){
                    int cabNumber = sc.nextInt();
                    sc.nextLine();
                    String pickupLocation = sc.nextLine();
                    String dropLocation = sc.nextLine();
                    String time = sc.nextLine();
                    String date = sc.nextLine();

                    //assign values
                    preparedStatement.setInt(1,cabNumber);
                    preparedStatement.setString(2,pickupLocation);
                    preparedStatement.setString(3,dropLocation);
                    preparedStatement.setString(4, time);
                    preparedStatement.setString(5, date);

                }
                boolean result= preparedStatement.execute(sql);
                System.out.println(result);


            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



    }
}
