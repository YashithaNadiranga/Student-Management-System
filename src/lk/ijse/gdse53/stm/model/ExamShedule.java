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
public class ExamShedule {

    private String esid;
    private String esname;
    private String date;

    public ExamShedule() {
    }

    public ExamShedule(String esid, String esname, String date) {
        this.esid = esid;
        this.esname = esname;
        this.date = date;
    }
    
    

    /**
     * @return the esid
     */
    public String getEsid() {
        return esid;
    }

    /**
     * @param esid the esid to set
     */
    public void setEsid(String esid) {
        this.esid = esid;
    }

    /**
     * @return the esname
     */
    public String getEsname() {
        return esname;
    }

    /**
     * @param esname the esname to set
     */
    public void setEsname(String esname) {
        this.esname = esname;
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

    @Override
    public String toString() {
        return "ExamShedule{" + "esid=" + esid + ", esname=" + esname + ", date=" + date + '}';
    }
    
    
}
