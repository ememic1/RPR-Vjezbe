package ba.unsa.etf.rpr;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {

        

        Imenik imenik = new Imenik();


        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite ime kontakta: ");
        String ime = unos.next();
        System.out.println("Unesite mobilnu mrezu: ");
        int mreza = unos.nextInt();
        System.out.println("Unesite broj: ");
        String broj = unos.next();
        MobilniBroj mobilniBroj = new MobilniBroj(mreza, broj);
        System.out.println(mobilniBroj.ispisi());
        imenik.dodaj(ime, mobilniBroj);


        System.out.println("Unesite ime kontakta: ");
        ime = unos.next();
        Grad grad = Grad.SARAJEVO;
        System.out.println("Unesite broj: ");
        broj = unos.next();
        FiksniBroj fiksniBroj = new FiksniBroj(grad, broj);
        System.out.println(fiksniBroj.ispisi());

        imenik.dodaj(ime, fiksniBroj);

        System.out.println("Unesite ime kontakta: ");
        ime = unos.next();
        System.out.println("Unesite medunarodni broj: ");
        String drzava = unos.next();
        System.out.println("Unesite broj: ");
        broj = unos.next();
        MedunarodniBroj medunarodniBroj = new MedunarodniBroj(drzava, broj);
        System.out.println(medunarodniBroj.ispisi());

        imenik.dodaj(ime, medunarodniBroj);





    }
}