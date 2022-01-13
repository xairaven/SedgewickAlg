package Section1;
//12.01.2021
//Ex. 1.1.14
public class Task_14 {
    public static void main(int N) {
        System.out.println("-- Task 1.1.14 --");
        System.out.println((lg(N)));
        System.out.print("\n\n");
    }

    public static int lg(int N) {
        int lg = 2;
        int x = 1;
        for(int i = 1; lg < N; i++) {
            lg *= 2;
            x++;
        }
        if (lg == N) {
            return x;
        } else {
            return x-1;
        }
    }
}
