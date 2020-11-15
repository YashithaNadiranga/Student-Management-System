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
public class Registration {
    
    private String rid;
    private String bid;
    private String sid;
    private String rfee;
    private String regdate;

    public Registration() {
    }

    public Registration(String rid, String bid, String sid, String rfee, String regdate) {
        this.rid = rid;
        this.bid = bid;
        this.sid = sid;
        this.rfee = rfee;
        this.regdate = regdate;
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
     * @return the bid
     */
    public String getBid() {
        return bid;
    }

    /**
     * @param bid the bid to set
     */
    public void setBid(String bid) {
        this.bid = bid;
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
     * @return the rfee
     */
    public String getRfee() {
        return rfee;
    }

    /**
     * @param rfee the rfee to set
     */
    public void setRfee(String rfee) {
        this.rfee = rfee;
    }

    /**
     * @return the regdate
     */
    public String getRegdate() {
        return regdate;
    }

    /**
     * @param regdate the regdate to set
     */
    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    @Override
    public String toString() {
        return "Registration{" + "rid=" + rid + ", bid=" + bid + ", sid=" + sid + ", rfee=" + rfee + ", regdate=" + regdate + '}';
    }
    
    
       
}
