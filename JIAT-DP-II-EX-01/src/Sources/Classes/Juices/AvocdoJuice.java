/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sources.Classes.Juices;

import Sources.Interfaces.FreashFruiti_Juice;

/**
 *
 * @author grays
 */
public class AvocdoJuice implements FreashFruiti_Juice {

    @Override
    public double getPrice() {
        return 120.00;
    }

    @Override
    public String getImage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDescription() {
        return " Avocdo Juice ";
    }

}
