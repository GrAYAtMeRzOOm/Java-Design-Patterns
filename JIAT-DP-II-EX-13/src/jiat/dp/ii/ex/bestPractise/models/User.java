package jiat.dp.ii.ex.bestPractise.models;
// Generated Jan 23, 2022 9:16:32 PM by Hibernate Tools 4.3.1



/**
 * User generated by hbm2java
 */
public class User  implements java.io.Serializable {


     private Integer UId;
     private String firstname;
     private String email;
     private String pass;

    public User() {
    }

    public User(String firstname, String email, String pass) {
       this.firstname = firstname;
       this.email = email;
       this.pass = pass;
    }
   
    public Integer getUId() {
        return this.UId;
    }
    
    public void setUId(Integer UId) {
        this.UId = UId;
    }
    public String getFirstname() {
        return this.firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPass() {
        return this.pass;
    }
    
    public void setPass(String pass) {
        this.pass = pass;
    }




}

