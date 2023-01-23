package 20PesekMSemestralProject;

import java.util.Scanner;

public class CashRegister {
    public static void main(String[] args) {

        // ZKOUŠKA - 19,90 5 1 63,20 2 1 25,90 1 2 0

        Scanner mp = new Scanner(System.in);

        double cena;
        double cenaPotravin = 0;
        double celkemCena = 0;
        double minCena = -1;

        int pocet; // Pocet zadaneho zbozi
        int p_d; // Potraviny_Drogerie
        int mnoztviPotravin = 0; // pocet potravin

        System.out.println("CENA - POCET - POTRAVINY 1 / DROGERIE 2");

        while ((cena = mp.nextDouble()) != 0) {
            pocet = mp.nextInt();
            p_d = mp.nextInt();
            celkemCena = celkemCena + cena * pocet;
            if (p_d == 1) {
                mnoztviPotravin = mnoztviPotravin + pocet;
                cenaPotravin = cenaPotravin + cena * pocet;
                if (minCena != -1) {
                    if (minCena >= cena) {
                        minCena = cena;
                    }
                } else {
                    minCena = cena;
                }
            }
            System.out.print("Predbezna suma - ");
            System.out.printf("%.2f", celkemCena);
            System.out.println();
        }

        System.out.print("\nCelkova cena - ");
        System.out.printf("%.2f", celkemCena);
        System.out.println();
        System.out.println("Zaokrouhlena cena - " + Math.round(celkemCena));
        System.out.println("Mnozstvi potravin - " + mnoztviPotravin);
        System.out.print("Celkova cena potravin - ");
        System.out.printf("%.2f", cenaPotravin);
        System.out.println();
        System.out.print("Minimalni cena za polozku - ");
        System.out.printf("%.2f", minCena);
        System.out.println();

        if (celkemCena >= 200) {
            System.out.println("Ma narok na tento pocet samolepek - " + Math.floor(celkemCena / 200));
        } else {
            System.out.println("Nema narok na zadnou samolepku");
        }

    }
}
