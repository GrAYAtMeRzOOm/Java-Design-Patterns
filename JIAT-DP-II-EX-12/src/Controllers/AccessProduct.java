/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Product;
import Models.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author grays
 */
public class AccessProduct {

    private static final List<Product> PRODUCTLIST = new ArrayList<>();

    public static boolean saveProduct(Product p) {
        boolean add = PRODUCTLIST.add(p);
        return add;
    }

    public static Product getProductByID(String id) {
        Product p = null;
        for (Product product : PRODUCTLIST) {
            if (product.getId().equals(id)) {
                p = product;
            }
        }
        return p;
    }
    public static Product getProductAt(int id) {
        Product p = PRODUCTLIST.get(id);
        return p;
    }

    public static Product getuserByModel(String model) {
        Product p = null;
        for (Product product : PRODUCTLIST) {
            if (product.getModel().equals(model)) {
                p = product;
            }
        }
        return p;
    }

    public static List<Product> getAll() {
        return PRODUCTLIST;
    }

    public static Product getProductByModelandBrand(String model, String brand) {
        Product p = null;
        for (Product product : PRODUCTLIST) {
            if (product.getModel().equals(model) && product.getBrand().equals(brand)) {
                p = product;
            }
        }
        return p;
    }
    public static void removeProductByModelandBrand(String model, String brand) {
        for (int i = 0; i < PRODUCTLIST.size(); i++) {
            if (PRODUCTLIST.get(i).getModel().equals(model) && PRODUCTLIST.get(i).getBrand().equals(brand)) {
               PRODUCTLIST.remove(i);
            }
        } 
    }
    public static Product updateProduct(Product p) {
        for (int i = 0; i < PRODUCTLIST.size(); i++) {
            if (PRODUCTLIST.get(i).getId().equals(p.getId())) {
               PRODUCTLIST.remove(i);
               PRODUCTLIST.add(p);
            }
        }
        return p;
    }
    
}
