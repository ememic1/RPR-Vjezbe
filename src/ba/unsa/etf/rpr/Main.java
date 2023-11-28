package ba.unsa.etf.rpr;
import java.util.ArrayList;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> imena = new ArrayList<>();
        imena.add("Ana Ivanovic");
        imena.add("Marko Markovic");

        KolekcijaImena kolekcijaImena = new KolekcijaImena(imena);
        Pobjednik pobjednik1 = new Pobjednik(kolekcijaImena);
        System.out.println(pobjednik1);

        ArrayList<String> prezimena = new ArrayList<>();
        prezimena.add("Ivanovic");
        prezimena.add("Markovic");

        KolekcijaImenaIPrezimena kolekcijaImenaIPrezimena = new KolekcijaImenaIPrezimena(imena, prezimena);
        int najduziIndex = kolekcijaImenaIPrezimena.getIndexNajduzegPara();
        System.out.println("Najduži par: " + kolekcijaImenaIPrezimena.getImeiPrezime(najduziIndex));
        Pobjednik pobjednik2 = new Pobjednik(kolekcijaImenaIPrezimena);
        System.out.println(pobjednik2);
    }
}