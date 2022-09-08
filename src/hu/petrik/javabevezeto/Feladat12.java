package hu.petrik.javabevezeto;
import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;

public class Feladat12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        double ketszaz = 0;
        double szaz = 0;
        double otven = 0;
        double husz = 0;
        double tiz = 0;
        double ot = 0;
        double userNum = 0;
        do {
            out.println("Adjon meg egy összeget 1 és 1000 forint között."); //ez a kód nem működik, nem lép be az ifekbe
            userNum = sc.nextDouble();
        }while(userNum > 1000 || userNum < 0);
        if (userNum % 5 == 0){
            if (userNum % 200 == 0){
                while(userNum % 200 == 0){
                    ketszaz++;
                }
            }
            else if (userNum % 100 == 0){
                while(userNum % 100 == 0){
                    szaz++;
                }
            }
            else if (userNum % 50 == 0){
                while(userNum % 50 == 0){
                    otven++;
                }
            }
            else if (userNum % 20 == 0){
                while(userNum % 20 == 0){
                    husz++;
                }
            }
            else if (userNum % 10 == 0){
                while(userNum % 10 == 0){
                    tiz++;
                }
            }
            else if (userNum % 5 == 0){
                while(userNum % 5 == 0){
                    ot++;
                }

        } else {
                out.println("Rossz adat, ilyen összeget nem lehet kirakni érmékből.");
            }
        }
        out.printf("%.0f kétszázas, %.0f százas, %.0f ötvenes, %.0f húszas, %.0f tizes, %.0f ötös,", ketszaz, szaz, otven, husz, tiz, ot);
    }
}
