package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            if(args.length == 0 ){
                System.out.println("Unesite broj: ");
                Scanner unos = new Scanner(System.in);
                int broj = unos.nextInt();
                System.out.println("Faktorijel broja je " + Faktorijel.factorial(broj));
                System.out.println("Sinus broja je " + Sinus.sin(broj));
            }
            else {
                if(args[0].equals("sin")) System.out.println(Sinus.sin(Integer.parseInt(args[1])));
                else System.out.println(Faktorijel.factorial(Integer.parseInt(args[1])));
            }
    }
}