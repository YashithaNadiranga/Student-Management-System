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
import lk.ijse.gdse53.stm.model.Course;

/**
 *
 * @author Yashitha Nadiranga
 */
public class CourseFormController {

    public int getCount() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("select count(*) from course").executeQuery();
        if(rst.next()){
            return rst.getInt(1);
        }else{
            return 0;
        }
    }

    public List<Course> loadTable() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("select * from course").executeQuery();
        List<Course> templist = new ArrayList();
        while (rst.next()) {            
            templist.add(new Course(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3)
            ));
                    
        }
        return templist;
    }

    public boolean uploadCourse(Course c1) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pst = connection.prepareStatement("insert into course values (?,?,?)");
        pst.setString(1, c1.getCid());
        pst.setString(2, c1.getCname());
        pst.setString(3, c1.getCfee());
        
        return pst.executeUpdate()>0;
    }

    public boolean updateCourse(Course c2) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pst = connection.prepareStatement("update course set cname=? , cfee =? where cid = ?"); 
        pst.setString(1, c2.getCname());
        pst.setString(2, c2.getCfee());
        pst.setString(3, c2.getCid());
        return pst.executeUpdate()>0;
    }

    public boolean deleteCourse(String cid) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pst = connection.prepareStatement("delete from course where cid = ?"); 
        pst.setString(1, cid);
        return pst.executeUpdate()>0;
    }

    public ResultSet checkCid() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("select cid from course").executeQuery();
        return rst;
    }
    
}
