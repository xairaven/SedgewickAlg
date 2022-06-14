package Chapter1.Section4.Structures;
import  java.util.Arrays;

/**
 * For ex. 1.4.11 <br>
 * 13.06.2022
 * @author xairaven
 */
public class StaticSETofInts {
    private int[] a;

    public StaticSETofInts(int[] keys) {
        a = new int[keys.length];
        for (int i = 0; i < keys.length; i++)
            a[i] = keys[i];
        Arrays.sort(a);
    }

    public boolean contains(int key) {
        return rank(key, a, 0, a.length - 1) != -1;
    }

    private static int rank(int key, int[] a, int lo, int hi) {
        if (lo > hi) return -1;

        int mid = lo + (hi - lo) / 2;

        if      (key < a[mid])  return rank(key, a, lo, mid - 1);
        else if (key > a[mid])  return rank(key, a, mid + 1, hi);
        else                    return mid;
    }

    // Ex. 1.4.11
    public int howMany(int key) {
        int indexFromRank = rank(key, a, 0, a.length - 1);

        if (indexFromRank == -1) return 0;

        int startIndex = indexFromRank;
        int endIndex = indexFromRank;

        // Find the smallest index of an element
        while (true) {
            if (startIndex - 1 < 0) break;
            int temp = rank(key, a, 0, startIndex - 1);

            if (temp != -1) startIndex = temp;
            else break;
        }

        // Find the highest index of an element
        while (true) {
            if (endIndex + 1 >= a.length) break;
            int temp = rank(key, a, endIndex + 1, a.length);

            if (temp != -1) endIndex = temp;
            else break;
        }

        return endIndex - startIndex + 1;
    }
}
