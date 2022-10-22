/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sources.Classes.Toppings;

import Sources.Interfaces.FreashFruiti_Juice;
import Sources.Interfaces.Toppings;

/**
 *
 * @author grays
 */
public class WhippingCream extends Toppings {

    public WhippingCream(FreashFruiti_Juice juice) {
        super(juice);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 20.00; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getImage() {
        return super.getImage(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDescription() {
        return super.getDescription().concat(" Whipping Cream"); //To change body of generated methods, choose Tools | Templates.
    }
}
