package esercizio2;

import java.util.LinkedList;
import java.util.Queue;

public class Sim {
    //ATTRIBUTI
    private String numeroTelefono;
    private int credito;
    private Queue<Chiamata> chiamate;

    //COSTRUTTORI
    public Sim(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.credito = 0;
        this.chiamate = new LinkedList<>();
    }

    public void stampaDatiSim() {
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Credito disponibile: " + credito);
        System.out.println("Ultime 5 chiamate effettuate:");
        System.out.println(chiamate);
    }

    public void aggiungiChiamata(String numChiamato, int durataChiamata) {

        chiamate.add(new Chiamata(numChiamato, durataChiamata));
    }
}
