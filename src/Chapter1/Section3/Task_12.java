package Chapter1.Section3;
import java.util.Iterator;
//10.02.2022
//Ex. 1.3.12
public class Task_12 {
    public static void main() {
        System.out.println("-- Task 1.3.12 --");
        StackEx12<String> stack = new StackEx12<>();
        stack.push("1st");
        stack.push("2nd");
        stack.push("3rd");
        StackEx12<String> copy = StackEx12.copy(stack);
        System.out.println("Start stack:");
        for (String s : copy) {
            System.out.println(s);
        }
        System.out.println("Copy:");
        for (String s : copy) {
            System.out.println(s);
        }
        System.out.print("\n\n");
    }
}

class StackEx12<Item> implements Iterable<Item> {
    private Node first;
    private int size;

    private class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static StackEx12<String> copy(StackEx12<String> stack) {
        StackEx12<String> temp = new StackEx12<>();
        StackEx12<String> copy = new StackEx12<>();
        for (String s : stack) {
            temp.push(s);
        }
        for (String s : temp) {
            copy.push(s);
        }
        return copy;
    }

    public int size() {
        return size;
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

    public Item peek() {
        if (isEmpty()) {
            return null;
        }
        return first.item;
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

