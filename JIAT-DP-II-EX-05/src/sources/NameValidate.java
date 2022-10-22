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
public class NameValidate extends Validator{

    @Override
    public void process(User user) {
       if(!user.name.isEmpty()){
            this.validator.process(user);
        }else{
           user.concatNote("Name Feild is Empty");
       }
    }
    
}
