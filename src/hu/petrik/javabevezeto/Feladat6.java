package hu.petrik.javabevezeto;
import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;

public class Feladat6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.println("Kérem adja meg a pontszámot: ");
        double score = sc.nextDouble();

        if(score < 43)
        {
            out.println("Elégtelen");
        }
        else if(score > 42 && score < 58){
            out.println("Elégséges");
        }
        else if(score > 57 && score < 73){
            out.println("Közepes");
        }
        else if(score > 72 && score < 88){
            out.println("Jó");
        }
        else if(score > 87){
            out.println("Jeles");
        }
    }
}
