package semestralka;

import java.util.Scanner;;

public class Marathon {
    public static void main(String[] args) {

        // PRO ZKOUŠKU - 5 1 11 23 46 2 11 21 48 4 11 21 23 12 11 16 39 13 11 23 16

        Scanner mp = new Scanner(System.in);

        final int HH = 9; // hodiny - Start závodu
        final int MM = 15; // minuty - Start závodu
        final int SS = 0; // sekundy - Start závodu

        final int START = HH * 3600 + MM * 60 + SS; // Start závodu v sekudnách
        final int DELKA = 42195; // Vzdálenost závodu
        double prumer;  // prumer nejrychlejsiho bezce bezec[best][1]

        int pocetBezcu = mp.nextInt();

        int rychlik = 0;
        int best = -1; // cislo nejrychlejsiho
        int worst = 0;

        int bezec[][] = new int[pocetBezcu][2];

        for (int i = 0; i < pocetBezcu; i++) {

            bezec[i][0] = mp.nextInt();
            bezec[i][1] = mp.nextInt() * 3600 + mp.nextInt() * 60 + mp.nextInt() - START; // Zde se ukládá čas za
                                                                                          // který uběhl danou
                                                                                          // vzdálenost
            if (bezec[i][1] < 7620) {
                rychlik = rychlik + 1;
            }

            if (best != -1) {

                if (bezec[best][1] > bezec[i][1]) {
                    best = i;
                }

                if (bezec[i][1] > bezec[worst][1]) {

                    worst = i;
                }

            } else {

                best = i;
                worst = i;

            }

        }

        prumer = (DELKA / 1000.) / (bezec[best][1] / 3600.);

        System.out.println(rychlik + " bezci bezeli pod 2:07");
        System.out.println("Cislo nejrychlejsiho bezce je " + bezec[best][0] + ".");
        System.out.print("Posledni bezec mel ztratu na prvniho ");
        if ((bezec[worst][1] - bezec[best][1]) / 60 < 10) {
            System.out.print("0" + (bezec[worst][1] - bezec[best][1]) / 60 + ":");
        } else {
            System.out.print((bezec[worst][1] - bezec[best][1]) / 60 + ":");
        }

        if ((bezec[worst][1] - bezec[best][1]) % 60 <= 10) {
            System.out.println("0" + ((bezec[worst][1] - bezec[best][1]) % 60) + ".");
        } else {
            System.out.println(((bezec[worst][1] - bezec[best][1]) % 60) + ".");
        }

        System.out.print("Prumerna rychlost nejrychlejsiho bezce byla ");
        System.out.printf("%.2f", prumer);
        System.out.println(" km/h.");
    }
}
