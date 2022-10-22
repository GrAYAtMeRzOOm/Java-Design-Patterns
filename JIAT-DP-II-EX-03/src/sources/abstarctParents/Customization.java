/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sources.abstarctParents;

/**
 *
 * @author grays
 */
public abstract class Customization {
    private String name;

    public String getName() {
        return name;
    }

    public Customization(String name) {
        this.name = name;
    }
    
}
