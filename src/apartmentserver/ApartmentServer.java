/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apartmentserver;

import controller.SocketHandle;
import java.net.DatagramSocket;


public class ApartmentServer {

    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            int port = 9999;
            DatagramSocket serverSocket = new DatagramSocket(port);
            SocketHandle server = new SocketHandle(serverSocket);
            server.run();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
