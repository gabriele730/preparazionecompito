package it.faiella.preparazioneverificaserver;

public class Spettacolo {

int capienza;
int posti;
public Spettacolo(int capienza){
    this.capienza=capienza;
    this.posti=capienza;
}

public synchronized  int postidisponibili(){
    return posti;

}

    
public synchronized String  prenotazione(int q ){
    if (q>posti) {
        
        return  "posti finiti";
    }
    posti-=q;
    return "prenotazione avvenuta ";
     }

    
public  synchronized String annulla(int q ){

    int possibili = capienza-posti;
    if (q> possibili) {
      return "errore annullamento impossibile ";  
    }
   posti+=q;
        return"annullamento eseguito"; 
    

}



}
