package Chapter1.Section3.Structures;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * For ex. 1.3.32 <br>
 * 10.06.2022
 * @author xairaven
 */
public class Steque<Item> implements Iterable<Item> {
    private Node first;
    private Node last;
    private int size;

    private class Node {
        Item item;
        Node next;

        public Node(Item item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void enqueue(Item item) {
        if (item == null) throw new IllegalArgumentException("item can't be null");

        Node oldLast = last;
        last = new Node(item, null);

        if (isEmpty()) first = last;
        else oldLast.next = last;

        size++;
    }

    public void push(Item item) {
        if (item == null) throw new IllegalArgumentException("Item can't be null");
        first = new Node(item, first);
        if (isEmpty()) last = first;
        size++;
    }

    public Item pop() {
        if (isEmpty()) throw new NoSuchElementException("steque is empty");

        Item item = first.item;
        first = first.next;
        size--;
        if (isEmpty()) last = null;
        return item;
    }

    public Item peek() {
        return first.item;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "[]";

        var sb = new StringBuilder();
        sb.append('[');
        for (Node x = first; x != null; x = x.next) {
            sb.append(x.item);
            if ((x.next) != null) sb.append(", ");
        }
        sb.append(']');

        return sb.toString();
    }

    @Override
    public Iterator<Item> iterator() {
        return new StequeIterator();
    }

    private class StequeIterator implements Iterator<Item> {
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
