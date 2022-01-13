package Section1;
//12.01.2022
//Ex. 1.1.12
public class Task_12 {
    public static void main() {
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
}
