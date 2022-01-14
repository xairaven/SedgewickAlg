package Chapter1.Section1;
//12.01.2022
//Ex. 1.1.9
public class Task_09 {
    public static void main(int N) {
        System.out.println("-- Task 1.1.9 --");
        String s = "";
        for (int n = N; n > 0; n /= 2) {
            s = (n % 2) + s;
        }
        System.out.println(s);
        System.out.print("\n\n");
    }
}
