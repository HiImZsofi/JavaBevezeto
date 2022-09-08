package hu.petrik.javabevezeto;

import java.math.BigDecimal;
import java.util.Scanner;

public class Feladat2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem adja meg a terület szélességét méterben: ");
        double szeles = sc.nextDouble() * 100;

        System.out.println("Kérem adja meg a terület magasságát méterben: ");
        double magas = sc.nextDouble() * 100;

        double terulet = szeles * magas; //negyzetmeter
        double csempeterulet = 20 * 20; //negyzetcenti
        double teruletNeeded = Math.ceil((terulet / csempeterulet) * 1.1);

        System.out.printf("Ehhez a területhez %.0f csempe szükséges", teruletNeeded);

        //System.out.printf("Ehhez a területhez" + Math.round(teruletNeeded) + "csempe szükséges");
    }
}
