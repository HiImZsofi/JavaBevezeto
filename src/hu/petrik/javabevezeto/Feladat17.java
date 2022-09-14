package hu.petrik.javabevezeto;
import static java.lang.System.*;

public class Feladat17 {
    public static void main(String[] args) {
        double[] array1 = new double[5];
        double[] array2 = new double[5];
        double index1 = 0;
        double index2 = 0;
        double[] array3 = new double[3];

        for (int i = 0; i < array1.length; i++) {
            array1[i]=Math.floor((Math.random()*100)+1);
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i]=Math.floor((Math.random()*100)+1);
        }

        for (int i = 0; i < array1.length; i++) {
            index1 = array1[i];
            for (int j = 0; j < array2.length; j++) {
                index2 = array2[j];
            }
            for (int j = 0; j < array3.length; j++) {
                array3[j] = index1 + index2;
                out.println(array3[i]);
            }
        }
    }
}
