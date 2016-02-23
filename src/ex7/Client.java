package src.ex7;

import java.io.*;
import java.net.*;
import java.lang.*;
import java.util.Scanner;

/**
 * Created by Panos on 23-Feb-16.
 */
public class Client {

    public static void main(String args[]) {

        String host ="";
        int port =-1;
        Scanner in, in2;

        do {
            System.out.print("Please enter host name (localhost): ");
            in = new Scanner(System.in);
            host = in.nextLine();
        }while(host.isEmpty());


        do {
            System.out.print("Please enter (positive) port number (12345): ");
            in2 = new Scanner(System.in);
            port = in2.nextInt();
        }while(port < 0);

        try {
            Socket skt = new Socket(host, port);
            BufferedReader inputSR = new BufferedReader(new
                    InputStreamReader(skt.getInputStream()));
            System.out.print("Received string: ");

            while (!inputSR.ready()) {}
            System.out.println(inputSR.readLine());

            in.close();
            in2.close();
            inputSR.close();
        }
        catch(Exception e) {
            System.out.println("Client did not connect successfully");
            System.out.println("Please try connecting (executing) the Server first !");
        }
    }
}
