package Chapter1.Section3.Structures;

/**
 * For ex. 1.3.1 <br>
 * 02.02.2022
 * @author xairaven
 */
public class FixedCapacityStackOfStrings {
    private String[] arr;
    private int size;

    public FixedCapacityStackOfStrings(int capacity) {
        if (capacity < 0) throw new IllegalArgumentException("capacity of stack must be nonnegative");
        arr = new String[capacity];
    }

    public void push(String str) {
        arr[size++] = str;
    }

    public String pop() {
        String pop = arr[size];
        arr[size] = null;
        size--;
        return pop;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    // Ex. 1.3.1
    public boolean isFull() {
        return size == arr.length;
    }
}
