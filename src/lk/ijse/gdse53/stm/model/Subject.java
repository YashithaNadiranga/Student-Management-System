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
public class Subject {
    
    private String sid;
    private String sname;

    public Subject() {
    }

    public Subject(String sid, String sname) {
        this.sid = sid;
        this.sname = sname;
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
        return "Subject{" + "sid=" + sid + ", sname=" + sname + '}';
    }
    
}
