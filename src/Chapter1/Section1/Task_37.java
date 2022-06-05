package Chapter1.Section1;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Ex. 1.1.37 <br>
 * 15.01.2022
 * @author xairaven
 */
public class Task_37 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.1.37 --");
        if(args.length != 2) throw new IllegalArgumentException("must input 2 args");

        int M = Integer.parseInt(args[0]); // arr.length
        int N = Integer.parseInt(args[1]); // shuffles

        int[][] positions = new int[M][M];
        double[] arr = new double[M];
        for (int i = 0; i < N; i++) {
            initializeArray(arr);
            badShuffle(arr);
            for (int j = 0; j < M; j++) {
                positions[(int) arr[j]][j]++;
            }
        }

        showArray(positions);
    }

    private static void badShuffle(double[] a) {
        int M = a.length;
        for (int i = 0; i < M; i++) {
            int r = StdRandom.uniform(M);
            double temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    private static void initializeArray(double[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
    }

    private static void showArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%2d:  ", i);
            for (int j = 0; j < arr[0].length; j++) {
                System.out.printf("%d\t", arr[i][j]);
            }
            System.out.println();
        }
    }
}

/*
Main -> Edit configurations -> Program Arguments -> Your input
Example of input (command prompt):
5 10000

Example of result:
 0:  2073	1974	1974	1979	2000
 1:  2369	1860	1858	1925	1988
 2:  2079	2311	1690	1865	2055
 3:  1870	2025	2314	1868	1923
 4:  1609	1830	2164	2363	2034
*/