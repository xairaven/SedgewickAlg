package com.xairaven;
import edu.princeton.cs.introcs.*;

public class Tasks {
    public void task111() { //11.01.2021
        System.out.println("-- Task 1.1.1 --");
        System.out.println((0 + 15) / 2);
        System.out.println(2.0e-6 * 100000000.1);
        System.out.println(true && false || true && true);
        System.out.print("\n\n");
    }

    public void task112() {
        System.out.println("-- Task 1.1.2 --");
        System.out.println((1 + 2.236) / 2);
        System.out.println(1 + 2 + 3 + 4.0);
        System.out.println(4.1 > 4);
        System.out.println(1 + 2 + "3");
        System.out.print("\n\n");
    }

    public void task113(String[] args) {
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

    public void task114() {
        System.out.println("-- Task 1.1.4 --");
        System.out.println("if (a>b) then c < 0\n\t\tKey word then is not part of construction IF");
        System.out.println("a > b { c = 0; }\n\t\tMissing IF");
        System.out.println("(a > b) c = 0;\n\t\tMissing IF");
        System.out.println("(a > b) c = 0 else b = 0;\n\t\tMissing IF");
        System.out.print("\n\n");
    }

    public void task115(double x, double y) {
        System.out.println("-- Task 1.1.5 --");
        if ((x >= 0 && x <=1) && (y >= 0 && y <= 1)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        System.out.print("\n\n");
    }

    public void task116() {
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

    public void task117() {
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

    public void task118() {
        System.out.println("-- Task 1.1.8 --");
        System.out.print("\ta)\t");
        System.out.print('b');
        System.out.print("\n\tb)\t");
        System.out.print('b' + 'c');
        System.out.print("\n\tc)\t");
        System.out.print((char) ('a' + 4));
        System.out.print("\n\n");
    }

    public void task119 (int N) {
        System.out.println("-- Task 1.1.8 --");
        String s = "";
        for (int n = N; n > 0; n /= 2) {
            s = (n % 2) + s;
        }
        System.out.println(s);
        System.out.print("\n\n");
    }

    public void task1110() {
        System.out.println("-- Task 1.1.10 --");
        /*
        int[] a;
        for (int i = 0; i < 10; i++) {
            a[i] = i * i;
        }*/
        System.out.println("Variable a might not be initialised");
        System.out.print("\n\n");
    }
}
