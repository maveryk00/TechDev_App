package com.techdevs;

import java.sql.*;

public class DatabaseConnection {

    static private DatabaseConnection instance;


    static private DatabaseConnection getInstance() {
        if (instance == null)
            instance = new DatabaseConnection();

        return instance;
    }


    static public void Close() {
        getInstance().dispose();
    }

    static public ResultSet getAllTable(String table) {
        return getInstance().selecTable(table);
    }


    private Connection connection;
    private Statement statement;
    private PreparedStatement preparedStatement;

    private DatabaseConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String host = "localhost";
            String port = "3306";
            String database = "techdev";
            String user = "root";
            String pass = "mysql";

            String stringConnection = "jdbc:mysql://" + host + ":" + port + "/" + database + "?user=" + user + "&password=" + pass;
            connection = DriverManager.getConnection(stringConnection);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }


    private ResultSet selecTable(String table) {
        try {
            statement = connection.createStatement();
            return statement.executeQuery(String.format("SELECT * FROM %s", table));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void dispose(){
        try {
            statement.close();
            connection.close();

            statement = null;
            connection = null;

            instance = null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
