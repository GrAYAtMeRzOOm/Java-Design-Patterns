/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;


/**
 *
 * @author grays
 */
public abstract class Validator {

    protected Validator validator;

    public void setNext(Validator validator) {
        this.validator = validator;
    }
    public abstract void process(User user);
}
