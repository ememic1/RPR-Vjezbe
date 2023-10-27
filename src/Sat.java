// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Sat {
    private int sati, minute, sekunde;

    public Sat(int sati, int minute, int sekunde) {
        Postavi(sati, minute, sekunde);
    }
    public void Postavi(int sati, int minute, int sekunde) {
        this.sati = sati;
        this.minute = minute;
        this.sekunde = sekunde;
    }

    public void Sljedeci() {
        sekunde++;
        if(sekunde==60) {
            sekunde = 0;
            minute++;
        }
        if(minute==60) {
            minute = 0;
            sati++;
        }
        if(sati==24) {
            sati = 0;
        }
    }

    void Prethodni() {
        sekunde--;
        if (sekunde==-1) { sekunde=59; minute--; }
        if (minute==-1) { minute=59; sati--; }
        if (sati==-1) sati=23;
    }

    public void PomjeriZa(int pomak) {
        if (pomak > 0) for (int i = 0; i<pomak; i++) Sljedeci();
        else for (int i = 0; i<-pomak; i++) Prethodni();
    }

    public int DajSate()  { return sati; }
    public int DajMinute()  { return minute; }
    public int DajSekunde()  { return sekunde; }

    @Override
    public String toString() {
        return "Sat{" +
                "sati=" + sati +
                ", minute=" + minute +
                ", sekunde=" + sekunde +
                '}';
    }

    public static void main(String[] args) {
        Sat s = new Sat(15,30,45);
        System.out.println(s);
        s.Sljedeci();
        System.out.println(s);
        System.out.println(s.DajSate());
        System.out.println(s);
        System.out.println(s.DajMinute());
        System.out.println(s);
        System.out.println(s.DajSekunde());
        s.Sljedeci();
        s.PomjeriZa(35);
        System.out.println(s);
        s.Postavi(10,10,10);
        System.out.println(s);
    }

}