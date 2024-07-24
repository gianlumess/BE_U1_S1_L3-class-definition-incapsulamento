package esercizio1;

public class Rettangolo {
    // ATTRIBUTI
    public double larghezza;
    public double altezza;

    // COSTRUTTORI
    public Rettangolo(double larghezza, double altezza) {
        this.larghezza = larghezza;
        this.altezza = altezza;
    }

    // METODI
    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("-Primo rettangolo:");
        r1.stampaRettangolo();

        System.out.println("-Secondo rettangolo:");
        r2.stampaRettangolo();

        double sommaAree = r1.getArea() + r2.getArea();
        System.out.println("Somma delle aree: " + sommaAree);

        double sommaPerimetri = r1.getPerimetro() + r2.getPerimetro();
        System.out.println("Somma dei perimetri: " + sommaPerimetri);
    }


    public double getPerimetro() {
        return 2 * (this.larghezza + this.altezza);
    }

    public double getArea() {
        return this.larghezza * this.altezza;
    }

    // Metodo per stampare area e perimetro del rettangolo
    public void stampaRettangolo() {
        double perimetro = getPerimetro();
        double area = getArea();
        System.out.println("PERIMETRO: " + perimetro);
        System.out.println("AREA: " + area);
    }
}


