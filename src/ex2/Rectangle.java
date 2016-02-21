package src.ex2;

/**
 * Created by Panos on 22-Feb-16.
 */
public class Rectangle implements Shape {


    public int x,y;

    public Rectangle(int a, int b){
        x = a;
        y = b;
    }

    public double area(){
        return x*y;
    }

    public String Shape(){
        return "I'm a rectangle ";
    }
}
