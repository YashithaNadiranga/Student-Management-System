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
public class Attendance {

    private String aid;
    private String rid;
    private String csid;
    private String date;
    private String time;

    public Attendance() {
    }

    public Attendance(String aid, String rid, String csid, String date, String time) {
        this.aid = aid;
        this.rid = rid;
        this.csid = csid;
        this.date = date;
        this.time = time;
    }
    
    

    /**
     * @return the aid
     */
    public String getAid() {
        return aid;
    }

    /**
     * @param aid the aid to set
     */
    public void setAid(String aid) {
        this.aid = aid;
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
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Attendance{" + "aid=" + aid + ", rid=" + rid + ", csid=" + csid + ", date=" + date + ", time=" + time + '}';
    }
    
    
}
