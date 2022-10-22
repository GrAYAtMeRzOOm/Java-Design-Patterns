/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BadPractise;

import BadPractise.JDBC.DBMS;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author grays
 */
public class ProductAccess {

    Connection c = DBMS.c;

    public boolean save(Vehicle v) {
        boolean b = true;
        try {
            Statement s1 = c.createStatement();
            s1.execute("INSERT INTO `carstore`.`vehicle` (`vehi_name`, `vehi_brand`, `vehi_engine`,`vehi_seats`,`vehi_descrip`) VALUES ('" + v.getName() + "', '" + v.getBrand() + "', '" + v.getEngine() + "','" + v.getSeat() + "','" + v.getDescription() + "');");
            System.out.println("**********Data Added " + b + "**********");
        } catch (SQLException ex) {
            b = false;
            Logger.getLogger(ProductAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return b;
    }

    public boolean update(Vehicle v) {
        boolean b = true;
        try {
            Statement s1 = c.createStatement();
            s1.execute("UPDATE `carstore`.`vehicle` SET `vehi_name`='" + v.getName() + "', `vehi_brand`='" + v.getBrand() + "', `vehi_engine`='" + v.getEngine() + "',`vehi_seats`='" + v.getSeat() + "',`vehi_descrip`='" + v.getDescription() + "' WHERE  `vehi_id`=" + v.getId() + ";");
            System.out.println("**********Data Update " + b + "**********");
        } catch (SQLException ex) {
            b = false;
            Logger.getLogger(ProductAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return b;
    }

    public List<Vehicle> getVehis() {
        List<Vehicle> list = new ArrayList<>();
        try {
            ResultSet rs = c.createStatement().executeQuery("SELECT * FROM carstore.user");
            while (rs.next()) {
                Vehicle v = new Vehicle(rs.getString("vehi_id"), rs.getString("vehi_name"), rs.getString("vehi_brand"), rs.getString("vehi_engine"), rs.getString("vehi_seats"), rs.getString("vehi_descrip"));
                list.add(v);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public boolean delete(String id) {
        boolean b = true;
        try {
            Statement s1 = c.createStatement();
            s1.execute("DELETE FROM `carstore`.`vehicle` WHERE  `vehi_id`=" + id + ";");
            System.out.println("**********Data Deleted " + b + "**********");
        } catch (SQLException ex) {
            b = false;
            Logger.getLogger(ProductAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return b;
    }

    public static class Vehicle {

        protected String id;
        protected String name;
        protected String brand;
        protected String engine;
        protected String seat;
        protected String description;

        public Vehicle(String id, String name, String brand, String engine, String seat, String description) {
            this.id = id;
            this.name = name;
            this.brand = brand;
            this.engine = engine;
            this.seat = seat;
            this.description = description;
        }

        public Vehicle(String name, String brand, String engine, String seat, String description) {
            this.name = name;
            this.brand = brand;
            this.engine = engine;
            this.seat = seat;
            this.description = description;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getEngine() {
            return engine;
        }

        public void setEngine(String engine) {
            this.engine = engine;
        }

        public String getSeat() {
            return seat;
        }

        public void setSeat(String seat) {
            this.seat = seat;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

    }

}
