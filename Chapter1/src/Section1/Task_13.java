package Section1;
//12.01.2021
//Ex. 1.1.13
public class Task_13 {
    public static void main(int[][] arr) {
        System.out.println("-- Task 1.1.13 --");
        int[][] resultArr = matrixTranspose(arr);
        for (int i = 0; i < resultArr.length; i++) {
            for (int j = 0; j < resultArr[0].length; j++) {
                System.out.printf("%d\t", resultArr[i][j]);
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");
    }

    public static int[][] matrixTranspose(int[][] arr) {
        int[][] arr_T = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr_T[i][j] = arr[j][i];
            }
        }
        return arr_T;
    }
}
