/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse53.stm.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Yashitha Nadiranga
 */
public class DBConnection {
    private static DBConnection dBConnection;
    private Connection connection;

    private DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "1234");
    }
    
    public static DBConnection getInstance() throws ClassNotFoundException, SQLException{
        return (dBConnection == null) ? (dBConnection = new DBConnection()) : dBConnection;
    }
    
    public Connection getConnection(){
        return connection;
    }
}