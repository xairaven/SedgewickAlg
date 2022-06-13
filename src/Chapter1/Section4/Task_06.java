package Chapter1.Section4;

/**
 * Ex. 1.4.6 <br>
 * 13.06.2022
 * @author xairaven
 */
public class Task_06 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.4.6 --");
        System.out.println("""
                a) 2N (geometric sum approximates to ~2N)
                - for N = 1_000_000_000 result is 1_999_999_987
                b) N
                - for N = 1_000_000_000 result is 1_073_741_823
                c) NlogN
                - for N = 1_000_000_000 result is 30_000_000_000
                """);
        //a();
        //b();
        //c();
    }

    private static void a() {
        int N = 1_000_000_000;
        int sum = 0;
        for (int n = N; n > 0; n /= 2) {
            for (int i = 0; i < n; i++) {
                sum++;
            }
        }
        System.out.println("a) " + sum);
    }

    private static void b() {
        int N = 1_000_000_000;
        int sum = 0;
        for (int i = 1; i < N; i *= 2) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        System.out.println("b) " + sum);
    }

    private static void c() {
        int N = 1_000_000_000;
        long sum = 0;
        for (long i = 1; i < N; i *= 2) {
            for (long j = 0; j < N; j++) {
                sum++;
            }
        }
        System.out.println("c) " + sum);
    }
}

/*
Result example:
a) 1999999987
b) 1073741823
c) 30000000000
 */