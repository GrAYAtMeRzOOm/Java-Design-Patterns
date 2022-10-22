/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sources.Interfaces;

/**
 *
 * @author grays
 */
public abstract class Toppings implements FreashFruiti_Juice {

    protected final FreashFruiti_Juice juice;

    public Toppings(FreashFruiti_Juice juice) {
        this.juice = juice;
    }
    
    @Override
    public String getDescription() {
        return juice.getDescription().concat("with");
    }

    @Override
    public String getImage(){
        return juice.getDescription();
    }

    @Override
    public double getPrice() {
        return juice.getPrice();
    }

}
