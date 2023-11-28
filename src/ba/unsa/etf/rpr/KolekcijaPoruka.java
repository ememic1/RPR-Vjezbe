package ba.unsa.etf.rpr;
import java.util.ArrayList;
public class KolekcijaPoruka implements Predstavljiv {
    private ArrayList<String> poruke;

    public String predstavi() {
        return "str";
    }

    public KolekcijaPoruka(ArrayList<Predstavljiv> lista) {
        for(int i=0; i<lista.size(); i++) {
            //if(lista.get(i) instanceof Predstavljiv) {
                poruke.add(lista.get(i).predstavi());
            //}
        }
    }
    public ArrayList<String> getPoruke() {
        return poruke;
    }
}
