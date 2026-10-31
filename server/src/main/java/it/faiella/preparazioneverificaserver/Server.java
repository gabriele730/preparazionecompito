package it.faiella.preparazioneverificaserver;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {

int porta= 12345;
Spettacolo spettacoli = new Spettacolo(30);

try (ServerSocket server = new ServerSocket(porta)){
    System.out.println("server in attesa sulla porta " + porta);

    while (true) {
        Socket socket = server.accept();
        new Thread(new Gestoreclient(socket,spettacoli)).start();
        
    }
    
    
} catch (Exception e) {
   System. out.println("errore");
}



    }
}