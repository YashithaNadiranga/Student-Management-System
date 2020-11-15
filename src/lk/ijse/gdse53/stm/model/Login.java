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
public class Login {
    private String username;
    private String password;
    private String privileges;

    public Login() {
    }

    public Login(String username, String password, String privileges) {
        this.username = username;
        this.password = password;
        this.privileges = privileges;
    }

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the privileges
     */
    public String getPrivileges() {
        return privileges;
    }

    /**
     * @param privileges the privileges to set
     */
    public void setPrivileges(String privileges) {
        this.privileges = privileges;
    }

    @Override
    public String toString() {
        return "Login{" + "username=" + username + ", password=" + password + ", privileges=" + privileges + '}';
    }
    
    
}
