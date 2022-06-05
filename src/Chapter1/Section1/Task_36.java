package Chapter1.Section1;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Ex. 1.1.36 <br>
 * 15.01.2022
 * @author xairaven
 */
public class Task_36 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.1.36 --");
        if(args.length != 2) throw new IllegalArgumentException("must input 2 args");

        int M = Integer.parseInt(args[0]); // arr.length
        int N = Integer.parseInt(args[1]); // shuffles

        int[][] positions = new int[M][M];
        double[] arr = new double[M];
        for (int i = 0; i < N; i++) {
            initializeArray(arr);
            shuffle(arr);
            for (int j = 0; j < M; j++) {
                positions[(int) arr[j]][j]++;
            }
        }

        showArray(positions);
    }

    private static void shuffle(double[] a) {
        int M = a.length;
        for (int i = 0; i < M; i++) {
            int r = i + StdRandom.uniform(M - i);
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
 0:  2010	1925	2044	1970	2051
 1:  1973	2013	1992	2032	1990
 2:  1999	2036	1990	1988	1987
 3:  2012	2042	1971	2001	1974
 4:  2006	1984	2003	2009	1998
*/
