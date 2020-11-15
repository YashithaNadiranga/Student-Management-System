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
import lk.ijse.gdse53.stm.model.Exam;
import lk.ijse.gdse53.stm.model.ExamDetail;
import lk.ijse.gdse53.stm.model.ExamShedule;

/**
 *
 * @author Yashitha Nadiranga
 */
public class ExamFormController {

    public boolean uploadExamShedule(ExamShedule e1) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pst = connection.prepareStatement("Insert into examshedule values(?,?,?)");
        pst.setString(1, e1.getEsid());
        pst.setString(2, e1.getEsname());
        pst.setString(3, e1.getDate());
        return pst.executeUpdate() > 0;
    }

    public String getEsid() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pst = connection.prepareStatement("select esid from examshedule order by esid desc limit 1");
        ResultSet rst = pst.executeQuery();
        if (rst.next()) {
            return rst.getString(1);
        } else {
            return "0";
        }
    }

    public String geteid() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pst = connection.prepareStatement("select eid from exam_detail order by eid desc limit 1");
        ResultSet rst = pst.executeQuery();
        if (rst.next()) {
            return rst.getString(1);
        } else {
            return "0";
        }
    }

    public ResultSet getsname() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("select esname from examshedule order by esid").executeQuery();
        return rst;
    }

    public ResultSet getCsid() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("select csid from cs order by csid").executeQuery();
        return rst;
    }

    public ResultSet getDate(String ename) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("select date from examshedule where esname ='" + ename + "'").executeQuery();
        return rst;
    }

    public boolean uploadExamDetails(Exam e1) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pst = connection.prepareStatement("insert into exam_detail values(?,?,?,?,?,?)");
        pst.setString(1, e1.getEid());
        pst.setString(2, e1.getEdate());
        pst.setString(3, e1.getMarks());
        pst.setString(4, e1.getRid());
        pst.setString(5, e1.getCsid());
        pst.setString(6, e1.getEname());

        return pst.executeUpdate() > 0;
    }

    public ResultSet checkEID() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("select eid from exam_detail").executeQuery();
        return rst;
    }

    public ResultSet checkrid() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("select rid from reg_detail").executeQuery();
        return rst;
    }

    public String getname(String rid) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("Select\n"
                + "student.name\n"
                + "From\n"
                + "student Inner Join\n"
                + "reg_detail On reg_detail.sid = student.sid where "
                + "reg_detail.rid = '" + rid + "'").executeQuery();
        if (rst.next()) {
            return rst.getString(1);
        } else {
            return "No Registration";
        }
    }

    public List<ExamDetail> loadTable() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("Select\n"
                + "    student.name,\n"
                + "    exam_detail.rid,\n"
                + "    exam_detail.edate,\n"
                + "    exam_detail.ename,\n"
                + "    exam_detail.marks,\n"
                + "    course.cname,\n"
                + "    cs.semester,\n"
                + "    subject.sname\n"
                + "    From\n"
                + "    exam_detail Inner Join\n"
                + "    reg_detail On exam_detail.rid = reg_detail.rid Inner Join\n"
                + "    student On reg_detail.sid = student.sid Inner Join\n"
                + "    cs On exam_detail.csid = cs.csid Inner Join\n"
                + "    subject On cs.sid = subject.sid Inner Join\n"
                + "    course On cs.cid = course.cid").executeQuery();

        List<ExamDetail> templist = new ArrayList();
        while (rst.next()) {
            templist.add(new ExamDetail(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8)
            ));
        }
        return templist;
    }

    public List<ExamDetail> loadTableSerchRid(String rid) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("Select\n"
                + "    student.name,\n"
                + "    exam_detail.rid,\n"
                + "    exam_detail.edate,\n"
                + "    exam_detail.ename,\n"
                + "    exam_detail.marks,\n"
                + "    course.cname,\n"
                + "    cs.semester,\n"
                + "    subject.sname\n"
                + "    From\n"
                + "    exam_detail Inner Join\n"
                + "    reg_detail On exam_detail.rid = reg_detail.rid Inner Join\n"
                + "    student On reg_detail.sid = student.sid Inner Join\n"
                + "    cs On exam_detail.csid = cs.csid Inner Join\n"
                + "    subject On cs.sid = subject.sid Inner Join\n"
                + "    course On cs.cid = course.cid where exam_detail.rid like '%" + rid + "%'").executeQuery();

        List<ExamDetail> templist = new ArrayList();
        while (rst.next()) {
            templist.add(new ExamDetail(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8)
            ));
        }
        return templist;
    }

    public List<ExamDetail> dateSearch(String date) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pst = connection.prepareStatement("Select\n"
                + "    student.name,\n"
                + "    exam_detail.rid,\n"
                + "    exam_detail.edate,\n"
                + "    exam_detail.ename,\n"
                + "    exam_detail.marks,\n"
                + "    course.cname,\n"
                + "    cs.semester,\n"
                + "    subject.sname\n"
                + "    From\n"
                + "    exam_detail Inner Join\n"
                + "    reg_detail On exam_detail.rid = reg_detail.rid Inner Join\n"
                + "    student On reg_detail.sid = student.sid Inner Join\n"
                + "    cs On exam_detail.csid = cs.csid Inner Join\n"
                + "    subject On cs.sid = subject.sid Inner Join\n"
                + "    course On cs.cid = course.cid where exam_detail.edate = ?");
        pst.setString(1, date);
        ResultSet rst = pst.executeQuery();
        List<ExamDetail> templist = new ArrayList<>();
        while (rst.next()) {
            templist.add(new ExamDetail(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8)
            ));
        }
        return templist;
    }

    public List<ExamDetail> loadTableSerchName(String name) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("Select\n"
                + "    student.name,\n"
                + "    exam_detail.rid,\n"
                + "    exam_detail.edate,\n"
                + "    exam_detail.ename,\n"
                + "    exam_detail.marks,\n"
                + "    course.cname,\n"
                + "    cs.semester,\n"
                + "    subject.sname\n"
                + "    From\n"
                + "    exam_detail Inner Join\n"
                + "    reg_detail On exam_detail.rid = reg_detail.rid Inner Join\n"
                + "    student On reg_detail.sid = student.sid Inner Join\n"
                + "    cs On exam_detail.csid = cs.csid Inner Join\n"
                + "    subject On cs.sid = subject.sid Inner Join\n"
                + "    course On cs.cid = course.cid where exam_detail.ename like '%" + name + "%'").executeQuery();

        List<ExamDetail> templist = new ArrayList();
        while (rst.next()) {
            templist.add(new ExamDetail(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8)
            ));
        }
        return templist;
    }

    public List<ExamDetail> loadTableSerchCsid(String csid) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("Select\n"
                + "    student.name,\n"
                + "    exam_detail.rid,\n"
                + "    exam_detail.edate,\n"
                + "    exam_detail.ename,\n"
                + "    exam_detail.marks,\n"
                + "    course.cname,\n"
                + "    cs.semester,\n"
                + "    subject.sname\n"
                + "    From\n"
                + "    exam_detail Inner Join\n"
                + "    reg_detail On exam_detail.rid = reg_detail.rid Inner Join\n"
                + "    student On reg_detail.sid = student.sid Inner Join\n"
                + "    cs On exam_detail.csid = cs.csid Inner Join\n"
                + "    subject On cs.sid = subject.sid Inner Join\n"
                + "    course On cs.cid = course.cid where exam_detail.csid = '"+csid+"'").executeQuery();

        List<ExamDetail> templist = new ArrayList();
        while (rst.next()) {
            templist.add(new ExamDetail(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8)
            ));
        }
        return templist;
    }

    public ResultSet setCsid() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("select csid from cs order by csid").executeQuery();
        return rst;
    }
}
