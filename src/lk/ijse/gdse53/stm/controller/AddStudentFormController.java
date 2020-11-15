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
import lk.ijse.gdse53.stm.model.Student;

/**
 *
 * @author Yashitha Nadiranga
 */
public class AddStudentFormController {

    public boolean uploadStudentDetails(Student s1) throws ClassNotFoundException, SQLException {
        Connection connection =  DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("INSERT INTO student VALUES(?,?,?,?,?,?,?,?)");
        stm.setString(1, s1.getSid());
        stm.setString(2, s1.getName());
        stm.setString(3, s1.getDob());
        stm.setString(4, String.valueOf(s1.getAge()));
        stm.setString(5, s1.getNic());
        stm.setString(6, s1.getTel1());
        stm.setString(7, s1.getTel2());
        stm.setString(8, s1.getAddress());
       
        return stm.executeUpdate()>0;
        
        
    }

    public String getSid() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("SELECT sid FROM student ORDER BY sid DESC LIMIT 1").executeQuery();
        
        if(rst.next()){
            return rst.getString(1);
        }else{
            return "000";
        }
    }
    
}
