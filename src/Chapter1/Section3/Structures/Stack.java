package Chapter1.Section3.Structures;
import java.util.Iterator;

/**
 * For exs. 1.3.7, 1.3.12, 1.3.42 <br>
 * Ex. 1.3.7: {@link #peek()} <br>
 * Ex. 1.3.12: {@link #copy()}, {@link #iterator()} <br>
 * Ex. 1.3.42: {@link #Stack(Stack)} <br>
 * Extended copy from my Algorithms-Data-Structures repo <br>
 * 03.02.2022
 * @author xairaven
 */
public class Stack<Item> implements Iterable<Item> {
    private Node first;
    private int size;

    private class Node {
        Item item;
        Node next;
    }

    public Stack() {}

    // Ex. 1.3.42
    public Stack(Stack<Item> s){
        this();

        Stack<Item> temp = new Stack<>();
        for (Item it : s) {
            temp.push(it);
        }
        for (Item it : temp) {
            this.push(it);
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // Ex. 1.3.12
    public Stack<Item> copy() {
        Stack<Item> temp = new Stack<>();
        Stack<Item> copy = new Stack<>();
        for (Item it : this) {
            temp.push(it);
        }
        for (Item it : temp) {
            copy.push(it);
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

    // Ex. 1.3.7
    public Item peek() {
        if (isEmpty()) {
            return null;
        }
        return first.item;
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();

        sb.append("[");
        for (Node x = first; x != null; x = x.next) {
            sb.append(x.item);
            if (x.next != null) sb.append(", ");
        }
        sb.append("]");

        return sb.toString();
    }

    // Ex. 1.3.12
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
