package hu.petrik.javabevezeto;
import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;

public class Feladat11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.println("Adjon meg egy számot: ");
        double userNumb = sc.nextDouble();

        double osszeg = 0;

        for (int i = 0; i < userNumb; i++) {
            osszeg += i;
        }
        out.printf("A számok összege: %.0f", osszeg);
    }
}
