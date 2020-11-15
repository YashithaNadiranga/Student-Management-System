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
public class Course {
    
    private String cid;
    private String cname;
    private String cfee;

    public Course() {
    }

    public Course(String cid, String cname, String cfee) {
        this.cid = cid;
        this.cname = cname;
        this.cfee = cfee;
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
     * @return the cfee
     */
    public String getCfee() {
        return cfee;
    }

    /**
     * @param cfee the cfee to set
     */
    public void setCfee(String cfee) {
        this.cfee = cfee;
    }

    @Override
    public String toString() {
        return "Course{" + "cid=" + cid + ", cname=" + cname + ", cfee=" + cfee + '}';
    }
    
    
}
