package Chapter1.Section1;
import java.util.Arrays;

/**
 * Ex. 1.1.15 <br>
 * 12.01.2022
 * @author xairaven
 */
public class Task_15 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.1.15 --");
        int[] arr = {1, 1, 2, 3, 1, 2, 3, 5, 5};
        int M = 6;

        int[] histogram = histogram(arr, M);
        System.out.println(Arrays.toString(histogram));
    }

    private static int[] histogram(int[] a, int M) {
        int[] histogram = new int[M];
        for (int number : a) {
            if (number < M) {
                histogram[number]++;
            }
        }

        return histogram;
    }
}

/*
Initial array:
1 1 2 3 1 2 3 5 5
M = 6

Histogram:
0 3 2 2 0 2
 */