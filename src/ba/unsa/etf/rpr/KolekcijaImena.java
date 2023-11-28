package ba.unsa.etf.rpr;
import java.util.ArrayList;
public class KolekcijaImena {
    private ArrayList<String> imeIPrezime;

    public KolekcijaImena (ArrayList<String> imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }
    public String getNajduzeIme() {
        if(imeIPrezime.isEmpty()) return null;
        String najduzeImeIPrezime = imeIPrezime.getFirst();

        for(String ime : imeIPrezime) {
            if(ime.length() > najduzeImeIPrezime.length()) {
                najduzeImeIPrezime = ime;
            }
        }
        return najduzeImeIPrezime;
    }
}
