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
public class ADetails {
    private String rid;
    private String name;
    private String batch;
    private String course;
    private String subject;
    private String date;

    public ADetails() {
    }

    public ADetails(String rid, String name, String batch, String course, String subject, String date) {
        this.rid = rid;
        this.name = name;
        this.batch = batch;
        this.course = course;
        this.subject = subject;
        this.date = date;
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
     * @return the batch
     */
    public String getBatch() {
        return batch;
    }

    /**
     * @param batch the batch to set
     */
    public void setBatch(String batch) {
        this.batch = batch;
    }

    /**
     * @return the course
     */
    public String getCourse() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(String course) {
        this.course = course;
    }

    /**
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
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
        return "ADetails{" + "rid=" + rid + ", name=" + name + ", batch=" + batch + ", course=" + course + ", subject=" + subject + ", date=" + date + '}';
    }
    
    
}
