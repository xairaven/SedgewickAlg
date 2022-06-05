package Chapter1.Section1;

/**
 * Ex. 1.1.33 <br>
 * 15.01.2022
 * @author xairaven
 */
public class Task_33 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.1.33 --");
        double[] X = {5, 6, 7};
        double[] Y = {1, 2, 3};
        System.out.printf("Inner product of X(5, 6, 7) and Y(1, 2, 3) is %.0f\n\n", Matrix.dot(X, Y));
        double[][] A = {
                {1, 3, 2},
                {3, 4, 4},
                {5, 6, 7},
        };
        double[][] B = {
                {2, 2},
                {3, 4},
                {5, 6}
        };

        System.out.println("Result of multiplication A and B is:");
        double[][] matrix = Matrix.mult(A, B);
        assert matrix != null;
        for (double[] rows : matrix) {
            for (double num : rows) {
                System.out.printf("%.1f\t", num);
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Transposed matrix B:");
        matrix = Matrix.transpose(B);
        for (double[] rows : matrix) {
            for (double num : rows) {
                System.out.printf("%.1f\t", num);
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Result of multiplication A and X is:");
        double[] AX = Matrix.mult(A, X);
        assert AX != null;
        for (double num : AX) {
            System.out.printf("%.1f\t", num);
        }

        System.out.println("\n");

        System.out.println("Result of multiplication Y and B is:");
        double[] YB = Matrix.mult(Y, B);
        assert YB != null;
        for (double num : YB) {
            System.out.printf("%.1f\t", num);
        }
    }
}

class Matrix {
    public static double dot(double[] x, double[] y) {
        if (x.length != y.length) return -1;
        double innerProduct = 0;
        for (int i = 0; i < x.length; i++) {
            innerProduct += x[i]*y[i];
        }
        return innerProduct;
    }

    public static double[][] mult(double[][] a, double[][] b) {
        if(a[0].length != b.length) return null;
        double[][] matrix = new double[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                double expression = 0;
                for (int k = 0; k < a[0].length; k++) {
                    expression += a[i][k] * b[k][j];
                }
                matrix[i][j] = expression;
            }
        }
        return matrix;
    }

    public static double[][] transpose(double[][] a) {
        double[][] matrix = new double[a[0].length][a.length];
        for(int i = 0; i < a[0].length; i++) {
            for(int j = 0; j < a.length; j++) {
                matrix[i][j] = a[j][i];
            }
        }
        return matrix;
    }

    public static double[] mult(double[][] a, double[] x) {
        if(a[0].length != x.length) return null;
        double[] matrix = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < x.length; j++) {
                double expression = 0;
                for (int k = 0; k < a[0].length; k++) {
                    expression += a[i][k] * x[k];
                }
                matrix[i] = expression;
            }
        }
        return matrix;
    }

    public static double[] mult(double[] y, double[][] a) {
        if(y.length != a.length) return null;
        double[] matrix = new double[a[0].length];
        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                double expression = 0;
                for (int k = 0; k < y.length; k++) {
                    expression += y[k] * a[k][j];
                }
                matrix[j] = expression;
            }
        }
        return matrix;
    }
}

/*
Input:
X = 5 6 7

Y = 1 2 3

A = 1 3 2
    3 4 4
    5 6 7

B = 2 2
    3 4
    5 6

Result:
Inner product of X(5, 6, 7) and Y(1, 2, 3) is 38

Result of multiplication A and B is:
21,0	26,0
38,0	46,0
63,0	76,0

Transposed matrix B:
2,0	3,0	5,0
2,0	4,0	6,0

Result of multiplication A and X is:
37,0	67,0	110,0

Result of multiplication Y and B is:
23,0	28,0
 */