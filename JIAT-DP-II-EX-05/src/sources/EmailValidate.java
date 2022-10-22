/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sources;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author grays
 */
public class EmailValidate extends Validator {

    @Override
    public void process(User user) {
        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}";
        Pattern pattern = java.util.regex.Pattern.compile(regex);
        Matcher matcher = pattern.matcher(user.email);
        if (!user.email.isEmpty()) {
            if (matcher.matches()) {
                user.setSuccess(true);
            } else {
                user.concatNote("Invalid Email");
            }
        } else {
            user.concatNote("Email Feild is Empty");
        }
    }

}
