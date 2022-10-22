/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sources;

import java.awt.Color;
import java.util.HashMap;

/**
 *
 * @author grays
 */
public class ShapeFactory {

    private static final HashMap<String, Shape> SHAPE_POOL = new HashMap<>();

    public static Shape getShape(Color color, int size) {

        Shape shape = SHAPE_POOL.get(color.getRGB() + "" + size);

        if (shape == null) {

            shape = new Shape(color);
            SHAPE_POOL.put(color.getRGB() + "" + size, shape);
            System.out.println("-------Created and Saved---------");
        } else {
            System.out.println("******Used the Saved Shape *********");
        }
        return shape;

    }
}
