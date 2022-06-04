package Chapter1.Section1;

/**
 * Ex. 1.1.20 <br>
 * 12.01.2022
 * @author xairaven
 */
public class Task_20 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.1.20 --");
        System.out.printf("ln(%d!) = %.4f\n", 5, lnOfFactorial(5));
        System.out.printf("ln(%d!) = %.4f\n", 10, lnOfFactorial(10));
        System.out.printf("ln(%d!) = %.4f\n", 15, lnOfFactorial(15));
    }

    private static double lnOfFactorial(int N) {
        if (N < 1) throw new IllegalArgumentException("N must be nonnegative");
        if (N == 1) return 0;
        return lnOfFactorial(N - 1) + Math.log(N);
    }
}

/*
Result:
ln(5!) = 4,7875
ln(10!) = 15,1044
ln(15!) = 27,8993
 */
