package ba.unsa.etf.rpr;

public class FiksniBroj extends TelefonskiBroj {
    private Grad grad;
    private String broj;

    public FiksniBroj(Grad grad, String broj) {
        this.grad = grad;
        this.broj = broj;
    }

    public Grad dajGrad() {
        return this.grad;
    }

    @Override
    public String ispisi() {
        return grad + "/" + broj;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
