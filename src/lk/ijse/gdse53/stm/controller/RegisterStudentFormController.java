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
import lk.ijse.gdse53.stm.model.Registration;

/**
 *
 * @author Yashitha Nadiranga
 */
public class RegisterStudentFormController {

    public String getsid() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("Select sid from student order by sid desc limit 1").executeQuery();

        if (rst.next()) {
            return rst.getString(1);

        } else {
            return "001";
        }
    }

    public String getRid() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rs = connection.prepareStatement("select rid from reg_detail order by rid desc limit 1").executeQuery();
        if (rs.next()) {
            return rs.getString(1);
        } else {
            return "000";
        }
    }

    public boolean uploadRegDetail(Registration r1) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("INSERT INTO reg_detail VALUES (?,?,?,?,?)");
        stm.setString(1, r1.getRid());
        stm.setString(2, r1.getBid());
        stm.setString(3, r1.getSid());
        stm.setString(4, r1.getRfee());
        stm.setString(5, r1.getRegdate());

        return stm.executeUpdate() > 0;
    }

    public String isContain(String r) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pst = connection.prepareStatement("select sid from reg_detail where sid = '" + r + "'");
        ResultSet rst = pst.executeQuery();
        if (rst.next()) {
            return rst.getString(1);
        } else {
            return "Null";
        }
    }

    public ResultSet selectBid() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rs = connection.prepareStatement("select bid from batch").executeQuery();
        return rs;
    }

    public ResultSet checkRID() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("select rid from reg_detail").executeQuery();
        return rst;
    }

}
