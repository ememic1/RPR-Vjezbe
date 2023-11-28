package ba.unsa.etf.rpr;

public class Ocjena {
    private LicneInformacije osoba;
    private int ocjena;

    public void setOcjena(int x) {
        if(x<1 || x>10) {
            throw new IndexOutOfBoundsException("izvan opsega");
        }
        this.ocjena = x;
    }

    public Ocjena (LicneInformacije osoba, int ocjena) {
        this.osoba = osoba;
        this.ocjena = ocjena;
    }
}
