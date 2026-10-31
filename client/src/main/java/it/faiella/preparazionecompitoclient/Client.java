package it.faiella.preparazionecompitoclient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
       
int porta =12345;
String host ="Localhost";

Scanner tastiera = new Scanner(System.in);
try (Socket socket = new Socket(host, porta)) {
BufferedReader in = new BufferedReader( new InputStreamReader(socket.getInputStream()));

    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
    boolean esci=false;
    String comando;
while(!esci){

        System.out.println();
        System.out.println("1. Consulta i posti disponibili");
        System.out.println("2. Prenota posti");
        System.out.println("3. Annulla posti");
        System.out.println("0. Esci");
        System.out.print("Scelta: ");


String scelta = tastiera.nextLine().trim();

switch (scelta) {
    case 1 :
comando="POSTI";

    break;

    case 2 :
        comando = "PRENOTA " + tastiera.nextLine().trim();
        break;

        case 3 :
             comando = "ANNULLA " + tastiera.nextLine().trim();
             break;

             case 0 :
               comando = "ESCI";
              esci = true; 

              break;

                  default:
                        System.out.println("Scelta non valida");
                        continue;

}

out.println(comando);
String risposta =in.readLine();

  if (risposta == null) {
                    System.out.println("Connessione chiusa dal server");
                    break;
                }
                  System.out.println(risposta);


}



} catch (Exception e) {
  System.out.println(e.getMessage());
}








    }
}