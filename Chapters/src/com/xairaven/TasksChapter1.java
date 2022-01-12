package com.xairaven;
import edu.princeton.cs.introcs.*;
import java.util.Arrays;

public class TasksChapter1 {
    public void task1_1_1() { //11.01.2021
        System.out.println("-- Task 1.1.1 --");
        System.out.println((0 + 15) / 2);
        System.out.println(2.0e-6 * 100000000.1);
        System.out.println(true && false || true && true);
        System.out.print("\n\n");
    }

    public void task1_1_2() {
        System.out.println("-- Task 1.1.2 --");
        System.out.println((1 + 2.236) / 2);
        System.out.println(1 + 2 + 3 + 4.0);
        System.out.println(4.1 > 4);
        System.out.println(1 + 2 + "3");
        System.out.print("\n\n");
    }

    public void task1_1_3(String[] args) {
        System.out.println("-- Task 1.1.3 --");
        if (args.length == 3) {
            if(args[0].equals(args[1]) && args[1].equals(args[2])) {
                System.out.println("Equals");
            } else {
                System.out.println("Doesn't equals");
            }
        } else {
            System.out.println("Number of args != 3");
        }
        System.out.print("\n\n");
    }

    public void task1_1_4() {
        System.out.println("-- Task 1.1.4 --");
        System.out.println("if (a>b) then c < 0\n\t\tKey word then is not part of construction IF");
        System.out.println("a > b { c = 0; }\n\t\tMissing IF");
        System.out.println("(a > b) c = 0;\n\t\tMissing IF");
        System.out.println("(a > b) c = 0 else b = 0;\n\t\tMissing IF");
        System.out.print("\n\n");
    }

    public void task1_1_5(double x, double y) {
        System.out.println("-- Task 1.1.5 --");
        if ((x >= 0 && x <=1) && (y >= 0 && y <= 1)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        System.out.print("\n\n");
    }

    public void task1_1_6() {
        System.out.println("-- Task 1.1.6 --");
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
        System.out.print("\n\n");
    }

    public void task1_1_7() {
        System.out.println("-- Task 1.1.7 --");
        System.out.print("\ta)");
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > .001) {
            t = (9.0 / t + t) / 2.0;
        }
        StdOut.printf("\t%.5f\n", t);
        System.out.print("\tb)");
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        StdOut.printf("\t%d\n", sum);
        System.out.print("\tc)");/*
        int sum = 0;
        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < N; j++) {
                sum++;
            }
        }
        StdOut.printf("\t%d\n", sum);*/
        StdOut.printf("\tError.");
        System.out.print("\n\n");
    }

    public void task1_1_8() {
        System.out.println("-- Task 1.1.8 --");
        System.out.print("\ta)\t");
        System.out.print('b');
        System.out.print("\n\tb)\t");
        System.out.print('b' + 'c');
        System.out.print("\n\tc)\t");
        System.out.print((char) ('a' + 4));
        System.out.print("\n\n");
    }

    public void task1_1_9 (int N) {
        System.out.println("-- Task 1.1.8 --");
        String s = "";
        for (int n = N; n > 0; n /= 2) {
            s = (n % 2) + s;
        }
        System.out.println(s);
        System.out.print("\n\n");
    }

    public void task1_1_10() {
        System.out.println("-- Task 1.1.10 --");
        /*
        int[] a;
        for (int i = 0; i < 10; i++) {
            a[i] = i * i;
        }*/
        System.out.println("Variable a might not be initialised");
        System.out.print("\n\n");
    }

    public void task1_1_11(boolean[][] a) {
        System.out.println("-- Task 1.1.11 --");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j]) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");
    }

    public void task1_1_12() {
        System.out.println("-- Task 1.1.12 --");
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = 9 - i;
        }
        for(int i = 0; i < 10; i++) {
            a[i] = a[a[i]];
        }
        for (int i = 0; i < 10; i++) {
            System.out.printf("\t%d\n", a[i]);
        }
        System.out.print("\n\n");
    }

    public int[][] task1_1_13arr(int[][] arr) {
        int[][] arr_T = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr_T[i][j] = arr[j][i];
            }
        }
        return arr_T;
    }

    public void task1_1_13(int[][] arr) {
        System.out.println("-- Task 1.1.13 --");
        int[][] arr_1_1_13 = task1_1_13arr(arr);
        for (int i = 0; i < arr_1_1_13.length; i++) {
            for (int j = 0; j < arr_1_1_13[0].length; j++) {
                System.out.printf("%d\t", arr_1_1_13[i][j]);
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");
    }

    public int task1_1_14lg(int N) {
        int lg = 2;
        int x = 1;
        for(int i = 1; lg < N; i++) {
            lg *= 2;
            x++;
        }
        if (lg == N) {
            return x;
        } else {
            return x-1;
        }
    }

    public void task1_1_14(int N) {
        System.out.println("-- Task 1.1.14 --");
        System.out.println((task1_1_14lg(N)));
        System.out.print("\n\n");
    }

    public int[] task1_1_15_histogram(int[] a, int M) {
        int[] mArr = new int[M];
        Arrays.sort(a);
        for (int i = 0; i < a.length && i < M; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] == i) {
                    mArr[i]++;
                }
            }
        }
        return mArr;
    }

    public void task1_1_15(int[] arr, int M) {
        System.out.println("-- Task 1.1.15 --");
        int[] a = task1_1_15_histogram(arr, M);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d\t", a[i]);
        }
        System.out.print("\n\n");
    }

    public String task1_1_16_exR1(int n) {
        if (n <= 0) return "";
        return task1_1_16_exR1(n - 3) + n + task1_1_16_exR1(n-2) + n;
    }

    public void task1_1_16(int n) {
        System.out.println("-- Task 1.1.16 --");
        System.out.println(task1_1_16_exR1(n));
        System.out.print("\n\n");
    }

    public void task1_1_17() {
        /*
        public static String exR2(int n) {
            String s = exR2(n-3) + n + exR2(n-2) + n;
            if (n <= 0) return "";
            return s;
        }*/
        System.out.println("-- Task 1.1.17 --");
        System.out.println("Because of StackOverflow Error.");
        System.out.print("\n\n");
    }

    public int task1_1_18_mysteryPlus(int a, int b) {
        if (b == 0) return 0;
        if (b % 2 == 0) return task1_1_18_mysteryPlus(a + a, b / 2);
        return task1_1_18_mysteryPlus(a + a, b / 2) + a;
    }

    public int task1_1_18_mysteryMul(int a, int b) {
        if (b == 0) return 1;
        if (b % 2 == 0) return task1_1_18_mysteryMul(a * a, b / 2);
        return task1_1_18_mysteryMul(a * a, b / 2) * a;
    }

    public void task1_1_18() {
        System.out.println("-- Task 1.1.18 --");
        System.out.printf("(+) mystery(2, 25) = %d\n", task1_1_18_mysteryPlus(2, 25));
        System.out.printf("(+) mystery(3, 11) = %d\n", task1_1_18_mysteryPlus(3, 11));
        System.out.printf("(*) mystery(2, 25) = %d\n", task1_1_18_mysteryMul(2, 25));
        System.out.printf("(*) mystery(3, 11) = %d\n", task1_1_18_mysteryMul(3, 11));
        System.out.print("\n\n");
    }
}
