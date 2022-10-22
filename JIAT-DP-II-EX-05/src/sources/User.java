/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sources;

/**
 *
 * @author grays
 */
public class User {
    protected String name;
    protected String mobile;
    protected String password;
    protected String email;
    protected String country;
    protected boolean success;
    
    protected String note ="";

    public User(String name, String mobile, String password, String email, String country) {
        this.name = name;
        this.mobile = mobile;
        this.password = password;
        this.email = email;
        this.country = country;
    }

    

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
    public void concatNote(String text){
         note=note+"\n"+text;
    }

    public String getNote() {
        return note;
    }
    
}
