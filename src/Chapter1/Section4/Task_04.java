package Chapter1.Section4;

/**
 * Ex. 1.4.4 <br>
 * 12.06.2022
 * @author xairaven
 */
public class Task_04 {
    public static void main(String[] args) {
        System.out.println("""
                *--------------------------------------------------------------------------------------*
                |                                -- Exercise 1.4.4 --                                  |
                *---------------------*------------------*------------------------*--------------------*
                | Statement in Block  |  Time in seconds |        Frequency       |    Total time      |
                |        D            |       t0         |    x(depends on input) |        t0x         |
                |        C            |       t1         |       N^2/2 - N/2      |  t1(N^2/2 - N/2)   |
                |        B            |       t2         |           N            |        t2(N)       |
                |        A            |       t3         |           1            |         t3         |
                |---------------------*------------------*------------------------*--------------------*
                | Grand total: (t1/2) N^2                                                              |
                |               + (-t1/2 + t2) N                                                       |
                |                 + t3 + t0x                                                           |
                | Tilde approximation: ~(t1/2) N^2 (assuming x is small)                               |
                | Order of growth: N^2                                                                 |
                *--------------------------------------------------------------------------------------*
                """);
    }

    private static int TwoSum(int[] a) {
        int n = a.length;
        int count = 0;                      // A
        for (int i = 0; i < n; i++) {       // B
            for (int j = i+1; j < n; j++) { // C
                if (a[i] + a[j] == 0) {
                    count++;                // D
                }
            }
        }
        return count;
    }
}
