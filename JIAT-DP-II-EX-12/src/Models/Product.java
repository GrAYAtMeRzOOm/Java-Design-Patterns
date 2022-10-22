/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Random;
import java.util.UUID;

/**
 *
 * @author grays
 */
public class Product implements Prototype {

    private final String id;
    private final String brand;
    private final String model;
    private final String type;
    private final int qty;
    private final double price;

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public String getId() {
        return id;
    }

    
    public Product(ProductBuilder cb) {
        this.brand = cb.brand;
        this.model = cb.model;
        this.type = cb.type;
        this.price = cb.price;
        this.qty = cb.qty;
        this.id = cb.id;
    }

    @Override
    public String toString() {
        return "Brand = " + brand
                + "\nModel = " + model
                + "\nType = " + type
                + "\nPrice = " + qty
                + "\nqty = " + price;
    }

    @Override
    public Product clone() {
        return new ProductBuilder().setBrand(brand)
                .setId(UUID.randomUUID().toString())
                .setModel(model)
                .setPrice(price)
                .setType(type)
                .setQty(qty)
                .build();
    }

    public static class ProductBuilder {

        private String id;
        private String brand;
        private String model;
        private String type;
        private double price;
        private int qty;

        public Product build() {
            Product u = new Product(this);
            return u;
        }

        public ProductBuilder setId(String id ){
            this.id = id;
            return this;
        }
        public ProductBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public ProductBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public ProductBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public ProductBuilder setPrice(double ram) {
            this.price = ram;
            return this;
        }
        public ProductBuilder setQty(int qty) {
            this.qty = qty;
            return this;
        }

    }

}
