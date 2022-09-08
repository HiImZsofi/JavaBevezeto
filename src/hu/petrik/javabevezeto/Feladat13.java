package hu.petrik.javabevezeto;
import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;

public class Feladat13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);

        double randomNum = Math.random() * 100 + 1;
        double userNum = 0;
        do {
            out.println("Adjon meg egy számot 1 és 100 között.");
            if (userNum > randomNum){
                out.println("A megadott szám nagyobb mint a random");
            }
            else if (randomNum > userNum){
                out.println("A megadott szám kisebb mint a random");
            }
        }while(userNum != randomNum); //Variable 'userNum' is not updated inside loop ??????
    }
}
