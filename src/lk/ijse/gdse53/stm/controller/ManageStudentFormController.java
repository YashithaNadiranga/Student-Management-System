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
public class ManageStudentFormController {

    public Student loadAll(String ssid) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rs = connection.prepareStatement("Select * from student where sid ='"+ssid+"'").executeQuery();
        Student s1 = new Student();
        if (rs.next()) {            
            s1.setSid(rs.getString(1));
            s1.setName(rs.getString(2));
            s1.setDob(rs.getString(3));
            s1.setAge(Integer.parseInt(rs.getString(4)));
            s1.setNic(rs.getString(5));
            s1.setTel1(rs.getString(6));
            s1.setTel2(rs.getString(7));
            s1.setAddress(rs.getString(8));
            
        }
        return s1;
        
        
       
    }

    public boolean deleteStudent(String ssid) throws ClassNotFoundException, SQLException {
       Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pst = connection.prepareStatement("Delete from student where sid ='"+ssid+"'" );
        return pst.executeUpdate()>0;
        
    }

    public boolean updateStudent(Student s1) throws ClassNotFoundException, SQLException {
       Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pst = connection.prepareStatement("Update student set name =? ,dob =?,age =?,nic =?,tel1=?,tel2=?,address=? where sid = ?");
        pst.setString(1, s1.getName());
        pst.setString(2, s1.getDob());
        pst.setString(3, String.valueOf(s1.getAge()));
        pst.setString(4, s1.getNic());
        pst.setString(5, s1.getTel1());
        pst.setString(6, s1.getTel2());
        pst.setString(7, s1.getAddress());
        pst.setString(8, s1.getSid());
        
        return pst.executeUpdate() >0;
    }

}
