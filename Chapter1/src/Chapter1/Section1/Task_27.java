package Chapter1.Section1;
//14.01.2022
//Ex. 1.1.27
public class Task_27 {
    public static void main() {
        System.out.println(binomialEnhancedStart(100, 50, 0.5));
    }

    public static double binomial(int N, int k, double p) {
        if (N == 0 && k == 0) return 1.0;
        if (N < 0 || k < 0) return 0.0;
        return (1.0 - p)*binomial(N-1, k, p) + p*binomial(N-1, k-1, p);
    }

    public static double binomialEnhancedStart(int N, int k, double p) {
        double[][] arr = new double[N + 1][k + 1];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = -1;
            }
        }
        return binomialEnhanced(arr, N, k, p);
    }

    public static double binomialEnhanced(double[][] arr, int N, int k, double p) {
        if ((N == 0) && (k == 0)) return 1.0;
        if ((N < 0) || (k < 0)) return 0.0;
        if (arr[N][k] == -1) {
            arr[N][k] = (1 - p) * binomialEnhanced(arr, N - 1, k, p) + p * binomialEnhanced(arr, N - 1, k - 1, p);
        }
        return arr[N][k];
    }

}
