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
public class SCDetail {
    private String csid;
    private String semester;
    private String cid;
    private String sid;

    public SCDetail() {
    }

    public SCDetail(String csid, String semester, String cid, String sid) {
        this.csid = csid;
        this.semester = semester;
        this.cid = cid;
        this.sid = sid;
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
     * @return the cid
     */
    public String getCid() {
        return cid;
    }

    /**
     * @param cid the cid to set
     */
    public void setCid(String cid) {
        this.cid = cid;
    }

    /**
     * @return the sid
     */
    public String getSid() {
        return sid;
    }

    /**
     * @param sid the sid to set
     */
    public void setSid(String sid) {
        this.sid = sid;
    }

    @Override
    public String toString() {
        return "SCDetail{" + "csid=" + csid + ", semester=" + semester + ", cid=" + cid + ", sid=" + sid + '}';
    }
    
}
