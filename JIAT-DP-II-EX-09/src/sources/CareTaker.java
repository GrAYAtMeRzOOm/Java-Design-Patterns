/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sources;

import java.util.Stack;

/**
 *
 * @author grays
 */
public class CareTaker {

    private final Stack<Memento> mementos = new Stack<>();

    public void addNewMemento(Memento m) {
        mementos.push(m);
    }
    
    public void clearAll(){
        mementos.clear();
    }
    
    public Memento getMemento(){
        if(mementos.isEmpty()){
            return mementos.push(new Memento(new Axis(0, 0)));
        }else{
            return mementos.pop();
        }
    }
}
