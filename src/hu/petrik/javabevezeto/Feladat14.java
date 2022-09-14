package hu.petrik.javabevezeto;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.*;

public class Feladat14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);

        out.print("Adj meg egy szöveget: ");
        String text = sc.nextLine();
        String choice = "asd";
        out.println("Nagy betűssé alakítás (n)");
        out.println("Kisbetűssé alakítás (k)");
        out.println("Hossz lekérdezése (h)");
        out.println("Összehasonlítás egy másik stringgel (c)");
        out.println("A string egy részének kiírása (i)");
        out.println("Kilépés (q)");
        while (!choice.toLowerCase().equals("q"))
        {
            out.print("Válassz egy opciót a zárójelben lévő karakter beírásával: ");
            choice = sc.nextLine();
            switch (choice.toLowerCase()) {
                case "a":
                    out.println(text.toUpperCase());
                    break;
                case "b":
                    out.println(text.toLowerCase());
                    break;
                case "c":
                    out.println(text.length());
                    break;
                case "d":
                    out.print("Adja meg a második szöveget: ");
                    String secondText = sc.nextLine();
                    int comapre = text.compareTo(secondText);
                    if (comapre < 0) {
                        out.println("Az első szöveg előrébb van az ABCben");
                    } else if (comapre > 0) {
                        out.println("A második szöveg előrébb van az ABCben");
                    } else {
                        out.println("A két szöveg megegyezik");
                    }
                    break;
                case "e":
                    out.print("Add meg, hogy hanyadik betűtől akarod kiíratni a szöveget: ");
                    int a = sc.nextInt();
                    out.print("Add meg, hogy hanyadik betűig akarod kiíratni a szöveget: ");
                    int b = sc.nextInt();
                    out.println(text.substring(a - 1, b - 1));
                    break;
            }
        }
        System.exit(0);
    }
}
