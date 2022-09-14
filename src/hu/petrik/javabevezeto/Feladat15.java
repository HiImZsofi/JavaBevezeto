package hu.petrik.javabevezeto;

import static java.lang.System.*;

public class Feladat15 {
    public static void main(String[] args) {
        double[] arr = new double[25];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(Math.random()*100)+1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(i % 2 == 1)
            {
                out.printf("%.2f\n",Math.pow(arr[i],2));
            }
        }

    }
}
