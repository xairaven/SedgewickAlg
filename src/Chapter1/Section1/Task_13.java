package Chapter1.Section1;

/**
 * Ex. 1.1.13 <br>
 * 12.01.2022
 * @author xairaven
 */
public class Task_13 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.1.13 --");
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };
        int[][] transposedArr = matrixTranspose(arr);
        printMatrix(transposedArr);
    }

    private static int[][] matrixTranspose(int[][] arr) {
        int[][] transposedMatrix = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                transposedMatrix[i][j] = arr[j][i];
            }
        }
        return transposedMatrix;
    }

    private static void printMatrix(int[][] arr) {
        for (int[] rows : arr) {
            for (int number : rows) {
                System.out.printf("%d ", number);
            }
            System.out.println();
        }
    }
}

/*
Initial matrix (example):
1 2 3 4
5 6 7 8

Result:
1 5
2 6
3 7
4 8
 */
