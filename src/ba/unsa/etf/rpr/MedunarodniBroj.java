package ba.unsa.etf.rpr;
import java.util.Objects;

public class MedunarodniBroj extends TelefonskiBroj {
    private String drzava;
    private String broj;
    public MedunarodniBroj(String drzava, String broj) {
        this.drzava = drzava;
        this.broj = broj;
    }

    @Override
    public String toString() {
        return drzava + "/" + broj;
    }
    @Override
    public String ispisi() {
        return this.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(drzava, broj);
    }
}
