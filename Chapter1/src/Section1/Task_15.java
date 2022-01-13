package Section1;
import java.util.Arrays;
//12.01.2021
//Ex. 1.1.15
public class Task_15 {
    public static void main(int[] arr, int M) {
        System.out.println("-- Task 1.1.15 --");
        int[] a = histogram(arr, M);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d\t", a[i]);
        }
        System.out.print("\n\n");
    }

    public static int[] histogram(int[] a, int M) {
        int[] mArr = new int[M];
        Arrays.sort(a);
        for (int i = 0; i < a.length && i < M; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] == i) {
                    mArr[i]++;
                }
            }
        }
        return mArr;
    }
}
