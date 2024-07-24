package esercizio1;

public class Main {
    public static void main(String[] args) {
        //creazione nuovo oggetto rettangolo1
        Rettangolo rettangolo1 = new Rettangolo(21, 12);
        Rettangolo rettangolo2 = new Rettangolo(10, 20);
        System.out.println("---------PRIMO RETTANGOLO-----------");
        rettangolo1.stampaRettangolo();
        System.out.println("---------SECONDO RETTANGOLO-----------");
        rettangolo2.stampaRettangolo();

        Rettangolo.stampaDueRettangoli(rettangolo1, rettangolo2);

    }
}
