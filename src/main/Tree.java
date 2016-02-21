package src.main;

/**
 * Created by Panos on 21-Feb-16.
 */
public class Tree {


    public String type;
    public int height;

    public Tree(int i) {
        height = i;
    }

    public Tree(String h) {
        type = h;
    }


    public Tree() {

    }

    public Tree(int i, String h) {
        height = i;
        type = h;
    }
}
