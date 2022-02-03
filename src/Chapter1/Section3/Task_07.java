package Chapter1.Section3;
import java.util.Iterator;
//03.02.2022
//Ex. 1.3.7
public class Task_07 {
    public static void main() {
        System.out.println("-- Task 1.3.7 --");
        StackEx137<Integer> stack = new StackEx137<>();
        for(int i = 0; i < 10; i++) {
            stack.push(i);
        }
        System.out.println("Before peek()");
        for(int i : stack) System.out.printf("%d ", i);

        System.out.printf("\nPeek = %d\n", stack.peek());

        System.out.println("After peek()");
        for(int i : stack) System.out.printf("%d ", i);
        System.out.print("\n\n");
    }
}

class StackEx137<Item> implements Iterable<Item> {
    private Node first;
    private int size;

    private class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public Item peek() {
        if (isEmpty()) {
            return null;
        }
        return first.item;
    }

    public void push(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Item can't be null");
        }
        Node newNode = new Node();
        newNode.item = item;
        newNode.next = first;
        first = newNode;
        size++;
    }

    public Item pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack underflow");
        }
        Item item = first.item;
        first = first.next;
        size--;
        return item;
    }

    public Iterator<Item> iterator() {
        return new StackIterator();
    }

    private class StackIterator implements Iterator<Item> {
        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}
