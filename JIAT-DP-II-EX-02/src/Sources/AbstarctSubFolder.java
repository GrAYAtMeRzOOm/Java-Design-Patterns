/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sources;

import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author grays
 */
public abstract class AbstarctSubFolder extends DefaultMutableTreeNode {

    public int getCount() {
        return 1;
    }

    public abstract double getSize();

    public abstract String getName();
}
