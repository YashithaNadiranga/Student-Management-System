/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse53.stm.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import lk.ijse.gdse53.stm.db.DBConnection;
import lk.ijse.gdse53.stm.model.Login;

/**
 *
 * @author Yashitha Nadiranga
 */
public class LoginController {

    public ResultSet checkLogin(Login l) throws ClassNotFoundException, SQLException {
        Connection connection =DBConnection.getInstance().getConnection();
        PreparedStatement pst = connection.prepareStatement("select * from users where username =? AND password =?");
        pst.setString(1, l.getUsername());
        pst.setString(2, l.getPassword());
        ResultSet rs = pst.executeQuery();
        return rs;
        
    }

   
}
