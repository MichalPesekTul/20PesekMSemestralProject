package semestralka;

import java.util.Scanner;

public class Zapoctak {
    public static void main(String[] args) {

        int userSelected;

        do {
            userSelected = MenuData();
            switch (userSelected) {
                case 1:
                    System.out.println("Vanocni Uloha!\n");
                    VanocniUloha.main(args);
                    userSelected = MenuData();
                case 2:
                    System.out.println("Semestralni Prace Cislo 20.!\n");
                    SymetrickaMatice.main(args);
                    userSelected = MenuData();
                case 3:
                    System.out.println("GoodBye!");
                    break;
                default:
                    System.out.println("Pick from the menu!\n");
            }
        } while (userSelected > 3);
    }

    public static int MenuData() {
        int selection;
        Scanner mp = new Scanner(System.in);
        System.out.println("============================");
        System.out.println("|      MENU SELECTION      |");
        System.out.println("============================");
        System.out.println("| Options:                 |");
        System.out.println("|   1. Vanocni Uloha       |");
        System.out.println("|   2. Semestralni Prace   |");
        System.out.println("|   3. Exit                |");
        System.out.println("============================");

        System.out.print("Your selected option is: ");
        selection = mp.nextInt();
        System.out.println();
        return selection;
    }

}
