package Chapter1.Section1;
import edu.princeton.cs.algs4.StdOut;
//12.01.2022
//Ex. 1.1.19
public class Task_19 {
    public static void main() {
        System.out.println("-- Task 1.1.19 --");
        /*
        for (int N = 0; N < 100; N++) {
            StdOut.println(N + " " + task1_1_19_F(N));
        }*/
        long first = 0 , second = 1;
        long num; long temp;
        for (int N = 2; N < 100; N++) {
            num = first + second;
            temp = second;
            first = temp;
            second = num;
            StdOut.println(N + " " + num);
        }
        System.out.print("\n\n");
    }

    public static long F(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N-1) + F(N-2);
    }
}
