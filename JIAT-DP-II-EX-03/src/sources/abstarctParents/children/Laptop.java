/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sources.abstarctParents.children;

import sources.PCStructure;
import sources.abstarctParents.Customization;
import sources.abstarctParents.ParentComputer;

/**
 *
 * @author grays
 */
public class Laptop extends ParentComputer{

    public Laptop(Customization brand, Customization model) {
        super(brand, model);
    }

    @Override
    public PCStructure assemble() {
       PCStructure pcStructure = new PCStructure();
        pcStructure.setBrand(getBrand().getName());
        pcStructure.setModel(getModel().getName());
        pcStructure.setGpu(getGpu());
        pcStructure.setRam(getRam());
        pcStructure.setSsd(getSsd());
        pcStructure.setType("Laptop");
        return pcStructure;
    }
    
}
