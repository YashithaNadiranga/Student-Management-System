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
import lk.ijse.gdse53.stm.model.Batch;

/**
 *
 * @author Yashitha Nadiranga
 */
public class BatchFormController {

    public List loadTable() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rs = connection.prepareStatement("select * from batch").executeQuery();
        List<Batch> templist = new ArrayList();
        while (rs.next()) {
            templist.add(new Batch(
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3)
            ));
        }
        return templist;

    }

    public int getBatchCount() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rs = connection.prepareStatement("select count(*) from batch").executeQuery();

        if (rs.next()) {
            return rs.getInt(1);
        } else {
            return 0;
        }
    }

    public boolean uploadBatch(Batch b1) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pst = connection.prepareStatement("Insert into batch values(?,?,?)");
        pst.setString(1, b1.getBid());
        pst.setString(2, b1.getBno());
        pst.setString(3, b1.getCid());

        return pst.executeUpdate() > 0;
    }

    public ResultSet selectCid() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rs = connection.prepareStatement("select cid from course").executeQuery();
        return rs;
    }

    public boolean deleteBatch(String bid) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pst = connection.prepareStatement("delete from batch where bid = '" + bid + "'");
        return pst.executeUpdate() > 0;
    }

    public boolean updateBatch(Batch b1) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pst = connection.prepareStatement("update batch set bno =?,cid =? where bid =?");
        pst.setString(1, b1.getBno());
        pst.setString(2, b1.getCid());
        pst.setString(3, b1.getBid());

        return pst.executeUpdate() > 0;
    }

//    public ResultSet checkAllField() throws ClassNotFoundException, SQLException {
//        Connection connection = DBConnection.getInstance().getConnection();
//        connection.prepareStatement("select ")
//    }
    public String getBid() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("SELECT bid FROM batch ORDER BY bid DESC LIMIT 1").executeQuery();

        if (rst.next()) {
            return rst.getString(1);
        } else {
            return "000";
        }
    }

    public int getBno() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("SELECT bno FROM batch ORDER BY bno DESC LIMIT 1").executeQuery();

        if (rst.next()) {
            return rst.getInt(1);
        } else {
            return 0;
        }
    }

    public ResultSet checkBid() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("select bid from batch").executeQuery();
        return rst;
    }

}
