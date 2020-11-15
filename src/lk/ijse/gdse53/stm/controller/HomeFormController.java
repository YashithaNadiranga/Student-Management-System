/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse53.stm.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import lk.ijse.gdse53.stm.db.DBConnection;

/**
 *
 * @author Yashitha Nadiranga
 */
public class HomeFormController {

    public int getAllStudent() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("Select count(*) from student").executeQuery();
        
        if(rst.next()){
            return rst.getInt(1);
        }else{
            return 0;
        }
        
        
    }

    public String getexamCount() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("select count(*) from examshedule where date = curdate()").executeQuery();
        if(rst.next()){
            return rst.getString(1);
        }else{
            return "0";
        }
    }

    public String getAttendanceCount() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("select count(*) from attendance where date = curdate()").executeQuery();
        if(rst.next()){
            return rst.getString(1);
        }else{
            return "0";
        }
    }
    
}
