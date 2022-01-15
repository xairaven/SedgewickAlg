package Chapter1.Section1;
//15.01.2022
//Ex. 1.1.33
public class Task_33 {
    public static void main() {
        double[] X = {5, 6, 7};
        double[] Y = {1, 2, 3};
        System.out.printf("Inner product of X(5, 6, 7) and Y(1, 2, 3) is %.0f\n", Matrix.dot(X, Y));
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
        double[][] resultMatrixMultiplication = Matrix.mult(A, B);
        System.out.println("Result of multiplication A and B is:");
        for (int i = 0; i < resultMatrixMultiplication.length; i++) {
            for (int j = 0; j < resultMatrixMultiplication[0].length; j++) {
                System.out.printf("%.1f\t", resultMatrixMultiplication[i][j]);
            }
            System.out.println();
        }
        System.out.println("Transposed matrix B:");
        double[][] transposedMatrix = Matrix.transpose(B);
        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[0].length; j++) {
                System.out.printf("%.1f\t", transposedMatrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("Result of multiplication A and X is:");
        double[] AX = Matrix.mult(A, X);
        for (int i = 0; i < AX.length; i++) {
            System.out.printf("%.1f\t", AX[i]);
        }
        System.out.println("\nResult of multiplication Y and B is:");
        double[] YB = Matrix.mult(Y, B);
        for (int i = 0; i < YB.length; i++) {
            System.out.printf("%.1f\t", YB[i]);
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
        double[][] resultMatrix = new double[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                double multiplication = 0;
                for (int k = 0; k < a[0].length; k++) {
                    multiplication += a[i][k] * b[k][j];
                }
                resultMatrix[i][j] = multiplication;
            }
        }
        return resultMatrix;
    }

    public static double[][] transpose(double[][] a) {
        double[][] transposeMatrix = new double[a[0].length][a.length];
        for(int i = 0; i < a[0].length; i++) {
            for(int j = 0; j < a.length; j++) {
                transposeMatrix[i][j] = a[j][i];
            }
        }
        return transposeMatrix;
    }

    public static double[] mult(double[][] a, double[] x) {
        if(a[0].length != x.length) return null;
        double[]resultMatrix = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < x.length; j++) {
                double multiplication = 0;
                for (int k = 0; k < a[0].length; k++) {
                    multiplication += a[i][k] * x[k];
                }
                resultMatrix[i] = multiplication;
            }
        }
        return resultMatrix;
    }

    public static double[] mult(double[] y, double[][] a) {
        if(y.length != a.length) return null;
        double[] resultMatrix = new double[a[0].length];
        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                double multiplication = 0;
                for (int k = 0; k < y.length; k++) {
                    multiplication += y[k] * a[k][j];
                }
                resultMatrix[j] = multiplication;
            }
        }
        return resultMatrix;
    }
}
