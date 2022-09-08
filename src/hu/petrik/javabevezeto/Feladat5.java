package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem adja meg a téglalap 'a' oldalát: ");
        double a = sc.nextDouble();
        System.out.println("Kérem adja meg a téglalap 'b' oldalát: ");
        double b = Double.parseDouble(sc.nextLine().replace(',', '.'));
        System.out.println("Kérem adja meg, hogy mit szeretne kiszámítani (K - kerület, T - terület): ");
        String muvelet = sc.next();

        if (muvelet.equals("K")){
            double kerulet = 2 * (a+b);
            System.out.printf("A téglalap területe %.2f cm", kerulet);
        } else if(muvelet.equals("T")){
            double terulet = a*b;
            System.out.printf("A téglalap területe %.2f cm^2", terulet);
        }else{
            System.out.println("Hibás műveletet adott meg.");
        }

        if (a == b){
            System.out.println("A megadott téglalap egy négyzet.");
        }
    }
}
