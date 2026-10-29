package it.faiella.preparazioneverificaserver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Clienthandler   implements Runnable {

private Socket socket;
public Clienthandler(Socket socket){
    this.socket=socket;
}


@Override
public void run() {
    try(BufferedReader in = new BufferedReader(
    new InputStreamReader(socket.getInputStream())
);

PrintWriter out = new PrintWriter(
    socket.getOutputStream(), true
)){
out.println("MESSAGGIO");


String risposta = in.readLine();

        
    } catch (Exception e) {
      
    }
   
    throw new UnsupportedOperationException("Unimplemented method 'run'");
}
    
}
