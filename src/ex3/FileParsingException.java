package src.ex3;

import java.io.IOException;

/**
 * Created by Panos on 22-Feb-16.
 */
public class FileParsingException extends Exception{

    public FileParsingException(IOException Message){
        System.out.println("IO Exception redirected from FPEx: " + Message);
    }

    public FileParsingException(NumberFormatException Message){
        System.out.println("NumberFormatException redirected from FPEx: " + Message);
    }
}
