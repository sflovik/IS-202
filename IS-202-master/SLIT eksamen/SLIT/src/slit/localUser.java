/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slit;

/**
 *
 * @author Sondre
 */
public class localUser {
    private String user;
    private String pass;
    private String role;
  
    //private ArrayList<Module> modules;



    public localUser(String user, String pass, String role){
        this.user = user;
        this.pass = pass;
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    //@Override
    //public String toString(){
    //    return String.format("Username: %s email: %s", name, userName);
   // }
    
}
