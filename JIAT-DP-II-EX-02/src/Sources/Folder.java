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
public class Folder extends AbstarctSubFolder {

    String Name;
    double size;

    private ArrayList<AbstarctSubFolder> abstarctSubFolders = new ArrayList<>();

    public void addSubfolder(AbstarctSubFolder sub) {
        abstarctSubFolders.add(sub);
    }

    public int getlistCount() {
        return abstarctSubFolders.size();
    }

    @Override
    public double getSize() {
        double val = size;
        for (AbstarctSubFolder abstarctSubFolder : abstarctSubFolders) {
            if (abstarctSubFolder instanceof Folder) {
                val = val + ((Folder) abstarctSubFolder).getSize();
            } else {
                val = val + ((SubFile) abstarctSubFolder).getSize();
            }
        }
        return val;
    }

    @Override
    public int getCount() {
        int val = getlistCount();
        for (AbstarctSubFolder abstarctSubFolder : abstarctSubFolders) {
            if (abstarctSubFolder instanceof Folder) {
                val = val + ((Folder) abstarctSubFolder).getCount();
            }
        }
        return val;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String getName() {
        return Name;
    }
}
