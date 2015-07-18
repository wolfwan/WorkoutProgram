/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author wwanless
 */
public class Login extends DomainAbs {

    private String username;
    private String password;

    @Override
    public boolean validate() {
        if (username == null || username.equals("")) {
            return false;
        }
        if (password == null || password.equals("")) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString(){
        return username + "/" + password;
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
}
