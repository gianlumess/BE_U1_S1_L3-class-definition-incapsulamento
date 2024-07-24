package esercizio2;


public class Chiamata {
    // ATTRIBUTI
    private String numChiamato;
    private int durataChiamata;

    // COSTRUTTORI
    public Chiamata(String numChiamato, int durataChiamata) {
        this.numChiamato = numChiamato;
        this.durataChiamata = durataChiamata;
    }

    //GETTER AND SETTER
    public String getNumChiamato() {
        return numChiamato;
    }

    public void setNumChiamato(String numChiamato) {
        this.numChiamato = numChiamato;
    }

    public int getDurataChiamata() {
        return durataChiamata;
    }

    public void setDurataChiamata(int durataChiamata) {
        this.durataChiamata = durataChiamata;
    }
}
