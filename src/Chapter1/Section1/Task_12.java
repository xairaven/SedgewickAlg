package Chapter1.Section1;

/**
 * Ex. 1.1.12 <br>
 * 12.01.2022
 * @author xairaven
 */
public class Task_12 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.1.12 --");
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = 9 - i;
        }
        for(int i = 0; i < 10; i++) {
            a[i] = a[a[i]];
        }
        for (int i = 0; i < 10; i++) {
            //System.out.println(i) - typo ?
            System.out.println(a[i]);
        }
    }
}

/*
Result:
0
1
2
3
4
4
3
2
1
0
 */
