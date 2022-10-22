/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author grays
 */
public class AccessUser {

    private static final List<User> USERLIST = new ArrayList<>();
    private static User logedUser = null;
    

    public static boolean saveUser(User u) {
        boolean add = USERLIST.add(u);
        return add;
    }

    public static User getuserByEmail(String email) {
        User u = null;
        for (User user : USERLIST) {
            if (user.getEmail().equals(email)) {
                u = user;
            }
        }
        return u;
    }
    public static User getuserByName(String name) {
        User u = null;
        for (User user : USERLIST) {
            if (user.getName().equals(name)) {
                u = user;
            }
        }
        return u;
    }
    public static void setLoggedUser(User u){
        logedUser = u;
    }

    public static User getLogedUser() {
        return logedUser;
    }
    
}
