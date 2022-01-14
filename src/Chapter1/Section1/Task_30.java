package Chapter1.Section1;
//14.01.2022
//Ex. 1.1.30
public class Task_30 {
    public static void main(int N) {
        System.out.println("-- Task 1.1.30 --");
        boolean[][] arr = new boolean[N][N];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = (Euclid(i, j) == 1) && !((i == 0 && j == 1) || (i == 1 && j == 0));
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.printf("%b ", arr[i][j]);
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");
    }

    public static int Euclid(int p, int q) {
        if (q == 0) return p;
        int r = p % q;
        return Euclid(q, r);
    }
}
