package hu.petrik.javabevezeto;
import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;

public class Feladat8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.println("Adjon meg egy számot (0 - fej, 1 - írás): ");
        double userNumber = sc.nextDouble();

        double randomNum = Math.random() * 2;
        if (randomNum == 0){
            out.println("A kapott oldal fej.");
            if (userNumber == 1){
                out.println("Sajnos nem nyert, játsszon mégegyszer");
            }
            else{
                out.println("Gratulálok ön nyert.");
            }
        }
        else if (randomNum == 1){
            out.println("A kapott oldal írás.");
            if (userNumber == 0){
                out.println("Sajnos nem nyert, játsszon mégegyszer");
            }
            else{
                out.println("Gratulálok ön nyert.");
            }
        }
    }
}
