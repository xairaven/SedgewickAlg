package Chapter1.Section4;
import  java.util.Arrays;

/**
 * Ex. 1.4.17 <br>
 * 14.06.2022
 * @author xairaven
 */
public class Task_17 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.4.17 --");

        double[] a = {-5.2, 9.4, 20, -10, 21.1, 40, 50, -20};
        System.out.println("Array: " + Arrays.toString(a));
        System.out.println("Farthest pair: " + Arrays.toString(farthestPair(a)));
    }

    private static double[] farthestPair(double[] a) {
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;

        for (double num : a) {
            if (num < min) min = num;

            if (num > max) max = num;
        }

        return new double[]{min, max};
    }
}

/*
Result example:
Array: [-5.2, 9.4, 20.0, -10.0, 21.1, 40.0, 50.0, -20.0]
Farthest pair: [-20.0, 50.0]
 */