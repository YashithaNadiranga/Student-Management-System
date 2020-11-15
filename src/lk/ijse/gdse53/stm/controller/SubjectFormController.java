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
import lk.ijse.gdse53.stm.model.SCDetail;
import lk.ijse.gdse53.stm.model.Subject;

/**
 *
 * @author Yashitha Nadiranga
 */
public class SubjectFormController {

    public List<Subject> loadTable() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("select * from subject order by sid").executeQuery();
        List<Subject> templist = new ArrayList<>();
        while (rst.next()) {
            templist.add(new Subject(rst.getString(1), rst.getString(2)));
        }
        return templist;
    }

    public boolean uploadSubject(Subject s1) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pst = connection.prepareStatement("insert into subject values(?,?)");
        pst.setString(1, s1.getSid());
        pst.setString(2, s1.getSname());
        return pst.executeUpdate() > 0;
    }

    public int getCount() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("select count(*) from subject").executeQuery();
        if (rst.next()) {
            return rst.getInt(1);
        } else {
            return 0;
        }
    }

    public boolean updateSubject(Subject s1) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pst = connection.prepareStatement("update subject set sid =?, sname =? where sid =?");
        pst.setString(1, s1.getSid());
        pst.setString(2, s1.getSname());
        pst.setString(3, s1.getSid());
        return pst.executeUpdate() > 0;
    }

    public boolean deleteSubject(String sid) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pst = connection.prepareStatement("delete from subject where sid='" + sid + "'");
        return pst.executeUpdate() > 0;
    }

    public String getSid() throws SQLException, ClassNotFoundException {

        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("SELECT sid FROM subject ORDER BY sid DESC LIMIT 1").executeQuery();

        if (rst.next()) {
            return rst.getString(1);
        } else {
            return "000";
        }
    }

    public String getCsid() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("SELECT csid FROM cs ORDER BY csid DESC LIMIT 1").executeQuery();

        if (rst.next()) {
            return rst.getString(1);
        } else {
            return "00";
        }
    }

    public ResultSet getCid() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("select cid from course").executeQuery();
        return rst;
    }

    public ResultSet getSubjectID() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("select sid from subject").executeQuery();
        return rst;
    }

    public boolean uploadCS(SCDetail sc) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pst = connection.prepareStatement("insert into cs values(?,?,?,?)");
        pst.setString(1, sc.getCsid());
        pst.setString(2, sc.getSemester());
        pst.setString(3, sc.getCid());
        pst.setString(4, sc.getSid());

        return pst.executeUpdate() > 0;
    }

    public List<SCDetail> loadCsTable() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("select * from cs order by csid").executeQuery();
        List templist = new ArrayList();
        while (rst.next()) {
            templist.add(new SCDetail(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4)
            ));
        }
        return templist;
    }

    public ResultSet checkSid() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("select sid from subject").executeQuery();
        return rst;
    }

    public ResultSet checkcssid() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("select cid,sid,semester from cs").executeQuery();
        return rst;
    }

    public boolean updateCS(SCDetail sc) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pst = connection.prepareStatement("update cs set semester =?,cid =?, sid =? where csid =?");
        pst.setString(4, sc.getCsid());
        pst.setString(1, sc.getSemester());
        pst.setString(2, sc.getCid());
        pst.setString(3, sc.getSid());

        return pst.executeUpdate() > 0;
    }

    public boolean deleteCS(String csid) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pst = connection.prepareStatement("delete from cs where csid='" + csid + "'");
        return pst.executeUpdate() > 0;
    }

    public ResultSet checkCsid() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("select csid from cs").executeQuery();
        return rst;
    }
}
