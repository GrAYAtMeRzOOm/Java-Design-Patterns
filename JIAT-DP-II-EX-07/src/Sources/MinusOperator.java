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
public class MinusOperator implements ArithmaticValue{

    ArithmaticValue value1;
    ArithmaticValue value2;

    public MinusOperator(ArithmaticValue value1, ArithmaticValue value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    @Override
    public double interpretSum() {
       return value1.interpretSum()- value2.interpretSum();
    }   
}
