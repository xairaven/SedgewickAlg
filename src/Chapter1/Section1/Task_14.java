package Chapter1.Section1;

/**
 * Ex. 1.1.14 <br>
 * 12.01.2022
 * @author xairaven
 */
public class Task_14 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.1.14 --");
        System.out.println("Input: 2\nResult: " + lg(2) + "\n");
        System.out.println("Input: 10\nResult: " + lg(10) + "\n");
        System.out.println("Input: 88\nResult: " + lg(88) + "\n");
    }

    private static int lg(int N) {
        int lg = 0;
        while (N > 0) {
            lg++;
            N /= 2;
        }
        return lg - 1;
    }
}

/*
Input: 2
Result: 1

Input: 10
Result: 3

Input: 88
Result: 6
 */
