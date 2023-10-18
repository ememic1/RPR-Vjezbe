// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner; // Korištene biblioteke
public class Sabiranje {
    public static void main(String[] args) {
        int br1, br2, rez; // Deklarišemo promjenljive
        Scanner ulaz = new Scanner(System.in); // Ulazni objekat
        System.out.println("Unesite prvi broj: ");
        br1 = ulaz.nextInt();
        System.out.println("Unesite drugi broj: ");
        br2 = ulaz.nextInt();
        rez = br1 + br2;
        System.out.println("Rezultat:" + rez);
    }
}