/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sources.abstarctParents;

import java.util.HashMap;
import sources.PCStructure;

/**
 *
 * @author grays
 */
public abstract class ParentComputer {
    Customization brand;
    Customization model;
    String ram="8GB DDR3";
    String gpu="Nvidia X20 2GB";
    String ssd="Kingston 250GB";

    public ParentComputer(Customization brand, Customization model) {
        this.brand = brand;
        this.model = model;
    }
    public Customization getBrand(){
        return brand;
    }
    public Customization getModel(){
        return model;
    }

    public String getRam() {
        return ram;
    }

    public String getGpu() {
        return gpu;
    }

    public String getSsd() {
        return ssd;
    }
    
    public abstract PCStructure assemble();
}
