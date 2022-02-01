package Chapter1.Section3;

//02.02.2022
//Ex. 1.3.1
public class Task_01 {
    public static void main() {
        System.out.println("-- Task 1.3.1 --");
        FixedCapacityStackOfStrings stack = new FixedCapacityStackOfStrings(3);
        System.out.printf("Full stack? Answer: %b, Expected: false\n", stack.isFull());
        stack.push("a");
        stack.push("b");
        stack.push("c");
        System.out.printf("Full stack? Answer: %b, Expected: true", stack.isFull());
        System.out.print("\n\n");
    }
}

class FixedCapacityStackOfStrings {
    private String[] a;
    private int n;

    public FixedCapacityStackOfStrings(int cap) {
        a = new String[cap];
    }

    public void push(String item) {
        a[n++] = item;
    }

    public String pop() {
        return a[--n];
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    public boolean isFull() {
        return n == a.length;
    }
}
