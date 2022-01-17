package Chapter1.Section1;
import edu.princeton.cs.introcs.StdRandom;
//15.01.2022
//Ex. 1.1.37
public class Task_37 {
    public static void main(String[] args) {
        System.out.println("-- Task 1.1.37 --");
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
            badShuffle(arr);
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

    public static void badShuffle(double[] a) {
        int M = a.length;
        for (int i = 0; i < M; i++) {
            int r = StdRandom.uniform(M);
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
