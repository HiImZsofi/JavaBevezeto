package hu.petrik.javabevezeto;
import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;

public class Feladat3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.println("Kérem adjon meg egy egész számot: ");
        double mainNumber = sc.nextDouble();

        double kicsi = Math.floor(mainNumber); //kisebb szám
        double nagy = Math.ceil(mainNumber); //nagyobb szám
        double kerekit = Math.round(mainNumber); //melyik számhoz van közelebb
        double tort = mainNumber - kicsi;

        out.printf("A megadott szám a %f és a %f egész számok között van, és ezek közül a %f számhoz van közelebb",
                kicsi, nagy, kerekit);
        out.printf("\nA szám egész része: %.0f", kicsi);
        out.printf("\nA szám törtrésze: %f", tort);
    }
}
