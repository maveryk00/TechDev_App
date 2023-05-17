package com.techdevs;


import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        ResultSet resultSet = DatabaseConnection.getAllTable("person");
        while (resultSet.next()){
            String name = resultSet.getString(1);
            String lastName = resultSet.getString(2);

            System.out.println(name + " " + lastName);
        }
    }
}