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
public class Cliente {

    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 4999);

        PrintWriter pr = new PrintWriter(s.getOutputStream());
        pr.println("Hola");
        pr.flush();

        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader bf = new BufferedReader(in);

        String str = bf.readLine();
        System.out.println("Servidor: " + str);

    }
}
