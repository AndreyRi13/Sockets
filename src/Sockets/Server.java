/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sockets;

import java.io.*;
import java.net.*;

/**
 *
 * @author Andrey R
 */
public class Server {

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(4999);
        Socket s = ss.accept();

        System.out.println("Cliente conectado");

        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader bf = new BufferedReader(in);

        String str = bf.readLine();
        System.out.println("Cliente: " + str);

        PrintWriter pr = new PrintWriter(s.getOutputStream());
        pr.println("Hola soy el servidor");
        pr.flush();

    }

}
