package Chapter1.Section1;
import edu.princeton.cs.algs4.StdRandom;
import java.util.Arrays;
//15.01.2022
//Ex. 1.1.39
public class Task_39 {
    public static void main(String[] args) {
        System.out.println("-- Task 1.1.39 --");
        if(args.length < 1) {
            System.out.println("Input 1 int value in command prompt.");
            System.out.println("For example: 5\n");
            System.out.println("Main -> Edit configurations -> Program Arguments -> Your input");
            System.exit(0);
        }
        int T = Integer.parseInt(args[0]);
        int N = 0;
        int[][] resultArray = new int[T][4];
        for (int i = 0; i < T; i++) {
            for (int x = 3; x <= 6; x++) {
                N = (int) Math.pow(10, x);
                int[] arr1 = randomArray(N);
                int[] arr2 = randomArray(N);
                Arrays.sort(arr1); Arrays.sort(arr2);
                int min = 100_000; int max = 1_000_000;
                for(int j = 0; j < arr1.length; j++) {
                    if(binarySearch(arr1[j], arr2, 0, arr2.length - 1) != -1) {
                        resultArray[i][x - 3]++;
                    }
                }
            }
        }
        double sum = 0;
        for (int i = 0; i < resultArray.length; i++) {
            System.out.printf("%5d:   ", i+1);
            for (int j = 0; j < resultArray[0].length; j++) {
                System.out.printf("%d\t", resultArray[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < resultArray[0].length; i++) {
            double avg = 0;
            for (int j = 0; j < resultArray.length; j++) {
                avg += resultArray[j][i];
            }
            avg /= resultArray.length;
            System.out.printf("AVG 10^%d: %.3f\n", i+3, avg);
        }
        System.out.println("\n");
    }

    public static int binarySearch(int key, int[] arr, int lo, int hi) {
        if (arr == null) throw new IllegalArgumentException();
        if (lo <= hi) {
            int middle = lo + (hi - lo) / 2;
            if (key < arr[middle]) return binarySearch(key, arr, lo, middle - 1);
            else if (key > arr[middle]) return binarySearch(key, arr, middle + 1, hi);
            else return middle;
        } else {
            return -1;
        }
    }

    public static int[] randomArray(int N) {
        int[] array = new int[N];
        for(int i = 0; i < N; i++) {
            array[i] = (int) StdRandom.uniform(100_000, 1_000_000);
        }
        return array;
    }
}
