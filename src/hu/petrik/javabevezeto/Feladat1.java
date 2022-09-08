package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adja meg a medence átmérőjét: ");
        double atmero = sc.nextDouble();

        System.out.print("Kérem adja meg a medence magasságát: ");
        double magassag = sc.nextDouble();
        double sugar = atmero/2;

        double alapTerulet = sugar * sugar*Math.PI;
        double terfogat = alapTerulet * magassag;

        System.out.printf("A medence térfogata %f köbméter", terfogat);

    }
}
