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
public class Student {

    private String sid;
    private String name;
    private String dob;
    private int age;
    private String nic;
    private String tel1;
    private String tel2;
    private String address;

    public Student() {
    }

    public Student(String sid, String name, String dob, int age, String nic, String tel1, String tel2, String address) {
        this.sid = sid;
        this.name = name;
        this.dob = dob;
        this.age = age;
        this.nic = nic;
        this.tel1 = tel1;
        this.tel2 = tel2;
        this.address = address;
    }

    public Student(String sid, String name, String tel1, String address) {
       this.sid = sid;
       this.name = name;
       this.tel1 = tel1;
       this.address = address;
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
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the nic
     */
    public String getNic() {
        return nic;
    }

    /**
     * @param nic the nic to set
     */
    public void setNic(String nic) {
        this.nic = nic;
    }

    /**
     * @return the tel1
     */
    public String getTel1() {
        return tel1;
    }

    /**
     * @param tel1 the tel1 to set
     */
    public void setTel1(String tel1) {
        this.tel1 = tel1;
    }

    /**
     * @return the tel2
     */
    public String getTel2() {
        return tel2;
    }

    /**
     * @param tel2 the tel2 to set
     */
    public void setTel2(String tel2) {
        this.tel2 = tel2;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" + "sid=" + sid + ", name=" + name + ", dob=" + dob + ", age=" + age + ", nic=" + nic + ", tel1=" + tel1 + ", tel2=" + tel2 + ", address=" + address + '}';
    }
    
    

}
