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
public class GameConsole {

    private String brand;
    private String model;
    private String ram;
    private String graphics;
    private double price;
    private double delivery;

    public GameConsole(String brand, String model, String ram, String graphics, double price, double delivery) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.graphics = graphics;
        this.price = price;
        this.delivery = delivery;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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

    public String getGraphics() {
        return graphics;
    }

    public void setGraphics(String graphics) {
        this.graphics = graphics;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDelivery() {
        return delivery;
    }

    public void setDelivery(double delivery) {
        this.delivery = delivery;
    }

    @Override
    public String toString() {
        return "\n brand=" + brand + ",\n model=" + model + ",\n ram=" + ram + ",\n graphics=" + graphics + ",\n price=" + price + ",\n delivery=" + delivery ;
    }
    
    
}
