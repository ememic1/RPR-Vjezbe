package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Pobjednik {
    private String ime;
    private String prezime;
    private int brojZnakova;

    public Pobjednik(KolekcijaImena kolekcijaImena) {
        String najduzeIme = kolekcijaImena.getNajduzeIme();
        String[] dijeloviImena = najduzeIme.split(" ");
        this.ime = dijeloviImena[0];
        this.prezime = dijeloviImena[1];
        this.brojZnakova = najduzeIme.length();
    }

    public Pobjednik(KolekcijaImenaIPrezimena kolekcijaImenaIPrezimena) {

    }

    @Override
    public String toString() {
        return "Pobjednik: " + ime + " " + prezime + ", Broj znakova: " + brojZnakova;
    }
}
