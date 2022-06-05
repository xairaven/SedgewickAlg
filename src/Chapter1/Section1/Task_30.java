package Chapter1.Section1;

/**
 * Ex. 1.1.30 <br>
 * 14.01.2022
 * @author xairaven
 */
public class Task_30 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.1.30 --");
        boolean[][] arr = createArray(5);
        showArray(arr);
    }

    private static int Euclid(int p, int q) {
        if (q == 0) return p;
        int r = p % q;
        return Euclid(q, r);
    }

    private static boolean[][] createArray(int N) {
        boolean[][] arr = new boolean[N][N];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = (Euclid(i, j) == 1) && !((i == 0 && j == 1) || (i == 1 && j == 0));
            }
        }
        return arr;
    }

    private static void showArray(boolean[][] arr) {
        for (boolean[] rows : arr) {
            for (boolean bool : rows) {
                System.out.printf("%b\t", bool);
            }
            System.out.println();
        }
    }
}
