package hu.petrik.javabevezeto;
import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;

public class Feladat7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(in);
        out.println("Adjon meg egy hónapot: ");
        double month = sc.nextDouble();

        if(month < 3 || month == 12)
        {
            out.println("Tél van");
        }
        else if(month > 2 && month < 6)
        {
            out.println("Tavasz van");
        }
        else if(month > 5 && month < 9)
        {
            out.println("Nyár van");
        }
        else if(month > 8 && month < 12)
        {
            out.println("Ősz van");
        }
    }
}
