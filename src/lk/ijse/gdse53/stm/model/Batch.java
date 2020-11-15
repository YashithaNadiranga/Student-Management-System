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
public class Batch {
    private String bid;
    private String bno;
    private String cid;

    public Batch() {
    }

    public Batch(String bid, String bno, String cid) {
        this.bid = bid;
        this.bno = bno;
        this.cid = cid;
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
     * @return the bno
     */
    public String getBno() {
        return bno;
    }

    /**
     * @param bno the bno to set
     */
    public void setBno(String bno) {
        this.bno = bno;
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

    @Override
    public String toString() {
        return "Batch{" + "bid=" + bid + ", bno=" + bno + ", cid=" + cid + '}';
    }
    
    
    
}
