package Chapter1.Section1;
//12.01.2022
//Ex. 1.1.20
public class Task_20 {
    public static void main(int N) {
        System.out.println("-- Task 1.1.20 --");
        System.out.printf("ln(%d!) = %.4f", N, lnFact(N));
        System.out.print("\n\n");
    }

    public static double lnFact(int N) {
        if (N == 1) return 0;
        return lnFact(N - 1) + Math.log(N);
    }
}
