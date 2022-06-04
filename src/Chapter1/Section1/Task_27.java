package Chapter1.Section1;

/**
 * Ex. 1.1.27 <br>
 * 14.01.2022
 * @author xairaven
 */
public class Task_27 {
    static int calls;

    public static void main(String[] args) {
        System.out.println("-- Exercise 1.1.27 --");
        //binomial(100, 50, 0.25);
        System.out.printf("For binomial(100, 50, 0.25) the estimate is around %s calls\n", "5_000_000_000");
        System.out.println("But, this can be faster\nBinomial(100, 50, 0.25) = " +
                binomialEnhancedStart(100, 50, 0.25));
    }

    private static double binomial(int N, int k, double p) {
        calls++;
        if (N == 0 && k == 0) return 1.0;
        if (N < 0 || k < 0) return 0.0;
        return (1.0 - p)*binomial(N-1, k, p) + p*binomial(N-1, k-1, p);
    }

    private static double binomialEnhancedStart(int N, int k, double p) {
        double[][] arr = new double[N + 1][k + 1];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = -1;
            }
        }
        return binomialEnhanced(arr, N, k, p);
    }

    private static double binomialEnhanced(double[][] arr, int N, int k, double p) {
        if ((N == 0) && (k == 0)) return 1.0;
        if ((N < 0) || (k < 0)) return 0.0;
        if (arr[N][k] == -1) {
            arr[N][k] = (1 - p) * binomialEnhanced(arr, N - 1, k, p) + p * binomialEnhanced(arr, N - 1, k - 1, p);
        }
        return arr[N][k];
    }
}

/*
Result:
For binomial(100, 50, 0.25) the estimate is around 5_000_000_000 calls
But, this can be faster
Binomial(100, 50, 0.25) = 4.507310875086383E-8
 */
