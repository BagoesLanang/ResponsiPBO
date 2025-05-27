package model;

import java.sql.*;

public class DBConnection {
    private static final String USER = "root";
    private static final String PASS = "";
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(USER, PASS);
    }
}
