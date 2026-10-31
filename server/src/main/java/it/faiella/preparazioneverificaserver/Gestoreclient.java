package it.faiella.preparazioneverificaserver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public  class Gestoreclient implements Runnable{

    private  final Socket socket;
    private  final Spettacolo spettacolo;
    private boolean uscita =false;

public Gestoreclient(Socket socket , Spettacolo spettacolo){
    this.socket = socket;
    this.spettacolo=spettacolo;
}





    @Override
    public void run() {
     try (BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
     PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {
       
        String riga;





























     } catch (Exception e) {
        // TODO: handle exception
     }

    }

    
}