package Chapter1.Section4;
import  edu.princeton.cs.algs4.In;
import  java.util.Arrays;

/**
 * Ex. 1.4.14 <br>
 * 14.06.2022
 * @author xairaven
 */
public class Task_14 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.4.14 --");

        if (args.length < 1) throw new IllegalArgumentException("you have to input at least 1 arg");

        In in = new In(args[0]);
        int[] a = in.readAllInts();
        int count = count(a);
        System.out.println(count);
    }

    private static int count (int[] a) {
        Arrays.sort(a);

        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                for (int k = j + 1; k < a.length; k++) {
                    int key = -1 * (a[i] + a[j] + a[k]);

                    int keyLeftID = rank(key, a, 0, a.length - 1, true);
                    if (keyLeftID == -1) continue;

                    int keyRightID = rank(key, a, 0, a.length - 1, false);

                    if (keyLeftID < k + 1 && keyRightID >= k + 1) {
                        keyRightID = k + 1;
                    } else if (keyLeftID < k + 1) {
                        continue;
                    }

                    count += keyRightID - keyLeftID + 1;
                }
            }
        }
        return count;
    }

    private static int rank(int key, int[] a, int lo, int hi, boolean searchLow) {
        if (lo > hi) return -1;

        int mid = lo + (hi - lo) / 2;

        if (a[mid] > key) return rank(key, a, lo, mid - 1, searchLow);
        else if (a[mid] < key) return rank(key, a, mid + 1, hi, searchLow);
        else {
            int lower;

            if (searchLow) {
                lower = rank(key, a, lo, mid - 1, true);
            } else {
                lower = rank(key, a, mid + 1, hi, false);
            }

            return (lower != -1) ? lower : mid;
        }
    }
}



/*
Input example (command prompt):
resources/1Kints.txt

Result example:
13654
 */