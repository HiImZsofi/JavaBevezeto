package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem adja meg a háromszög 'a' oldalát: ");
        double a = sc.nextDouble();
        System.out.println("Kérem adja meg a háromszög 'b' oldalát: ");
        double b = sc.nextDouble();
        System.out.println("Kérem adja meg a háromszög 'c' oldalát: ");
        double c = sc.nextDouble();

        if ((a+b > c) && (a+c > b) && (c+b > a)) {
            double k = a+b+c;
            System.out.printf("A háromszög kerülete:" + k);
        } else {
            System.out.println("Hibás adatok.");
        }
    }
}
