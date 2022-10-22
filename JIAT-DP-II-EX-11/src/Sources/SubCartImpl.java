/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sources;

import Sources.Interfaces.Cart;

/**
 *
 * @author grays
 */
public class SubCartImpl implements Cart {

    private double total = 0.0;

    @Override
    public double visit(GameConsole gc) {
        total = +gc.getDelivery() + gc.getPrice();
        return total;
    }

    @Override
    public double visit(Laptop l) {
        total = +l.getDelivery() + l.getPrice();
        return total;
    }

    @Override
    public double visit(Mouse m) {
        total = +m.getDelivery() + m.getPrice();
        return total;
    }

    @Override
    public double visit(SmartWatch sw) {
        total = +sw.getDelivery() + sw.getPrice();
        return total;
    }

}
