// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesite n: ");
        int n = ulaz.nextInt();

        for (int i = 1; i <= n; i++) {
            if(daLiJeDijeljivSaSumomCifara(i)) System.out.println(i);
        }
    }

    private static boolean daLiJeDijeljivSaSumomCifara (int a) {
        return a % sumaCifara(a) == 0;
    }

    private static int sumaCifara (int a) {
        int suma=0;
        while(a>0) {
            suma = suma + a%10;
            a = a / 10;
        }
        return suma;
    }

}