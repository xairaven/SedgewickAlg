package Chapter1.Section3;
import java.util.Arrays;
import java.util.Iterator;
//03.02.2022
//Ex. 1.3.8
public class Task_08 {
    public static void main() {
        System.out.println("-- Task 1.3.8 --");
        String str = "it was - the best - of times - - - it was - the - -";
        ResizingArrayStackOfStrings stack = new ResizingArrayStackOfStrings();
        String[] arr = str.split(" ");
        for (String item : arr) {
            if (!item.equals("-")) {
                stack.push(item);
            } else if (!stack.isEmpty()) {
                System.out.printf("%s ", stack.pop());
            }
        }
        System.out.printf("\nContains: %s\n", stack.toString());
        System.out.printf("(%d left on stack)", stack.size());
        System.out.print("\n\n");
    }
}

class ResizingArrayStackOfStrings implements Iterable<String> {
    private String[] items;
    private int n = 0;

    public ResizingArrayStackOfStrings() {
        items = new String[1];
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    private void resize(int max) {
        String[] temp = new String[max];

        for (int i = 0; i < n; i++) {
            temp[i] = items[i];
        }

        items = temp;
    }

    public void push(String item) {
        if (n == items.length) {
            resize(items.length * 2);
        }
        items[n++] = item;
    }

    public String pop() {
        String item = null;
        if (!isEmpty()) {
            item = items[--n];
        }

        if (!isEmpty()) {
            items[n] = null;
        }

        if (n > 0 && n == items.length / 4) {
            resize(items.length / 2);
        }

        return item;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }

    @Override
    public Iterator<String> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<String>{
        int index = n;

        @Override
        public boolean hasNext() {
            return index > 0;
        }

        @Override
        public String next() {
            return items[--index];
        }

        @Deprecated
        public void remove() {}
    }
}