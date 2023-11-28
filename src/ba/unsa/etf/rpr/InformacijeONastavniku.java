package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class InformacijeONastavniku extends LicneInformacije implements MozeOcijeniti, Predstavljiv {
    /*private String ime;
    private String prezime;*/
    private String titula;

    private ArrayList<Ocjena> ocjene;

    public String getTitula() {
        return titula;
    }

    public void setTitula(String titula) {
        this.titula = titula;
    }

    public String predstavi() {
        return "str";
    }


    public Ocjena ocijeni(int x) {
        return null;
    }
}
