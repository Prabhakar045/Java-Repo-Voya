package org.doctor.model.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DoctorDb {
    static  Connection connection;


    public static Connection openConnection(){
        String url="jdbc:mysql://localhost:3306/voyatraining";
        String username="root";
        String password="root";


        try {
            connection = DriverManager.getConnection(url,username,password);

            System.out.println("connected to database");

        } catch (
                SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }
}
