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
public class Originator {

    private Axis aixis;
    private final CareTaker careTaker = new CareTaker();

    public void setAixis(Axis aixis) {
        this.aixis = aixis;
    }

    public void clear() {
        careTaker.clearAll();
    }

    public void save() {
        careTaker.addNewMemento(new Memento(aixis));
    }

    public Axis undoAxis() {
        return careTaker.getMemento().getAixis();
    }

}
