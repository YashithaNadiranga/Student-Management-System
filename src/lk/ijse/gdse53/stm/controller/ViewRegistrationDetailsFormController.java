/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse53.stm.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.gdse53.stm.db.DBConnection;
import lk.ijse.gdse53.stm.model.SRDetail;

/**
 *
 * @author Yashitha Nadiranga
 */
public class ViewRegistrationDetailsFormController {

    public List getDetails() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rs = connection.prepareStatement(
                "Select student.sid,reg_detail.rid, "
                + "student.name, reg_detail.bid,reg_detail.reg_date,reg_detail.rfee from student inner join"
                + " reg_detail on student.sid = reg_detail.sid order by sid"
        ).executeQuery();

        List<SRDetail> templist = new ArrayList();
        while (rs.next()) {
            templist.add(new SRDetail(
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6)
            ));

        }
        return templist;
    }

    public List<SRDetail> ridSearch(String rid) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("Select student.sid,reg_detail.rid, student.name, reg_detail.bid,"
                + "reg_detail.reg_date,reg_detail.rfee from student inner join reg_detail on "
                + "student.sid = reg_detail.sid where reg_detail.rid Like '%" + rid + "%' ORDER BY student.sid ASC ").executeQuery();
        List<SRDetail> templist = new ArrayList();
        while (rst.next()) {
            templist.add(new SRDetail(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6)
            ));
        }
        return templist;
    }

    public List<SRDetail> nameSearch(String name) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("Select student.sid,reg_detail.rid, student.name, reg_detail.bid,"
                + "reg_detail.reg_date,reg_detail.rfee from student inner join reg_detail on "
                + "student.sid = reg_detail.sid where student.name Like '%" + name + "%' ORDER BY student.sid ASC").executeQuery();
        List<SRDetail> templist = new ArrayList();
        while (rst.next()) {
            templist.add(new SRDetail(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6)
            ));
        }
        return templist;
    }

    public List<SRDetail> dateSearch(String date) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("Select student.sid,reg_detail.rid, student.name, reg_detail.bid,"
                + "reg_detail.reg_date,reg_detail.rfee from student inner join reg_detail on "
                + "student.sid = reg_detail.sid where reg_detail.reg_date ='"+date+"' ORDER BY student.sid ASC").executeQuery();
        List<SRDetail> templist = new ArrayList();
        while (rst.next()) {
            templist.add(new SRDetail(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6)
            ));
        }
        return templist;
    }

}
