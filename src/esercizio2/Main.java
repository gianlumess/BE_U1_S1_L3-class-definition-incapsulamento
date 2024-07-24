package esercizio2;

public class Main {
    public static void main(String[] args) {
        Sim sim1 = new Sim("123456789");
        //aggiungo le chiamate alla lista
        sim1.aggiungiChiamata("22222222222", 4);

        sim1.stampaDatiSim();
    }
}
