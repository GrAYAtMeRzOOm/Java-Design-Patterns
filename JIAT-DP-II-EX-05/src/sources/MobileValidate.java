/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sources;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author grays
 */
public class MobileValidate extends Validator {

    @Override
    public void process(User user) {
        String regex = "^[6-9]\\d{9}$";
        Pattern pattern = java.util.regex.Pattern.compile(regex);
        Matcher matcher = pattern.matcher(user.mobile);
        if (!user.mobile.isEmpty()) {
            if (user.mobile.length() == 10) {
                this.validator.process(user);
            } else {
                user.concatNote("Length of Mobile number is invalid");
            }
        } else {
            user.concatNote("Invalid Mobile Number");
        }

    }

}
