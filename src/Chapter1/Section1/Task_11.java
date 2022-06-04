package Chapter1.Section1;

/**
 * Ex. 1.1.11 <br>
 * 12.01.2022
 * @author xairaven
 */
public class Task_11 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.1.11 --");

        boolean[][] arr = {
                {true,  false,  true,   true},
                {true,  true,   true,   true},
                {false, false,  true,   true},
                {true,  false,  false,  true}
        };
        printArray(arr);
    }

    private static void printArray(boolean[][] arr) {
        System.out.print("   ");
        int max = 0;
        for (boolean[] rows : arr) {
            if (rows.length > max) max = rows.length;
        }
        for (int i = 1; i <= max; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d: ", i+1);
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}

/*
Result:
   1 2 3 4
1: *   * *
2: * * * *
3:     * *
4: *     *
 */
