TCPServer.java:

import java.io.*;
import java.net.*;

public class TCPServer {

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(5000);

            System.out.println("Server Started...");

            Socket socket = serverSocket.accept();

            System.out.println("Client Connected");

            BufferedReader in =
                    new BufferedReader(
                            new InputStreamReader(socket.getInputStream()));

            PrintWriter out =
                    new PrintWriter(socket.getOutputStream(), true);

            String message = in.readLine();

            System.out.println("Client: " + message);

            out.println("Hello Client");

            socket.close();
            serverSocket.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


TCPClient.java:

import java.io.*;
import java.net.*;

public class TCPClient {

    public static void main(String[] args) {

        try {

            Socket socket = new Socket("localhost", 5000);

            BufferedReader in =
                    new BufferedReader(
                            new InputStreamReader(socket.getInputStream()));

            PrintWriter out =
                    new PrintWriter(socket.getOutputStream(), true);

            out.println("Hello Server");

            System.out.println(in.readLine());

            socket.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

/*
Output:

10
20
30
*/

