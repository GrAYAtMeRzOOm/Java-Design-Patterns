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
public class PCStructure {
    private String type;
    private String model;
    private String ram;
    private String gpu;
    private String ssd;
    private String brand;

    public PCStructure(String type, String model, String ram, String gpu, String ssd, String brand) {
        this.type = type;
        this.model = model;
        this.ram = ram;
        this.gpu = gpu;
        this.ssd = ssd;
        this.brand = brand;
    }

    public PCStructure() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    
}
