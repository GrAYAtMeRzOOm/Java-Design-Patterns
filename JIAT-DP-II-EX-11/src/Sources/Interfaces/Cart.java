/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sources.Interfaces;

import Sources.GameConsole;
import Sources.Laptop;
import Sources.Mouse;
import Sources.SmartWatch;

/**
 *
 * @author grays
 */
public interface Cart {

    public abstract double visit(GameConsole gc);

    public abstract double visit(Laptop l);

    public abstract double visit(Mouse m);

    public abstract double visit(SmartWatch sw);
}
