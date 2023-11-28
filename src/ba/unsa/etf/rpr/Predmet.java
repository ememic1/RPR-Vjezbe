package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Predmet {
    private String naziv;
    private String opis;

    private ArrayList<Ocjena> ocjene;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String predstavi() {
        return "oop";
    }
}
