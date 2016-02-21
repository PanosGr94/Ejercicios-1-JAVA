package src.main;

import src.Tree;

/**
 * Created by Panos on 21-Feb-16.
 */

public class App {
    public static void main(String args[]) {

        Tree[] arboles = new Tree[4];
        arboles[0] = new Tree(4);
        arboles[1] = new Tree("Roble");
        arboles[2] = new Tree();
        arboles[3] = new Tree(5,"Pino");
    }

   // System.out.println("Un arbol de" +arboles[0] );
}
