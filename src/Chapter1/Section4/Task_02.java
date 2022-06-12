package Chapter1.Section4;
import  edu.princeton.cs.algs4.In;
import  java.math.BigInteger;

/**
 * Ex. 1.4.2 <br>
 * 11.06.2022
 * @author xairaven
 */
public class Task_02 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.4.2 --");

        if (args.length < 1) throw new IllegalArgumentException("you have to input at least 1 arg");

        In in = new In(args[0]);
        int[] arr = in.readAllInts();
        System.out.println(threeSum(arr));
    }

    public static int threeSum(int[] a) {
        // Count triples that sum to 0.
        BigInteger bi;
        int N = a.length;
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    bi = BigInteger.valueOf(a[i]);
                    bi = bi.add(BigInteger.valueOf(a[j]));
                    bi = bi.add(BigInteger.valueOf(a[k]));

                    if (bi.intValue() == 0) cnt++;
                }
            }
        }
        return cnt;
    }
}

/*
Input example (command prompt):
resources/1Mints.txt
 */
