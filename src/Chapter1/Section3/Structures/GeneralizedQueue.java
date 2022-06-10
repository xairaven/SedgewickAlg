package Chapter1.Section3.Structures;
import  java.util.Iterator;

/**
 * For ex. 1.3.38 <br>
 * 10.06.2022
 * @author xairaven
 */
public class GeneralizedQueue<Item> implements Iterable<Item> {
    private Node first;
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

    public void insert(Item x) {
        if (x == null) throw new IllegalArgumentException("illegal argument to insert()");

        first = new Node(x, first);
        size++;
    }

    public Item delete(int k) {
        if (isEmpty()) throw new IllegalArgumentException("Queue is empty");
        if (k <= 0 || size < k) throw new IllegalArgumentException("given illegal index to delete()");

        Item item;
        int index = size - k;

        if (index == 0) {
            item = first.item;
            first = first.next;
            size--;
            return item;
        }

        Node x = first;
        for (int i = 0; i <= index; i++) {
            if (i + 1 == index) {
                item = (x.next).item;
                x.next = (x.next).next;
                size--;
                return item;
            }
            x = x.next;
        }

        return null;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "[]";

        var sb = new StringBuilder();

        sb.append('[');
        for (Node current = first; current != null; current = current.next) {
            sb.append(current.item);
            if (current.next != null) sb.append(", ");
        }
        sb.append(']');

        return sb.toString();
    }

    @Override
    public Iterator<Item> iterator() {
        return new GeneralizedQueueIterator();
    }

    private class GeneralizedQueueIterator implements Iterator<Item> {
        Node current = first;

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
