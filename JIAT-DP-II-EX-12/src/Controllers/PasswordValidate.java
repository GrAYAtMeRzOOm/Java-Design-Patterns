/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.User;
import Models.Validator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author grays
 */
public class PasswordValidate extends Validator{

    @Override
    public void process(User user) {
        String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{8,25}$";
        Pattern pattern = java.util.regex.Pattern.compile(regex);
        Matcher matcher = pattern.matcher(user.getPassword());
        
            if(user.getPassword().length()>=8){
                if (matcher.matches()){
                    this.validator.process(user);
                }else{
                    user.concatNote("Password must contains mixture of uppercase letters, lowercase letters and numbers.");
                }
            }else{
                user.concatNote("Length of Password is less than 8");
            }
    }
    
}
