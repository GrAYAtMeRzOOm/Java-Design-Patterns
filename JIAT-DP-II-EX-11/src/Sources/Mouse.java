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
public class Mouse {

    private String brand;
    private String model;
    private String type;
    private String buttons;
    private double price;
    private double delivery;

    public Mouse(String brand, String model, String type, String buttons, double price, double delivery) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.buttons = buttons;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getButtons() {
        return buttons;
    }

    public void setButtons(String buttons) {
        this.buttons = buttons;
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
        return "\n brand=" + brand + ",\n model=" + model + ",\n type=" + type + ",\n buttons=" + buttons + ",\n price=" + price + ",\n delivery=" + delivery;
    }

}
