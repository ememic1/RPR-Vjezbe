package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Set;

class ImenikTest {

    @Test
    void dodaj() {
        Imenik imenik = new Imenik();
        imenik.dodaj("Emir Memic", new FiksniBroj(Grad.SARAJEVO,"123-456"));
        imenik.dodaj("XY", new MobilniBroj(62 ,"222-222"));
        imenik.dodaj("Ime Prezime", new MedunarodniBroj("+387","333-333" ));
        Assertions.assertEquals("033/123-456", imenik.dajBroj("Emir Memic"));
    }

    @Test
    void izGrada() {
        Imenik imenik = new Imenik();
        imenik.dodaj("Emir", new FiksniBroj(Grad.SARAJEVO,"111-111"));
        imenik.dodaj("XY", new MobilniBroj(62 ,"222-222"));
        imenik.dodaj("Ime Prezime", new MedunarodniBroj("387","333-333" ));
        Set<String> set = imenik.izGrada(Grad.SARAJEVO);
        String imena = "";
        for (String ime : set)
            imena += ime + ", ";

        Assertions.assertEquals("Emir, ", imena);
    }

    @Test
    void dajBroj() {
        Imenik imenik = new Imenik();
        imenik.dodaj("Emir", new MobilniBroj(62, "987654"));
        Assertions.assertEquals("062/987654", imenik.dajBroj("Emir"));
    }
}