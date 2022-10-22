/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sources;

/**
 *
 * @author grays
 */
public class Number implements ArithmaticValue {

    String text;

    public Number(String text) {
        this.text = text;
    }

    @Override
    public double interpretSum() {
        double value = Double.parseDouble(text);
        return value;
    }
}
