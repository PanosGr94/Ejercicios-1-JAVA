package src.ex2;

import java.awt.*;

/**
 * Created by Panos on 21-Feb-16.
 */
public class AppInheritance {
    public static void main(String args[]){
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(2.5);
        shapes[1] = new Rectangle(3,5);
        for( Shape shape : shapes)
            System.out.println(shape.Shape() + "with area = " +shape.area());

    }
}
