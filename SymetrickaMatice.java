package 20PesekMSemestralProject;

import java.util.Scanner;

public class SymetrickaMatice {



    /**
     * @CisloSemestralniPrace - 20.
     * 
     * @Author - Michal Pešek
     * 
     * @param args
     */
    public static void main(String[] args) {

        /*
         * ZKOUŠKA PRO FUNKČNOST
         * 1. 3 15 7 16 7 23 -11 16 -11 18 - Matice je symetricka hodnotami
         * 2. 3 15 -8 0 -6 3 2 0 13 -18 - Matice je symetricka strukturou
         * 3. 3 15 7 16 7 23 -11 16 11 18 - Matice je nesymetricka
         * 4. 4 18 6 9 47 2 3 89 4 5 8 9 7 11 59 68 78 - Matice je symetricka strukturou
         * 5. 3 9 9 9 9 8 19 9 19 9 - Matice je symetricka hodnotami
         * 6. 3 -69 52 37 -52 30 44 37 -44 88 - Matice je nesymetricka
         * -1
         */

        Scanner my = new Scanner(System.in);
        int n = 1; // rozmer
        int x; // X jako xová hodnota na grafu/matici X(řádek) - Y(sloupec)

        while (n > 0) {
            x = 0;
            Boolean symvaleu = true; // kontrola symetrie hodnotami
            Boolean symstructure = true; // kontrola symetrie strukturou

            System.out.println("Zadej rozměr matice. Pro ukončení zadej zápornou nebo nulovou hodnotu.");
            n = my.nextInt();
            if (1 > n) {
                break;
            }
            int matice[][] = new int[n][n];
            System.out.println("Zadej hodnoty pro tvou matici.");
            for (int i = 0; i != n; i++) {
                for (int j = 0; j != n; j++) {
                    matice[i][j] = my.nextInt();
                }
            }
            /*
             * --------------------------------------------
             * for (int i = 0; i != n; i++) {
             * if(symstructure==false){
             * break;
             * }
             * for (int j = 0; j != n; j++) {
             * if (i != j) { // zjistovani symetrie hodnotami a strukturou
             * if (matice[i][j] != matice[j][i]) {
             * symvaleu = false;
             * if (matice[i][j] * matice[j][i] <= 0) {
             * symstructure = false;
             * break;
             * }
             * }
             * }
             * }
             * }
             * --------------------------------------------
             * for (int i = 0; i != n; i++) {
             * if(symstructure==false){
             * break;
             * }
             * for (int j = 0; j != n; j++) {
             * if(i == j){
             * break;
             * }else{
             * if (matice[i][j] != matice[j][i]) {
             * symvaleu = false;
             * if (matice[i][j] * matice[j][i] <= 0) {
             * symstructure = false;
             * break;
             * }
             * }
             * }
             * }
             * }
             * --------------------------------------------
             * outerloop:
             * for (int i = 0; i < n; i++) {
             * for (int j = 0; j < n; j++) {
             * if (i == j) {
             * break;
             * } else {
             * if (matice[i][j] != matice[j][i]) {
             * symvaleu = false;
             * if (matice[i][j] * matice[j][i] <= 0) {
             * symstructure = false;
             * break outerloop;
             * }
             * }
             * }
             * }
             * }
             * --------------------------------------------
             */
    
            outerloop: 
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < x; j++) {
                    //System.out.println(x);
                    if (i == j) {
                        break;
                    } else {
                        if (matice[i][j] != matice[j][i]) {
                            symvaleu = false;
                            if (matice[i][j] * matice[j][i] <= 0) {
                                symstructure = false;
                                break outerloop;
                            }
                        }
                    }
                }
                x++;
            }

            if (symvaleu == true) {
                System.out.println("\nMatice je symetricka hodnotami\n");
            } else {
                if (symstructure == true) {
                    System.out.println("\nMatice je symetricka strukturou\n");
                }
            }
            if (symvaleu == false && symstructure == false) {
                System.out.println("\nMatice je nesymetricka\n");
            }
        }
    }
}
