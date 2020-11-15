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
import java.util.ArrayList;
import java.util.List;
import lk.ijse.gdse53.stm.db.DBConnection;
import lk.ijse.gdse53.stm.model.Student;

/**
 *
 * @author Yashitha Nadiranga
 */
public class ViewStudentFormController {

    public List<Student> getAllStudent() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("SELECT sid,name,tel1,address From Student").executeQuery();
        List<Student> templist = new ArrayList();
        while(rst.next()){
            templist.add(new Student(
                    rst.getString(1), 
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4)
                  
            ));
            
        }
        return templist;
    }


    public ResultSet getSearchSidStudent(String sidserch) throws SQLException, ClassNotFoundException {
       Connection connection = DBConnection.getInstance().getConnection();
       
        PreparedStatement pst = connection.prepareStatement("Select sid,name,tel1,address from student where sid Like '%"+sidserch+"%'");
        ResultSet rst = pst.executeQuery();      
        return rst;
    }
    
     public ResultSet getSearchNameStudent(String namesearch) throws SQLException, ClassNotFoundException {
       Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pst = connection.prepareStatement("Select sid,name,tel1,address from student where name Like '%"+namesearch+"%'");
        ResultSet rst = pst.executeQuery();      
        return rst;
    }
    
}
