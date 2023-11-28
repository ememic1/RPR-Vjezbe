package ba.unsa.etf.rpr;
import java.util.ArrayList;
public class KolekcijaImenaIPrezimena {
    private ArrayList<String> imena;
    private ArrayList<String> prezimena;

    public KolekcijaImenaIPrezimena(ArrayList<String> imena, ArrayList<String> prezimena) {
        this.imena = imena;
        this.prezimena = prezimena;
    }

    public int getIndexNajduzegPara() {
        int najduziIndex = 0;
        int najduzaDuljina = 0;

        for (int i = 0; i < imena.size(); i++) {
            String imePrezime = imena.get(i) + prezimena.get(i);
            if (imePrezime.length() > najduzaDuljina) {
                najduzaDuljina = imePrezime.length();
                najduziIndex = i;
            }
        }

        return najduziIndex;
    }

    public String getImeiPrezime(int i) {
        return imena.get(i) + " " + prezimena.get(i);
    }
}
