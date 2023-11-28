package ba.unsa.etf.rpr;

public class InformacijeOStudentu extends LicneInformacije {
    /*private String ime;
    private String prezime;*/
    private String godinaStudija;
    private String brojIndexa;

    public String getGodinaStudija() {
        return godinaStudija;
    }

    public void setGodinaStudija(String godinaStudija) {
        this.godinaStudija = godinaStudija;
    }

    public String getBrojIndexa() {
        return brojIndexa;
    }

    public void setBrojIndexa(String brojIndexa) {
        this.brojIndexa = brojIndexa;
    }

    public String predstavi() {
        return "str";
    }
}
