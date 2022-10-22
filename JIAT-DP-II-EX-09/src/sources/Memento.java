/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sources;

/**
 *
 * @author grays
 */
public class Memento {
    private final Axis aixis;

    public Memento(Axis aixis) {
        this.aixis = aixis;
    }

    public Axis getAixis() {
        return aixis;
    }
}
