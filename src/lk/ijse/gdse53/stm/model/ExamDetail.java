/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse53.stm.model;

/**
 *
 * @author Yashitha Nadiranga
 */
public class ExamDetail {
    private String name;
    private String rid;
    private String edate;
    private String ename;
    private String marks;
    private String cname;
    private String semester;
    private String sname;

    public ExamDetail() {
    }

    public ExamDetail(String name, String rid, String edate, String ename, String marks, String cname, String semester, String sname) {
        this.name = name;
        this.rid = rid;
        this.edate = edate;
        this.ename = ename;
        this.marks = marks;
        this.cname = cname;
        this.semester = semester;
        this.sname = sname;
    }
    
    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the rid
     */
    public String getRid() {
        return rid;
    }

    /**
     * @param rid the rid to set
     */
    public void setRid(String rid) {
        this.rid = rid;
    }

    /**
     * @return the edate
     */
    public String getEdate() {
        return edate;
    }

    /**
     * @param edate the edate to set
     */
    public void setEdate(String edate) {
        this.edate = edate;
    }

    /**
     * @return the ename
     */
    public String getEname() {
        return ename;
    }

    /**
     * @param ename the ename to set
     */
    public void setEname(String ename) {
        this.ename = ename;
    }

    /**
     * @return the marks
     */
    public String getMarks() {
        return marks;
    }

    /**
     * @param marks the marks to set
     */
    public void setMarks(String marks) {
        this.marks = marks;
    }

    /**
     * @return the cname
     */
    public String getCname() {
        return cname;
    }

    /**
     * @param cname the cname to set
     */
    public void setCname(String cname) {
        this.cname = cname;
    }

    /**
     * @return the semester
     */
    public String getSemester() {
        return semester;
    }

    /**
     * @param semester the semester to set
     */
    public void setSemester(String semester) {
        this.semester = semester;
    }

    /**
     * @return the sname
     */
    public String getSname() {
        return sname;
    }

    /**
     * @param sname the sname to set
     */
    public void setSname(String sname) {
        this.sname = sname;
    }

    @Override
    public String toString() {
        return "ExamDetail{" + "name=" + name + ", rid=" + rid + ", edate=" + edate + ", ename=" + ename + ", marks=" + marks + ", cname=" + cname + ", semester=" + semester + ", sname=" + sname + '}';
    }
    
    
    
}
