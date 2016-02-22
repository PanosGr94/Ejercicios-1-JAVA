package src.ex3;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Panos on 22-Feb-16.
 */
public class ErrorHandling {
    public static void main(String args[]) throws FileNotFoundException {

        int sum = 0;
        int count = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Please Enter The Path Of The Text File:");
        String filePath = "C:/Users/Panos/Desktop/" + scan.nextLine();

        File file = new File(filePath);
        Scanner newscan = new Scanner(file);

        while(newscan.hasNextLine()){
            int linenum = newscan.nextInt();
            //try {
                if( linenum > 1000) {
                    System.out.println("Number bigger than 1000, throw Exception!");
                    break;
                    //}catch (Exception e)
                }else{
                    sum = sum + linenum;
                    count++;
                }
            if(!newscan.hasNextLine())
                System.out.println( "The average was " +sum/count);
        }

        scan.close();
        newscan.close();
    }
}
