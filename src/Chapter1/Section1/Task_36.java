package Chapter1.Section1;
import edu.princeton.cs.algs4.StdRandom;
//15.01.2022
//Ex. 1.1.36
public class Task_36 {
    public static void main(String[] args) {
        System.out.println("-- Task 1.1.36 --");
        if(args.length < 2) {
            System.out.println("Input 2 int values in command prompt.");
            System.out.println("For example: 5 10000\n");
            System.out.println("Main -> Edit configurations -> Program Arguments -> Your input");
            System.exit(0);
        }
        int M = Integer.parseInt(args[0]); //arr.length
        int N = Integer.parseInt(args[1]);
        int[][] positions = new int[M][M];
        double[] arr = new double[M];
        for (int i = 0; i < N; i++) {
            initializeArray(arr);
            shuffle(arr);
            for (int j = 0; j < M; j++) {
                positions[(int) arr[j]][j]++;
            }
        }
        for (int i = 0; i < positions.length; i++) {
            System.out.printf("%2d:  ", i);
            for (int j = 0; j < positions[0].length; j++) {
                System.out.printf("%d\t", positions[i][j]);
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    public static void shuffle(double[] a) {
        int M = a.length;
        for (int i = 0; i < M; i++) {
            int r = i + StdRandom.uniform(M - i);
            double temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    public static void initializeArray(double[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
    }
}
