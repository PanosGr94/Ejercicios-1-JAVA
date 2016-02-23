package src.ex7;

import java.io.*;
import java.net.*;
import java.lang.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Panos on 23-Feb-16.
 */
public class Server {
    public static void main(String args[]) {

        Date time = new Date();
        String data = DateFormat.getDateTimeInstance(
                DateFormat.SHORT, DateFormat.LONG).format(time);

        int port = 0;
        System.out.print("Please enter port number (12345): ");
        Scanner in = new Scanner(System.in);
        port = in.nextInt();
        if(port == 0)
            port= 12345;

        try {
            ServerSocket srvr = new ServerSocket(port);
            Socket skt = srvr.accept();
            System.out.println("Server connection established!");
            PrintWriter out = new PrintWriter(skt.getOutputStream(), true);
            System.out.println("Sending string: " + data );
            out.print(data);
            out.close();
            skt.close();
            srvr.close();
        }
        catch(Exception e) {
            System.out.print("Server did not connect succesfully.");
        }
    }
}
