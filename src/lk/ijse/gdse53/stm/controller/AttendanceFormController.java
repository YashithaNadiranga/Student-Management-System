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
import lk.ijse.gdse53.stm.model.ADetails;
import lk.ijse.gdse53.stm.model.Attendance;

/**
 *
 * @author Yashitha Nadiranga
 */
public class AttendanceFormController {

    public String addAid() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("select aid from attendance order by aid desc limit 1 ").executeQuery();
        if (rst.next()) {
            return rst.getString(1);
        } else {
            return "000";
        }
    }

    public ResultSet loadCSID() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("select csid from cs order by csid").executeQuery();
        return rst;
    }

    public boolean uploadAttendance(Attendance a1) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pst = connection.prepareStatement("insert into attendance values(?,?,?,?,?)");
        pst.setString(1, a1.getAid());
        pst.setString(2, a1.getRid());
        pst.setString(3, a1.getCsid());
        pst.setString(4, a1.getDate());
        pst.setString(5, a1.getTime());

        return pst.executeUpdate() > 0;
    }

    public int getCount(String date) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pst = connection.prepareStatement("select DISTINCT count(rid) from attendance  where date = '" + date + "'order by rid");
        ResultSet rst = pst.executeQuery();
        if (rst.next()) {
            return rst.getInt(1);
        } else {
            return 0;
        }

    }

    public List<ADetails> loadTable() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement(
                "    Select\n"
                + "    attendance.rid,\n"
                + "    attendance.date,\n"
                + "    subject.sname,\n"
                + "    course.cname,\n"
                + "    student.name,\n"
                + "    batch.bno\n"
                + "    From\n"
                + "    attendance Inner Join\n"
                + "    cs On attendance.csid = cs.csid Inner Join\n"
                + "    subject On cs.sid = subject.sid Inner Join\n"
                + "    course On cs.cid = course.cid Inner Join\n"
                + "    reg_detail On attendance.rid = reg_detail.rid Inner Join\n"
                + "    student On reg_detail.sid = student.sid Inner Join\n"
                + "    batch On batch.cid = course.cid\n"
                + "    And reg_detail.bid = batch.bid\n"
                + "    where attendance.date=DATE(now())"
        ).executeQuery();

        List<ADetails> templist = new ArrayList<>();
        while (rst.next()) {
            templist.add(new ADetails(
                    rst.getString(1),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getString(4),
                    rst.getString(3),
                    rst.getString(2)
            ));
        }
        return templist;
    }

    public List<ADetails> loadTableAll() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement(
                "    Select\n"
                + "    attendance.rid,\n"
                + "    attendance.date,\n"
                + "    subject.sname,\n"
                + "    course.cname,\n"
                + "    student.name,\n"
                + "    batch.bno\n"
                + "    From\n"
                + "    attendance Inner Join\n"
                + "    cs On attendance.csid = cs.csid Inner Join\n"
                + "    subject On cs.sid = subject.sid Inner Join\n"
                + "    course On cs.cid = course.cid Inner Join\n"
                + "    reg_detail On attendance.rid = reg_detail.rid Inner Join\n"
                + "    student On reg_detail.sid = student.sid Inner Join\n"
                + "    batch On batch.cid = course.cid\n"
                + "    And reg_detail.bid = batch.bid order by attendance.date "
        ).executeQuery();

        List<ADetails> templist = new ArrayList<>();
        while (rst.next()) {
            templist.add(new ADetails(
                    rst.getString(1),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getString(4),
                    rst.getString(3),
                    rst.getString(2)
            ));
        }
        return templist;
    }

    public ResultSet checkAttendanceField() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("select rid,date,csid from attendance where attendance.date =Date(now())").executeQuery();
        return rst;
    }

    public List<ADetails> loadTableAllsearch(String date) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement(
                "    Select\n"
                + "    attendance.rid,\n"
                + "    attendance.date,\n"
                + "    subject.sname,\n"
                + "    course.cname,\n"
                + "    student.name,\n"
                + "    batch.bno\n"
                + "    From\n"
                + "    attendance Inner Join\n"
                + "    cs On attendance.csid = cs.csid Inner Join\n"
                + "    subject On cs.sid = subject.sid Inner Join\n"
                + "    course On cs.cid = course.cid Inner Join\n"
                + "    reg_detail On attendance.rid = reg_detail.rid Inner Join\n"
                + "    student On reg_detail.sid = student.sid Inner Join\n"
                + "    batch On batch.cid = course.cid\n"
                + "    And reg_detail.bid = batch.bid\n"
                + "    where attendance.date='"+date+"' "
        ).executeQuery();

        List<ADetails> templist = new ArrayList<>();
        while (rst.next()) {
            templist.add(new ADetails(
                    rst.getString(1),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getString(4),
                    rst.getString(3),
                    rst.getString(2)
            ));
        }
        return templist;
    }

    public ResultSet checkrid() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("select rid from reg_detail").executeQuery();
        return rst;
    }

}
