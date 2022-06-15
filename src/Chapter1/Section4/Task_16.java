package Chapter1.Section4;
import  java.util.Arrays;

/**
 * Ex. 1.4.16 <br>
 * 14.06.2022
 * @author xairaven
 */
public class Task_16 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.4.16 --");

        double[] a = {-5.2, 9.4, 20, -10, 21.1, 40, 50, -20};
        System.out.println("Array: " + Arrays.toString(a));
        System.out.println("Closest pair: " + Arrays.toString(closestPair(a)));
    }

    private static double[] closestPair(double[] a) {
        Arrays.sort(a);

        double diff = Double.POSITIVE_INFINITY;
        double[] pair = new double[2];

        for (int i = 0; i < a.length - 1; i++) {
            double sub = Math.abs(a[i] - a[i + 1]);
            if (sub < diff) {
                diff = sub;
                pair[0] = a[i];
                pair[1] = a[i + 1];
            }
        }
        return pair;
    }
}

/*
Result example:
Array: [-5.2, 9.4, 20.0, -10.0, 21.1, 40.0, 50.0, -20.0]
Closest pair: [20.0, 21.1]
 */
