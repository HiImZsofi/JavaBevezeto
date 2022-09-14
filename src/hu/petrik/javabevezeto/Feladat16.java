package hu.petrik.javabevezeto;
import java.util.Scanner;

import static java.lang.System.*;

public class Feladat16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(in);

        int[] intarray = new int[5];
        int szam = 0;
        int szamok = 0;
        while(szamok < 5){
            out.println("Adja meg a számot:");
            szam = Integer.parseInt(sc.nextLine());
            intarray[szamok] = szam;
            szamok++;
        }
        for (int i = 0; i < intarray.length; i++) {
            out.println(intarray[i]);
        }

       /* out.println("Adja meg a számokat: ");
        int szam1 = Integer.parseInt(sc.nextLine());
        int szam2 = Integer.parseInt(sc.nextLine());
        int szam3 = Integer.parseInt(sc.nextLine());
        int szam4 = Integer.parseInt(sc.nextLine());
        int szam5 = Integer.parseInt(sc.nextLine());*/

    }
}
