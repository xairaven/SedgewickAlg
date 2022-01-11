package com.xairaven;

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
}
