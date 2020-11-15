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
public class Exam {

    private String eid;
    private String edate;
    private String marks;
    private String rid;
    private String csid;
    private String ename;

    public Exam() {
    }

    public Exam(String eid, String edate, String marks, String rid, String csid, String ename) {
        this.eid = eid;
        this.edate = edate;
        this.marks = marks;
        this.rid = rid;
        this.csid = csid;
        this.ename = ename;
    }
    
    

    /**
     * @return the eid
     */
    public String getEid() {
        return eid;
    }

    /**
     * @param eid the eid to set
     */
    public void setEid(String eid) {
        this.eid = eid;
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
     * @return the csid
     */
    public String getCsid() {
        return csid;
    }

    /**
     * @param csid the csid to set
     */
    public void setCsid(String csid) {
        this.csid = csid;
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

    @Override
    public String toString() {
        return "Exam{" + "eid=" + eid + ", edate=" + edate + ", marks=" + marks + ", rid=" + rid + ", csid=" + csid + ", ename=" + ename + '}';
    }
    
    
}
