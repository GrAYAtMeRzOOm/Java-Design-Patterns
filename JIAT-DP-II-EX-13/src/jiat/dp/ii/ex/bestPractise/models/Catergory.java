package jiat.dp.ii.ex.bestPractise.models;
// Generated Jan 23, 2022 9:16:32 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Catergory generated by hbm2java
 */
public class Catergory  implements java.io.Serializable {


     private int caterId;
     private String catergoryName;
     private Date addedDate;

    public Catergory() {
    }

	
    public Catergory(int caterId, String catergoryName) {
        this.caterId = caterId;
        this.catergoryName = catergoryName;
    }
    public Catergory(int caterId, String catergoryName, Date addedDate) {
       this.caterId = caterId;
       this.catergoryName = catergoryName;
       this.addedDate = addedDate;
    }
   
    public int getCaterId() {
        return this.caterId;
    }
    
    public void setCaterId(int caterId) {
        this.caterId = caterId;
    }
    public String getCatergoryName() {
        return this.catergoryName;
    }
    
    public void setCatergoryName(String catergoryName) {
        this.catergoryName = catergoryName;
    }
    public Date getAddedDate() {
        return this.addedDate;
    }
    
    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }




}


