/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sources;

import java.util.ArrayList;

/**
 *
 * @author grays
 */
public class SubFile extends AbstarctSubFolder{

    String name;
    double size;

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSize() {
       return size;
    }
}
