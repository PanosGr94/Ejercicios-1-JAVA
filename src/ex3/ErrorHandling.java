package src.ex3;

import com.sun.xml.internal.bind.v2.TODO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Panos on 22-Feb-16.
 */
public class ErrorHandling {
    public static void main(String args[]) throws Exception {

        int sum = 0;
        int count = 0;
        Scanner scan = new Scanner(System.in);


// TODO: 22-Feb-16 Erase desktop suffix
        System.out.print("Please Enter The Path Of The Text File:");
        String filePath = "C:/Users/Panos/Desktop/" + scan.nextLine();

        File file = new File(filePath);
        Scanner newscan = new Scanner(file);


        try {
            while (newscan.hasNextLine()) {
                int linenum = newscan.nextInt();

                sum = sum + linenum;
                count++;

                if (linenum > 1000) {
                    int errorline = count;
                    throw new BigNumberException("At line number " + errorline);
                }


                if (!newscan.hasNextLine())
                    System.out.println("The average was " + sum / count);

            }
        } catch (BigNumberException error) {
            System.out.println(error);
            System.out.println("Number bigger than 1000, throw BigNumberException!");
        } catch (IOException ioe) {
            throw new FileParsingException(ioe);
        }catch (NumberFormatException nfe){
            throw new FileParsingException(nfe);
        }finally {

        }


        scan.close();
        newscan.close();
    }


}
