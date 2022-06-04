package Chapter1.Section1;

/**
 * Ex. 1.1.10 <br>
 * 12.01.2022
 * @author xairaven
 */
public class Task_10 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.1.10 --");
        System.out.println("""
                Error variant:
                int[] a;
                for (int i = 0; i < 10; i++)
                    a[i] = i * i;
                
                It does not allocate memory for a[] with new.
                This code results in a variable a might not have been initialized compile-time error.
                
                How it should to be:
                int[] a = new int[10];
                for (int i = 0; i < 10; i++)
                    a[i] = i * i;
                    
                Array a:
                [0, 1, 4, 9, 16, 25, 36, 49, 64, 81]
                """);
    }
}
