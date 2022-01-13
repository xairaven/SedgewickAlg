package Section1;
//12.01.2022
//Ex. 1.1.11
public class Task_11 {
    public static void main() {
        boolean[][] a = {
                {true, false, true, true},
                {true, true, true, true},
                {false, false, true, true},
                {true, false, false, true}
        };
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
}
