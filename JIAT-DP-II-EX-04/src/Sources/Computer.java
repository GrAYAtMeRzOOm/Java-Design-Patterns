/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sources;

/**
 *
 * @author grays
 */
public class Computer {

    private final String brand;
    private final String model;
    private final String processor;
    private final String ram;
    private final String gpu;
    private final String ssd;

    public String getProcessor() {
        return processor;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
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

    public Computer(ComputerBuilder cb) {
        this.brand = cb.brand;
        this.model = cb.model;
        this.processor = cb.processor;
        this.ram = cb.ram;
        this.gpu = cb.gpu;
        this.ssd = cb.ssd;
    }

    @Override
    public String toString() {
        return "Brand = " + brand
                + "\nModel = " + model
                + "\nProcessor = " + processor
                + "\nRAM = " + ram
                + "\nGPU = " + gpu
                + "\nSSD = " + ssd;
    }

    public static class ComputerBuilder {

        private String brand;
        private String model;
        private String processor;
        private String ram;
        private String gpu;
        private String ssd;

        public Computer build() {
            Computer u = new Computer(this);
            return u;
        }

        public ComputerBuilder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public ComputerBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public ComputerBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public ComputerBuilder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public ComputerBuilder setSsd(String ssd) {
            this.ssd = ssd;
            return this;
        }

    }

}
