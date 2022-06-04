package Chapter1.Section1;

/**
 * Ex. 1.1.19 <br>
 * 12.01.2022
 * @author xairaven
 */
public class Task_19 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.1.19 --");
        //testF()
        for (int i = 0; i <= 90; i++) {
            long fib = Fibonacci(i);
            System.out.println(i + ": " + fib);
        }
    }

    private static long Fibonacci(int N) {
        if (N < 0) throw new IllegalArgumentException("N must be nonnegative");
        else if (N == 0) return 0;
        else if (N == 1) return 1;

        long[] arr = new long[N+1];
        arr[0] = 0;
        arr[1] = 1;
        return Fibonacci(N, arr);
    }

    private static long Fibonacci(int N, long[] arr) {
        if (N == 0) return arr[0];
        if (N == 1) return arr[1];

        for (int i = 2; i <= N; i++) {
            arr[i] = arr[i-2] + arr[i-1];
        }

        return arr[N];
    }

    private static void testF() {
        for (int i = 0; i < 100; i++) {
            long start = System.currentTimeMillis();
            long fib = F(i);
            long time = System.currentTimeMillis() - start;
            System.out.println(i + ": " + fib);
            if (time >= 3_600_000) {
                System.out.println("Largest value of N is: " + (i-1));
                break;
            }
        }
    }

    private static long F(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N-1) + F(N-2);
    }
}

/*
The largest value of N that takes less than 1 hour to compute is 57.

With enhanced method:
90: 2880067194370816120
less than ~1 second
 */