/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sources;

import java.awt.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

/**
 *
 * @author grays
 */
public class CelleRender extends DefaultTreeCellRenderer {

    @Override
    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus) {
        super.getTreeCellRendererComponent(tree, value, selected, expanded, leaf, row, hasFocus);
        DefaultMutableTreeNode nodo = (DefaultMutableTreeNode) value;
        ImageIcon openIco = new ImageIcon(this.getClass().getResource("../Resources/icons8_opened_folder_16px.png"));
        ImageIcon closeIco = new ImageIcon(this.getClass().getResource("../Resources/icons8_folder_16px.png"));
        ImageIcon leafIco = new ImageIcon(this.getClass().getResource("../Resources/icons8_file_16px.png"));
        if (tree.getModel().getRoot().equals(nodo)) {
            setIcon(openIco);
        } else if (nodo.getChildCount() > 0) {
            setIcon(closeIco);
        } else {
            setIcon(leafIco);
        }
        return this;
    }

    @Override
    public void setBackground(Color c) {
        c = new Color(130, 137, 141);

        super.setBackground(c); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setForeground(Color c) {
        c = new Color(248, 250, 255);
        super.setForeground(c); //To change body of generated methods, choose Tools | Templates.
    }

}
