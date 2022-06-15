package Chapter1.Section4;
import  java.util.Scanner;

/**
 * Ex. 1.4.23 <br>
 * 15.06.2022
 * @author xairaven
 */
public class Task_23 {
    private static Scanner scanner;
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.4.23 --");

        scanner = new Scanner(System.in);
        System.out.println("Input N: ");
        int N = scanner.nextInt();

        rank(0, N, N);
    }

    private static void rank(double lo, double hi, double N) {
        boolean less = false;
        double mid = lo + (hi - lo) / 2;

        System.out.printf("Is that number %.2f? Yes : No\n", mid);
        String answer = scanner.next();
        if (answer.equals("Yes")) {
            System.out.printf("Result: %.2f", mid);
            return;
        } else {
            System.out.printf("Is that number less than %.2f? Yes : No\n", mid);
            less = (scanner.next().equals("Yes"));
        }

        if (less)  rank(lo, mid - (1 / (N*N)), N);
        else rank(mid + (1 / (N*N)), hi, N);
    }
}



/*
Result example:
Input N:
10
Is that number 5,00? Yes : No
No
Is that number less than 5,00? Yes : No
Yes
Is that number 2,50? Yes : No
No
Is that number less than 2,50? Yes : No
Yes
Is that number 1,24? Yes : No
No
Is that number less than 1,24? Yes : No
Yes
Is that number 0,62? Yes : No
No
Is that number less than 0,62? Yes : No
No
Is that number 0,93? Yes : No
No
Is that number less than 0,93? Yes : No
No
Is that number 1,09? Yes : No
No
Is that number less than 1,09? Yes : No
No
Is that number 1,16? Yes : No
No
Is that number less than 1,16? Yes : No
No
Is that number 1,20? Yes : No
Yes
Result: 1,20
 */
