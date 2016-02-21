package src.ex2;

/**
 * Created by Panos on 21-Feb-16.
 */
public class Circle implements Shape{

    public double radius;

    public Circle(double r) {
        radius = r;
    }

    public double area(){
        return Math.PI*Math.sqrt(radius);
    }

    public String Shape() {
        return "I'm a circle ";
    }
}
