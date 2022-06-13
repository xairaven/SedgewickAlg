package Chapter1.Section4;

/**
 * Ex. 1.4.7 <br>
 * 13.06.2022
 * @author xairaven
 */
public class Task_07 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.4.7 --");
        System.out.println("""
                With a cost model that counts arithmetic operations (and comparisons) involving input numbers,
                the main "if" from ThreeSum involves 4 operations instead of 1.
                                
                if (a[i] + a[j] + a[k] == 0)
                                
                1) One operation for the if check;
                2) one operation to sum a[i] and a[j];
                3) one operation to sum the result with a[k]
                4) one operation to compare the result with 0.
                                
                The main "if" has a frequency of 4(N^3/6 - N^2/2 + N/3) instead of (N^3/6 - N^2/2 + N/3)
                                
                And the grand total becomes:
                t1(4*N^3/6 - 4N^2/2 + 4N/3) + t2(N^2/2 - N/2) + t3*N + t4
                                
                Tilde approximation: ~(4t1/6)N^3
                Order of growth: N^3
                """);
    }
}
