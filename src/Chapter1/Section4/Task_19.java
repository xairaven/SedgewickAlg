package Chapter1.Section4;
import  java.util.Arrays;

/**
 * Ex. 1.4.19 <br>
 * 15.06.2022
 * @author xairaven
 */
public class Task_19 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.4.19 --");
        int[][] matrix = {
                {5, 90, 3, 10},
                {4,  1, -7, 15},
                {7, -1, -8, 19},
                {12, 8, 13, 99}
        };
        System.out.println("Array: " + Arrays.deepToString(matrix));
        System.out.println("Local minimum indexes (i, j): " + Arrays.toString(localMinimumMatrix(matrix)));
    }

    private static int[] localMinimumMatrix(int[][] m) {
        if (m == null)               throw new IllegalArgumentException("matrix can't be null");
        if (m.length != m[0].length) throw new IllegalArgumentException("matrix must be quadratic");

        if (m.length == 1) return new int[]{0, 0};
        if (m.length == 2) {
            if (m[0][0] < m[0][1] && m[0][0] < m[1][0]) {
                return new int[]{0, 0};
            } else if (m[0][1] < m[0][0] && m[0][1] < m[1][1]) {
                return new int[]{0, 1};
            } else if (m[1][0] < m[0][0] && m[1][0] < m[1][1]) {
                return new int[]{1, 0};
            } else return new int[]{1, 1};
        }

        return localMinimumMatrix(m, 0, m.length - 1, 0, m[0].length - 1);
    }

    private static int[] localMinimumMatrix(int[][] m, int fRow, int eRow, int fCol, int eCol) {
        if (fRow == eRow && fCol == eCol) return new int[]{fRow, fCol};

        int min = m[fRow][fCol];
        int minRow = fRow;
        int minCol = fCol;

        int midRow = fRow + (eRow - fRow) / 2;
        int midCol = fCol + (eCol - fCol) / 2;

        // rows
        for (int i = fCol; i <= eCol; i++) {
            if (m[fRow][i] < min) {
                min = m[fRow][i];
                minRow = fRow;
                minCol = i;
            }

            if (m[eRow][i] < min) {
                min = m[eRow][i];
                minRow = eRow;
                minCol = i;
            }
        }

        // cols
        for (int i = fRow; i <= eRow; i++) {
            if (m[i][fCol] < min) {
                min = m[i][fCol];
                minRow = i;
                minCol = fCol;
            }

            if (m[i][eCol] < min) {
                min = m[i][eCol];
                minRow = i;
                minCol = eCol;
            }
        }


        // center row
        for (int i = fCol; i <= eCol; i++) {
            if (m[midRow][i] < min) {
                min = m[midRow][i];
                minRow = midRow;
                minCol = i;
            }
        }

        // center col
        for (int i = fRow; i <= eRow; i++) {
            if (m[i][midCol] < min) {
                min = m[i][midCol];
                minRow = i;
                minCol = midCol;
            }
        }

        // recurse
        if (minRow - 1 >= 0 && m[minRow][minCol] > m[minRow - 1][minCol]) {
            if (minRow - 1 <= midRow) eRow = midRow;
            else                      fRow = midRow;

            if (minCol <= midCol) eCol = midCol;
            else                  fCol = midCol;

            return localMinimumMatrix(m, fRow, eRow, fCol, eCol);
        } else if (minRow + 1 < m.length && m[minRow][minCol] > m[minRow + 1][minCol]) {
            if (minRow + 1 <= midRow) eRow = midRow;
            else                      fRow = midRow;

            if (minCol <= midCol) eCol = midCol;
            else                  fCol = midCol;

            return localMinimumMatrix(m, fRow, eRow, fCol, eCol);
        } else if (minCol - 1 >= 0 && m[minRow][minCol] > m[minRow][minCol - 1]) {
            if (minRow <= midRow) eRow = midRow;
            else                  fRow = midRow;

            if (minCol - 1 <= midCol) eCol = midCol;
            else                      fCol = midCol;

            return localMinimumMatrix(m, fRow, eRow, fCol, eCol);
        } else if (minCol + 1 < m[0].length && m[minRow][minCol] > m[minRow][minCol + 1]) {
            if (minRow <= midRow) eRow = midRow;
            else                  fRow = midRow;

            if (minCol + 1 <= midCol) eCol = midCol;
            else                      fCol = midCol;

            return localMinimumMatrix(m, fRow, eRow, fCol, eCol);
        } else {
            return new int[]{minRow, minCol};
        }
    }
}

/*
Result example:
Array: [[5, 90, 3, 10], [4, 1, -7, 15], [7, -1, -8, 19], [12, 8, 13, 99]]
Local minimum indexes (i, j): [2, 2]
 */