package com.example.lv7;

import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class KorisniciModel {
    private ObservableList<Korisnik> korisniciList;
    private SimpleObjectProperty<Korisnik> trenutniKorisnik;

    public KorisniciModel() {
        this.korisniciList = FXCollections.observableArrayList();
        this.trenutniKorisnik = new SimpleObjectProperty<>();
    }

    public ObservableList<Korisnik> getKorisniciList() {
        return korisniciList;
    }

    public void setKorisniciList(ObservableList<Korisnik> korisniciList) {
        this.korisniciList = korisniciList;
    }

    public Korisnik getTrenutniKorisnik() {
        return trenutniKorisnik.get();
    }

    public SimpleObjectProperty<Korisnik> trenutniKorisnikProperty() {
        return trenutniKorisnik;
    }

    public void setTrenutniKorisnik(Korisnik trenutniKorisnik) {
        this.trenutniKorisnik.set(trenutniKorisnik);
    }

    public void napuni(String ime, String prezime, String email, String korisnicko, String password) {
        Korisnik noviKorisnik = new Korisnik(ime, prezime, email, korisnicko, password);
        korisniciList.add(noviKorisnik);
    }
}
