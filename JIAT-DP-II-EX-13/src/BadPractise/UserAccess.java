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
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author grays
 */
public class UserAccess {

    Connection c = DBMS.c;
    private static User logedUser = null;

    public boolean save(User u) {
        boolean add = true;
        try {
            Statement s = c.createStatement();
            s.execute("INSERT INTO `carstore`.`user` (`firstname`, `email`, `pass`) VALUES ('" + u.username + "', '" + u.email + "', '" + u.password + "');");
        } catch (SQLException ex) {
            Logger.getLogger(UserAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return add;
    }

    public User checklogin(String email, String pass) {
        User u = null;
        try {
            ResultSet rs = c.createStatement().executeQuery("SELECT * FROM carstore.user");
            while (rs.next()) {
                if (rs.getString("email").equals(email) && rs.getString("pass").equals(pass)) {
                    u = new User(rs.getString("firstname"), rs.getString("pass"), rs.getString("email"));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return u;
    }

    public List<User> getdata(String email) {
        List<User> list = new ArrayList<>();
        try {
            ResultSet rs = c.createStatement().executeQuery("SELECT * FROM carstore.user");
            while (rs.next()) {
                User user = new User(rs.getString("firstname"), rs.getString("pass"), rs.getString("email"));
                list.add(user);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<User> getuserByName(String name) {
        List<User> list = null;
        try {
            ResultSet rs = c.createStatement().executeQuery("SELECT * FROM carstore.user");
            while (rs.next()) {
                if (rs.getString("firstname").contains(name)) {
                    User user = new User(rs.getString("firstname"), rs.getString("pass"), rs.getString("email"));
                    list.add(user);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public void close() {
        try {
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void setLoggedUser(User u) {
        logedUser = u;
    }

    public static User getLogedUser() {
        return logedUser;
    }

    public static class User {

        String username;
        String password;
        String email;

        public User(String username, String password, String email) {
            this.username = username;
            this.password = password;
            this.email = email;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public String toString() {
            return "User{" + "username=" + username + ", password=" + password + ", email=" + email + '}';
        }

    }
}
