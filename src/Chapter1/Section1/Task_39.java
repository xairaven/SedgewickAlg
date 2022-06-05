package Chapter1.Section1;
import java.util.Arrays;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Ex. 1.1.39 <br>
 * 15.01.2022
 * @author xairaven
 */
public class Task_39 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.1.39 --");
        if(args.length != 1) throw new IllegalArgumentException("must input 1 arg");

        int T = Integer.parseInt(args[0]);
        int[][] resultArray = experiment(T);

        for (int i = 0; i < resultArray.length; i++) {
            System.out.printf("%5d:   ", i + 1);
            for (int j = 0; j < resultArray[0].length; j++) {
                System.out.printf("%d\t", resultArray[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < resultArray[0].length; i++) {
            double avg = 0;
            for (int[] ints : resultArray) {
                avg += ints[i];
            }
            avg /= resultArray.length;
            System.out.printf("AVG 10^%d: %.3f\n", i+3, avg);
        }

    }

    private static int[][] experiment(int T) {
        int[] N = {1_000, 10_000, 100_000, 1_000_000};
        int[][] resultArray = new int[T][4];

        for (int i = 0; i < T; i++) {
            for (int j = 0; j < 4; j++){
                int[] arr1 = randomArray(N[j]);
                int[] arr2 = randomArray(N[j]);
                Arrays.sort(arr1);
                Arrays.sort(arr2);
                for (int value : arr1) {
                    if (binarySearch(value, arr2, 0, arr2.length - 1) != -1) {
                        resultArray[i][j]++;
                    }
                }
            }
        }
        return resultArray;
    }

    private static int binarySearch(int key, int[] arr, int lo, int hi) {
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

    private static int[] randomArray(int N) {
        int[] array = new int[N];
        for(int i = 0; i < N; i++) {
            array[i] = StdRandom.uniform(100_000, 1_000_000);
        }
        return array;
    }
}

/*
Input 1 int value in command prompt.
For example: 10
Main -> Edit configurations -> Program Arguments -> Your input

Result example for 10:

    1:   1	105	10421	670907
    2:   5	104	10635	669569
    3:   0	105	10603	669854
    4:   1	113	10455	670361
    5:   1	120	10410	671015
    6:   1	118	10482	670443
    7:   0	107	10858	671495
    8:   2	87	10566	669650
    9:   2	102	10419	670999
   10:   0	101	10785	670163

AVG 10^3: 1,300
AVG 10^4: 106,200
AVG 10^5: 10563,400
AVG 10^6: 670445,600
 */
